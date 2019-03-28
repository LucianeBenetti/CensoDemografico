package Classes;

public class Pessoas {

    private String login;
    private String senha;
    private int nivelAcesso;

    public Pessoas() {
    }

    public Pessoas(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(int nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }

    @Override
    public String toString() {
        return "Pessoas{" + "login=" + login + ", senha=" + senha + '}';
    }
    
}
