package orientacaoaobjetos;
import java.util.Scanner;
import java.util.HashMap;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("== SISTEMA DE CADASTRO DE ALUNOS ===");
        HashMap<Integer, String> alunos = new HashMap<>();
        System.out.println("\n");
        int saida = 0;
        int chave = 0;
        int matriculaInput;
        String nomeInput;

        System.out.println("Digite...");
        System.out.println("1 para sair");
        System.out.println("2 para cadastrar aluno");
        System.out.println("3 para buscar aluno");
        System.out.println("4 para remover aluno");
        System.out.println("5 para mostrar todos os alunos");

        do{
            System.out.println("\n");
            System.out.println("Escolha uma das opções acima para prosseguir");
            saida = sc.nextInt();
            System.out.println("\n");
            switch(saida){
                case 2:
                    System.out.println("Cadastrar aluno");
                    System.out.println("Insira a matrícula e o nome do aluno que voce deseja cadastrar");
                    
                    matriculaInput = sc.nextInt();

                    sc.nextLine(); //limpar o buffer para não pular o nome
                    nomeInput = sc.nextLine();

                    alunos.put(matriculaInput, nomeInput);

                    System.out.println("Aluno " + (alunos.size() + 1) + " cadastrado com sucesso.");
                    break;

                case 3:
                    chave = 0;
                    System.out.println("Buscar aluno");
                    System.out.println("Digite a matrícula do aluno que você deseja buscar");
                    chave = sc.nextInt();
                    if(alunos.containsKey(chave)){
                        System.out.println("Aluno encontrado");
                        System.out.println(alunos.get(chave));
                    } else {
                        System.out.println("Aluno não encontrado");
                    }
                    break;
                
                case 4:
                    chave = 0;
                    System.out.println("Remover aluno");
                    System.out.println("Digite a matrícula do aluno que você deseja remover");
                    chave = sc.nextInt();
                    if(alunos.containsKey(chave)){
                        alunos.remove(chave);
                        System.out.println("Aluno removido com sucesso");
                    } else {
                        System.out.println("Aluno não encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Exibir alunos");
                    for(Integer matricula : alunos.keySet()){
                        System.out.println("Matricula: " + matricula);
                        System.out.println("Nome do aluno: " + alunos.get(matricula));
                        System.out.println("=======");
                        System.out.println("\n");
                    }
            }
        }while(saida != 1);
        sc.close();
    }
}