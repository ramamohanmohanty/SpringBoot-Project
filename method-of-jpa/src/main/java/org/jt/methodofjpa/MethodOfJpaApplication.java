package org.jt.methodofjpa;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class MethodOfJpaApplication implements CommandLineRunner {
	private final ProductRepository productRepository;
	private final ProductHistoryRepository historyRepository;

	public static void main(String[] args) {
		SpringApplication.run(MethodOfJpaApplication.class, args);
	}

	@Override
	// @Transactional
	public void run(String... args) throws Exception {
		 //var products = getProducts();

		 //productRepository.saveAll(products);
		// System.out.println(productRepository.count());

		// System.out.println(productRepository.existsById("0080d337-144c-46cd-a8a7-436ef65c3770"));

		// productRepository.deleteById("004e1c9b-a689-45c6-a512-1428787a91ff");
		// System.out.println("Your Product details is deleted...");
		/*
		 * var result = productRepository.findAll();
		 * result.forEach(System.out::println);
		 */

		// var optionalProduct =
		// productRepository.findById("03c0f202-daf7-421d-abb1-b47f95d8f71");
		// if(optionalProduct.isPresent()) {
		// System.out.println(optionalProduct.get());
		// } else {
		// System.out.println("No data found");
		// }

		// var optionalProduct =
		// productRepository.findById("03c0f202-daf7-421d-abb1-b47f95d8f71c");
		// if (optionalProduct.isPresent()) {
		// var product = optionalProduct.get();
		// product.setProductPrice(product.getProductPrice() + 1000);

		// productRepository.save(product);
		// if(optionalProduct.isPresent())
		// System.out.println(optionalProduct.get());
		// } else {
		// System.out.println("No data found");
		// }

		// var result = productRepository.findAll(Sort.by(Direction.DESC,
		// "productPrice"));
		// result.forEach(System.out::println);

		// var optionalProduct = productRepository.findByProductName("Product-3");
		// if(optionalProduct.isPresent()) {
		// System.out.println(optionalProduct.get());
		// } else {
		// System.out.println("No data");
		// }

		// var product = productRepository.findByProductName("Product-8");
		// System.out.println(product);

		// var product = productRepository.findAllByProductPriceBetween(3000, 13400);
		// products.forEach(System.out::println);

		// var product = productRepository.getProduct(6303, "Brand-6");
		// System.out.println(product);

		// int affectedrow = productRepository.updatePrice(10000,
		// "30b15c07-e44f-42f3-92db-84fedaee96ec");
		// System.out.println(affectedrow);

		// var findName = productRepository.findByActiveTrue("5df8ad2a-5332-4bdd-a65f-f2131be8d62d");
		// if(findName.isPresent()){
		// 	System.out.println("True");
		// }else{
		// 	System.out.println("False");
		// }
		
		transactionConcept();
	}

	@Transactional()
	public void transactionConcept() {
		var productId = "2f17a21a-dfc6-4fc7-815d-7be51c7934a9";
		productRepository.deleteById(productId);

		boolean b = false;

		if (b)
			throw new RuntimeException();

		var history = ProductHistory.builder()
				.productId("2f17a21a-dfc6-4fc7-815d-7be51c7934a9")
				.build();

		historyRepository.save(history);
	}

	public List<Product> getProducts() {
		return IntStream.rangeClosed(1, 10)
				.mapToObj(i -> Product.builder()
						.productName("Product-" + i)
						.productBrand("Brand-" + i)
						.productPrice(1050.50 * i)
						.build())
				.toList();

	}

}