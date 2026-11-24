package ma.enset.jpaproduct.repository;

import ma.enset.jpaproduct.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByNameContains(String keyword);
    List<Product> findByPriceGreaterThan(double price);
}