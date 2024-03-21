package br.com.matheusleite.hotelmanagementsystem;

import br.com.matheusleite.hotelmanagementsystem.entity.Funcionario;
import br.com.matheusleite.hotelmanagementsystem.entity.Pessoa;
import lombok.Builder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Locale;

@SpringBootApplication
public class HotelManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelManagementSystemApplication.class, args);

	}
}
