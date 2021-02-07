package projetojava;

public class projetopessoas {

    public static void main(String[] args) {
        pessoa p1[] = new pessoa[10];
        aluno p2[] = new aluno[10];
        professor p3[] = new professor[10];
        funcionario p4[] = new funcionario[10];
        
        p1[0] = new pessoa("Joao Augusto", 40, "M");
        p2[0] = new professor("Maria do Rosario", 52, "F", "Adminstração e Marketing", 3500.00);
    }
    
}