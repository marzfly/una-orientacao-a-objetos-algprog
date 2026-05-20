package nuggetradioativo;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio02 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();
        double media = 0, soma = 0;
        System.out.println("=== SISTEMA DE NOTAS ===");
        System.out.println("Digite quatro notas");
        for(int i = 0; i < 4; i++){
            notas.add(sc.nextDouble());
            soma += notas.get(i);
        }
        media = soma / notas.size();
        if(media >= 7.0){
            System.out.println("A turma ficou com média maior ou igual a 7.0");
        } else {
            System.out.println("Não foi dessa vez!");
        }
        
    }
}
