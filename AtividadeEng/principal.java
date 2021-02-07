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


        System.out.println(v[0].toString());

    }    
}
