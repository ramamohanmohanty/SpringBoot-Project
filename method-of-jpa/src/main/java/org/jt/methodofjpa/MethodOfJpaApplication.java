package org.jt.methodofjpa;

import java.util.List;
import java.util.stream.IntStream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;
import lombok.var;

@SpringBootApplication
@RequiredArgsConstructor
public class MethodOfJpaApplication implements CommandLineRunner {
	private final ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(MethodOfJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var products = getProducts();

		productRepository.saveAll(products);

		var product1 = Product.builder()
						.productName("IPhone 15Pro")
						.productBrand("Apple")
						.productPrice(150000.64)
						.build();
		productRepository.save(product1);
	}

	public List<Product> getProducts(){
		//return (List<Product>) productRepository.findAll();
		return IntStream.rangeClosed(1, 10)
		.mapToObj(i -> Product.builder()
						.productName("Product-"+i)
						.productBrand("Brand-"+i)
						.productPrice(1059.00 * i)
						.build())
						
						.toList();
	}
}


//many More data inserted