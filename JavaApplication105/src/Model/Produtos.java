package Model;


public class Produtos {
    private int idProduto;
    private String nome;
    private Double preco;
    private int idCategoria;
    private String Categoria;

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    private String validade;

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
<<<<<<< HEAD
    @Override
    public String toString() {
    return this.nome; // Mostra o nome no JComboBox
}
=======

    @Override
    public String toString() {
        return getNome();
    }
>>>>>>> 0a11f78d6df72764edfed304cbb6d3059c3c5196
    
     
}
