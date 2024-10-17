package br.dev.Back_end.repository;

import br.dev.Back_end.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<Products, Long> {
}
