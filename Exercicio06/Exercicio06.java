package orientacaoaobjetos.Exercicio06;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(new Livro(1, "Conselho Estudantil", "rawrianz", true));
        livros.add(new Livro(2, "Quando a Guerra Acabar", "rawrianz", false));
        livros.add(new Livro(3, "Cão no Toco", "The Sims 4", true));
        livros.add(new Livro(4, "A Cobra Arco=Íris na Piscina", "Jaguatirica Verde", true));
        livros.add(new Livro(5, "O Amor que Não Nos Demos", "Pneu Azulado Irisado Silva", false));

        int count = 5;

        System.out.println("BIBLIOTECA PÚBLICA MUNICIPAL DE VILA DA JAGUATIRICA - MG");
        System.out.println("");

        int opcao = 0;

        int codigo;
        String titulo;
        String autor;
        boolean disponivel;

        boolean encontrado = false;
        boolean repetido = false;
        boolean selecionado = false;

        System.out.println("");

        do{
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Pegar livro emprestado");
            System.out.println("4 - Devolver livro");
            System.out.println("0 - Sair");
            System.out.println("");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Cadastrar livro \n");
                    System.out.println("Digite as seguintes informações para prosseguir com o cadastro da obra...");
                    System.out.print("Código: ");
                    codigo = sc.nextInt();
                    for(Livro livro : livros){
                        while(livro.getCodigo() == codigo){
                            System.out.println("Código já existe");
                            System.out.println("Digite o código correto, por favor");
                            codigo = sc.nextInt();
                        }
                    }

                    sc.nextLine();

                    System.out.print("Título: ");
                    titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    autor = sc.nextLine();
                    disponivel = true;

                    livros.add(new Livro(codigo, titulo, autor, disponivel));
                    
                    break;
            
                case 2:
                    System.out.println("Listar livros \n");
                    for(Livro livroListar : livros){
                        System.out.println(livroListar);
                    }
                    break;

                case 3:
                    codigo = 0;
                    System.out.println("EMPRÉSTIMO DE LIVROS");
                    System.out.println("Digite o código do livro que você deseja pegar emprestado");
                    codigo = sc.nextInt();
                    for(Livro livroSelecionado : livros){
                        if(livroSelecionado.getCodigo() == codigo) /*&& livroSelecionado.getDisponivel() == true)*/{
                            encontrado = true;
                            if(livroSelecionado.getDisponivel() == true){
                                livroSelecionado.emprestarLivro();
                            } else {
                                livroSelecionado.livroIndisponivel();
                            }
                            break;
                        }
                       /*  else {
                            System.out.println("Livro não encontrado");
                        }*/
                    }
                    if(!encontrado){
                        System.out.println("Livro não encontrado");
                    }
                    break;

                case 4:
                    codigo = 0;
                    System.out.println("DEVOLUÇÃO DE LIVROS");
                    System.out.println("Digite o código do livro que você deseja devolver");
                    codigo = sc.nextInt();
                    for(Livro livroSelecionado : livros){
                        if(livroSelecionado.getCodigo() == codigo){
                            selecionado = true;
                            if(livroSelecionado.getDisponivel() == false){
                                livroSelecionado.devolverLivro();
                            } else {
                                livroSelecionado.livroDisponivel();
                            }
                            break;
                        }
                        /*  else {
                            System.out.println("Livro não encontrado");
                        }*/
                    }
                    if(!selecionado){
                        System.out.println("Livro não encontrado");
                    }
                    break;

                default:
                    break;
            }
        }while(opcao != 0);
        sc.close();
    }
}
