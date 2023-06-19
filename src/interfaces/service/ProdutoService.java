package interfaces.service;
import interfaces.model.Produto;
import java.util.List;

public interface ProdutoService {
    
    public Produto cadastrarProduto(Produto produto);
        
    public List<Produto> listarProduto(Produto produto);
    
    public List<Produto> listarProduto(String nome);
     
    public Produto atualizarProduto(Produto produto);
    
    public boolean deletarProduto(Produto produto);
    
}
