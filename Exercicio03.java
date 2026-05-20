package nuggetradioativo;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class Exercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> nomes = new HashSet<>();
        System.out.println("Digite 5 nomes");
        for(int i = 0; i < 5; i++){
           nomes.add(sc.nextLine());
        }
        System.out.println(nomes);
    }
    
}
