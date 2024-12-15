package br.pro.delfino.drogaria.beans;

import br.pro.delfino.drogaria.entidades.Categoria;
import br.pro.delfino.drogaria.entidades.Produto;
import br.pro.delfino.drogaria.repositorios.CategoriaRepository;
import br.pro.delfino.drogaria.repositorios.ProdutoRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.view.ViewScoped;
import java.util.List;

@Component
@ViewScoped
@Data
public class ProdutoBean {

    private Produto produto;

    private List<Categoria> categorias;

    private List<Produto> produtos;

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private ProdutoRepository produtoRepository;

    public void novo() {
        produto = new Produto();
        categorias = categoriaRepository.findAll();
    }
    public void listar() {
        produtos = produtoRepository.findAll();
    }
}
