package nuggetradioativo;
import java.util.Scanner;
import java.util.ArrayList;

public class NuggetRadioativo {

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int contLista = 0;
        System.out.println("=== LISTA DE COMPRAS ===");
        System.out.println("Digite os itens que você deseja comprar");
        for(int i = 0; i < 5; i++){
            lista.add(sc.nextLine());
            contLista++;
        }
        System.out.println(lista);
        System.out.println("O total de itens é: " + contLista);
    }
    
}
