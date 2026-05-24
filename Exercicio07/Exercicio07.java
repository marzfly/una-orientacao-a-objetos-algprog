package orientacaoaobjetos.Exercicio07;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Double> valorTotalPorCliente = new HashMap<>();
        ArrayList<Pedido> pedidos = new ArrayList<>();
        //Pedido placeholder = new Pedido(3451, "Alicia", "X-Bacon", 13.45, "PREPARANDO");
        Random rand = new Random();

        System.out.println("BEM VINDO(a) À LANCHONETE DO BIRA \n");

        int opcao;
        String saida;
        int codigoItem;
        int numeroProcurado = 0;

        int numero;
        String nome;
        String pedido;
        double valor;
        String status;

        double valorTotal = 0;

        do{
            System.out.println("Escolha uma opção para prosseguir: ");
            System.out.println("1 - Cadastrar pedido");
            System.out.println("2 - Listar pedidos");
            System.out.println("3 - Atualizar status do pedido");
            System.out.println("4 - Buscar pedido pelo número");
            System.out.println("5 - Mostrar valor total do pedido");
            System.out.println("6 - Ver seu pedido");
            System.out.println("7 - Tabela de preços");
            System.out.println("0 - Sair");
            System.out.println("");

            opcao = sc.nextInt();
            sc.nextLine();

            switch(opcao){
                case 1:
                    System.out.println("== CADASTRAR PEDIDO ==");
                    valorTotal = 0;
                    numero = rand.nextInt(10000);
                    System.out.println("Digite seu nome: ");
                    nome = sc.nextLine();
                    System.out.println(nome + ", o número do seu pedido é: " + numero);

                    System.out.println("Digite SAIR para sair");
                    System.out.println("Digite qualquer outra coisa para continuar cadastrando seu pedido ou adicionar itens");
                    do{
                        System.out.println("Digite o código do produto (em caso de dúvidas consulte a tabela de preços)");
                        codigoItem = sc.nextInt();
                        sc.nextLine();

                        pedido = Pedido.nomeItem(codigoItem);
                        valor = Pedido.valorItem(codigoItem);
                        status = "PENDENTE";
                        pedidos.add(new Pedido(numero, nome, pedido, valor, status));
                        valorTotal += valor;
                        valorTotalPorCliente.put(numero, valorTotal);
                        
                        saida = sc.nextLine().toUpperCase();

                    }while(!saida.equals("SAIR"));
                    break;

                case 2:
                    System.out.println("== LISTAR PEDIDOS ==");
                    for(Pedido p : pedidos){
                        System.out.println(p);
                    }
                    break;

                case 3:
                    System.out.println("== ATUALIZAR STATUS DO PEDIDO ==");
                    System.out.println("Digite o número do pedido que você deseja atualizar");
                    numeroProcurado = sc.nextInt();
                    System.out.println("Digite o status do pedido");
                    System.out.println("1 - PENDENTE");
                    System.out.println("2 - PREPARANDO");
                    System.out.println("3 - FINALIZADO");
                    int opcaoStatus = sc.nextInt();
                    for (Pedido p : pedidos) {
                        if(p.getNumero() == numeroProcurado){
                            String novoStatus = Pedido.atualizarStatus(opcaoStatus);
                            p.setStatus(novoStatus);
                            System.out.println("Status do pedido " + p.getNumero() + " atualizado para " + p.getStatus());
                        }
                    }
                    break;

                case 4:
                    System.out.println("== BUSCAR PEDIDO PELO NÚMERO ==");
                    System.out.println("Digite o número do seu pedido");
                    System.out.println("Observação: caso queira um overview completo do pedido, busque 'ver seu pedido'");
                    /*numero = sc.nextInt();
                    System.out.println(pedidos.get(numero));*/
                    //aparentemente se eu fizer assim da erro
                    numeroProcurado = sc.nextInt();
                    sc.nextLine();
                    boolean encontrarPedidoPeloNumero = false;
                    for (Pedido p : pedidos) {
                        if(p.getNumero() == numeroProcurado){
                            System.out.println("Item(ns): " + p.getPedido() + " | Status: " + p.getStatus());
                        }
                    } 
                    break;

                case 5:
                    System.out.println("== MOSTRAR VALOR TOTAL DO PEDIDO ==");
                    System.out.println("Digite o número do seu pedido");
                    numero = sc.nextInt();
                    if(valorTotalPorCliente.containsKey(numero)){
                        System.out.println("Valor total: R$" + valorTotalPorCliente.get(numero));
                    } else {
                        System.out.println("Pedido não encontrado");
                    }
                    break;

                case 6:
                    numeroProcurado = 0;
                    System.out.println("== VER SEU PEDIDO ==");
                    System.out.print("Digite o número do seu pedido: ");
                    numeroProcurado = sc.nextInt();
                    boolean listarP = false;
                    for (Pedido p : pedidos) {
                        if(p.getNumero() == numeroProcurado){
                            if(!listarP){
                                System.out.println("Número: " + p.getNumero());
                                System.out.println("Nome do cliente: " + p.getNome());
                                System.out.println("Status: " + p.getStatus());
                            }
                            System.out.println("==== ITENS NO CARRINHO ====");
                            System.out.println("Pedido: " + p.getPedido());
                            System.out.println("Valor: " + p.getValor());
                            listarP = true;
                        }
                    }
                    System.out.println("Valor total: " + valorTotalPorCliente.get(numeroProcurado));
                    break;

                case 7:
                    System.out.println("== TABELA DE PREÇOS ==");
                    System.out.println("1. Hambúrguer Kids | R$10,90");
                    System.out.println("2. X-Bacon | R$13,45");
                    System.out.println("3. Nuggets - 10 unidades | R$7,75");
                    System.out.println("4. Porção de batata frita | R$15,00");
                    System.out.println("5. X-Tudo | R$23,55");
                    System.out.println("6. Macarrão na Chapa | R$25,70");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
        }while(opcao!=0);
        sc.close();
    }
}
