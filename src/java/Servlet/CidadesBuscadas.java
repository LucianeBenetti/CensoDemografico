
package Servlet;

public class CidadesBuscadas {
    
    private String cidade;
    private String populacao;
    private String area;
    private String densidade;
    private String pib;

    public CidadesBuscadas(String cidade, String populacao, String area, String densidade, String pib) {
        this.cidade = cidade;
        this.populacao = populacao;
        this.area = area;
        this.densidade = densidade;
        this.pib = pib;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPopulacao() {
        return populacao;
    }

    public void setPopulacao(String populacao) {
        this.populacao = populacao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getDensidade() {
        return densidade;
    }

    public void setDensidade(String densidade) {
        this.densidade = densidade;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }
    
    
}
