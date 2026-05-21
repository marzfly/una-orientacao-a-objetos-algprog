package orientacaoaobjetos;
import java.util.LinkedList;
import java.util.Queue;
public class Exercicio05 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Danielle");
        fila.add("Eduarda");
        fila.add("Mariana");
        fila.add("Thais");
        fila.add("Gabrielly");
        System.out.println("=== LANCHONETE DO GUGÃO ===");
        System.out.println(fila);
        System.out.println("");
        System.out.println("Próximo pedido: " + fila.peek());
        System.out.println("Atendendo...");
        String proxCliente = fila.poll();
        proxCliente = fila.poll();
        System.out.println("Próximos clientes:");
        System.out.println(fila);
    }
}
