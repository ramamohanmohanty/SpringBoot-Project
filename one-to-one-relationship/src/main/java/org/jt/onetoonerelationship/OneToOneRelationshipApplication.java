package org.jt.onetoonerelationship;

import org.jt.onetoonerelationship.model.Address;
import org.jt.onetoonerelationship.model.Student;
import org.jt.onetoonerelationship.repository.AddressRepository;
import org.jt.onetoonerelationship.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.RequiredArgsConstructor;

@SpringBootApplication
@RequiredArgsConstructor
public class OneToOneRelationshipApplication implements CommandLineRunner {
	private final StudentRepository studentRepository;
	private final AddressRepository addressRepository;

	public static void main(String[] args) {
		SpringApplication.run(OneToOneRelationshipApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// insert();
		// retrive();
		//studentRepository.deleteById(1);
		var address = addressRepository.findById("7f307ea0-ce69-4f77-a27f-4bc481927aa1").orElseThrow();
		System.out.println(address.getAddressId());
		System.out.println(address.getCity());
		System.out.println(address.getState());
		System.out.println(address.getCountry());

		var student = address.getStudent();
		System.out.println(student.getStudentEmail());
		System.out.println(student.getStudentName());
		System.out.println(student.getStudentRoll());


	}

	private void insert() {
		var address = Address.builder()
				.city("ctc")
				.state("Odisha")
				.country("India")
				.build();
		//addressRepository.save(address);

		var student = Student.builder()
				.studentName("Ram")
				.studentEmail("ramamohanmohanty7@gmail.com")
				.build();

		student.setAddress(address);
		address.setStudent(student);
		studentRepository.save(student);
	}

	private void retrive() {
		var student = studentRepository.findById(1).orElse(null);
			System.out.println(student.getStudentRoll());
			System.out.println(student.getStudentName());
			System.out.println(student.getStudentEmail());

		var address = student.getAddress();
			System.out.println(address.getAddressId());
			System.out.println(address.getCity());
			System.out.println(address.getState());
			System.out.println(address.getCountry());
	}
}
