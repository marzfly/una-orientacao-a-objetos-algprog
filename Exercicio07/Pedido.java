package orientacaoaobjetos.Exercicio07;

public class Pedido {
    private int numero;
    private String nome;
    private String pedido;
    private double valor;
    private String status;

    //método construtor

    public Pedido(int numero, String nome, String pedido, double valor, String status){
        this.numero = numero;
        this.nome = nome;
        this.pedido = pedido;
        this.valor = valor;
        this.status = status;
    }

    //getters e setters
    /*agora eu tenho que parar e pensar em quais desses atributos precisam ter setters*/
    public int getNumero(){
        return numero;
    }

    public String getNome(){
        return nome;
    }

    public String getPedido(){
        return pedido;
    }

    public double getValor(){
        return valor;
    }

    public String getStatus(){
        return status;
    }

    //setters para nome, pedido, valor
    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public void setPedido(String novoPedido){
        this.pedido = novoPedido;
    }

    public void setValor(double novoValor){
        this.valor = novoValor;
    }
    public void setStatus(String novoStatus){
        this.status = novoStatus;
    }

    //alguns métodos do pedido (atualizar status, mostrar valor total)
    public static String atualizarStatus(int opcaoStatus){
        if(opcaoStatus == 1){
            return "PENDENTE";
        } else if (opcaoStatus == 2){
            return "PREPARANDO";
        } else if (opcaoStatus == 3){
            return "FINALIZADO";
        } else {
            return "Opção inválida!";
        }
    }

    public static double valorItem(int codigoItem){
        switch(codigoItem){
            case 1:
                return 10.9;
            case 2:
                return 13.45;
            case 3:
                return 7.75;
            case 4:
                return 15.0;
            case 5:
                return 23.55;
            case 6:
                return 25.7;
            default:
                return 0;
        }
    }

    public static String nomeItem(int codigoItem){
        switch(codigoItem){
            case 1:
                return "Hambúrguer Kids";
            case 2:
                return "X-Bacon";
            case 3:
                return "Nuggets - 10 unidades";
            case 4:
                return "Porção de batata frita";
            case 5:
                return "X-Tudo";
            case 6:
                return "Macarrão na Chapa";
            default:
                return "Outro";
        }
    }

    @Override //vocaloid yay
    public String toString(){
        return this.numero + " | " + this.nome + " | " + this.pedido + " | " + this.valor + " | " + this.status;
    }
}
