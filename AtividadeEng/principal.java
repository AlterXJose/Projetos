package AtividadeEng;
import java.util.Scanner;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        
        video v[] = new video[3];       
        for (int i = 0; i < v.length; i++) {
            System.out.println("Crie uma aula de Programação: ");
            String str = t.nextLine();         
            v[i] = new video(str);
        }

        inscrito i[] = new inscrito[3];
        i[0] = new inscrito("Joao Vitor", 22, "M", "JoaoVitor10");
        i[1] = new inscrito("Ana Maria", 30, "F", "MariaA");
        i[2] = new inscrito("Pedro Silva", 35, "M", "JSilvaX");

        visualizacao w[] = new visualizacao[5];
        w[0] = new visualizacao(i[0], v[2]);
        w[0].avaliar();
        System.out.println(w[0].toString());
        w[1] = new visualizacao(i[0], v[1]);
        w[0].avaliar(87.0f);
        System.out.println(w[1].toString());
        
    }    
}
