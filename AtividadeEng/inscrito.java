package AtividadeEng;

public class inscrito extends pessoa {
    private String login;
    private int totassistido;

    public inscrito(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.login = login;
        this.totassistido = 0;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotassistido() {
        return totassistido;
    }

    public void setTotassistido(int totassistido) {
        this.totassistido = totassistido;
    }

    @Override
    public String toString() {
        return "Inscritos {" + "Nome = " + nome + ", Idade = " + idade + ", Sexo = " + sexo + "\n Login = " + login + ", Total de aulas assitidas = " + totassistido + '}';
    }
    
}
