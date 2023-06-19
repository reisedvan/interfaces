package interfaces.model;


public class Produto {
    
    
    private long id;
    
    private String nome;
    private String descricao;
    private Double estoque;
    private String unidade_medida;
    private Double preco;

    public Produto(String nome, String descricao, Double estoque, String unidade_medida, Double preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.estoque = estoque;
        this.unidade_medida = unidade_medida;
        this.preco = preco;
    }
    
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
        
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getEstoque() {
        return estoque;
    }

    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }

    public String getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public boolean retirada(double quantidade){
        if(quantidade<=estoque){
            estoque-=quantidade;
            return true;
        }
        return false;        
    }
}
