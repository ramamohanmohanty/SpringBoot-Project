package org.jt.methodofjpa;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, String> {
    Optional<Product> findByProductName(String productName);

    List<Product> findAllByProductPriceBetween(double startPrice, double endPrice);

    //Optional<Product>findByActiveTrue(String productId);

    // @Query(nativeQuery = true, value = "SELECT * FROM product WHERE
    // product_brand=? AND product_price=?1")
    // @Query(nativeQuery = true, value = "SELECT * FROM product WHERE
    // product_brand=:brand AND product_price=:price")
    @Query("SELECT p FROM Product p WHERE p.productBrand=:brand AND p.productPrice=:price") // jpql query

    List<Product> getProduct(@Param("price") double Price, @Param("brand") String brand);

    @Modifying
    @Query("UPDATE Product p SET p.productPrice=:price WHERE p.productId=:id")
    int updatePrice(@Param("price") double productPrice, @Param("id") String productId);
}
