public class Item {
    private String codigo;
    private String descricao;
    private int quantidadeComprada;
    private double precoItem;

    public Item(){
        this.codigo = "";
        this.descricao = "";
        this.quantidadeComprada = 0;
        this.precoItem = 0;
    }
    public Item(String codigo, String descricao, int quantidadeComprada, double precoItem){
        this.codigo = codigo;
        this.descricao = descricao;
        setQuantidadeComprada(quantidadeComprada);
        setPrecoItem(precoItem);
    }


    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        if (quantidadeComprada > 0) {
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem > 0) {
            this.precoItem = precoItem;
        }
    }

    public double getTotal(){
        return this.quantidadeComprada*this.precoItem;
    }
}


