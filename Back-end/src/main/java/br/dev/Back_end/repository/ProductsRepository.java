package br.dev.Back_end.repository;

import br.dev.Back_end.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductsRepository extends JpaRepository<Products, Long> {
    @Override
    Optional<Products> findById(Long productID);
}
