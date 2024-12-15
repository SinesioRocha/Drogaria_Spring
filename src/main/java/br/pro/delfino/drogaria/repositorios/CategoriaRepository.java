package br.pro.delfino.drogaria.repositorios;

import br.pro.delfino.drogaria.entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {
}
