package ma.enset.jpaproduct;

import ma.enset.jpaproduct.entities.Product;
import ma.enset.jpaproduct.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaProductApplication implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaProductApplication.class, args);
    }

    @Override
    public void run(String... args) {

        productRepository.save(new Product(null, "Ordinateur", 7000, 10));
        productRepository.save(new Product(null, "Imprimante", 1500, 5));
        productRepository.save(new Product(null, "Smartphone", 4000, 20));


        System.out.println("=== Tous les produits ===");
        productRepository.findAll().forEach(System.out::println);


        Product p = productRepository.findById(1L).orElse(null);
        System.out.println("=== Produit 1 === " + p);


        System.out.println("=== Recherche 'Or' ===");
        productRepository.findByNameContains("Or").forEach(System.out::println);
        System.out.println("=== Prix > 2000 ===");
        productRepository.findByPriceGreaterThan(2000).forEach(System.out::println);


        if (p != null) {
            p.setPrice(6500);
            p.setQuantity(8);
            productRepository.save(p);
            System.out.println("=== Après mise à jour === " + productRepository.findById(1L).get());
        }


        productRepository.deleteById(2L);
        System.out.println("=== Après suppression ===");
        productRepository.findAll().forEach(System.out::println);
    }
}