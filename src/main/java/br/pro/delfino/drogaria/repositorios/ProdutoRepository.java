package br.pro.delfino.drogaria.repositorios;

import br.pro.delfino.drogaria.entidades.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
