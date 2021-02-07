package AtividadeEng;

public class principal {
    public static void main(String[] args) {
        video v[] = new video[3];
        v[0] = new video("Aula 01 de POO");
        v[1] = new video("Aula 03 de PHP");
        v[2] = new video("Aula 01 de Python");

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
