package net.javaguides.springboot.employee_management_webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "net.javaguides.springboot.model")
public class EmployeeManagementWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementWebappApplication.class, args);
	}

}
