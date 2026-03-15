public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public Estoque() {
        this.qtdAtual = 0;
        this.qtdMinima = 0;
    }
    public Estoque(String nome, int qtdAtual, int qtdMinima) {
       this.nome = nome;
       setQtdAtual(qtdAtual);
       setQtdMinima(qtdMinima);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        if(qtdAtual >= 0) {
            this.qtdAtual = qtdAtual;
        }
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        if(qtdMinima >= 0) {
            this.qtdMinima = qtdMinima;
        }
    }
    public void repor(int qtd) {
        qtdAtual = qtdAtual + qtd;
    }
    public void darBaixa(int qtd) {
        if(qtdAtual - qtd >= 0) {
            qtdAtual = qtdAtual - qtd;
        }
    }
    public boolean precisaRepor() {
        if(qtdAtual <= qtdMinima) {
            return true;
        }
        else {
            return false;
        }
    }

    public String mostra(){
        return "Produto: " + nome + " | Qtd mínima: " + qtdMinima + " | Qtd atual: " + qtdAtual;
    }

}
