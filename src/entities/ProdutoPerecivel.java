package entities;

public class ProdutoPerecivel extends Produto{
    private String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return  "Produto = " +
                "Nome = " + getNome() +
                "Preco = " + getPreco() +
                "Quantidade = " + getQuantidade() +
                "\n" +
                "ProdutoPerecivel{" +
                "dataValidade='" + dataValidade + '\'' +
                '}';
    }
}
