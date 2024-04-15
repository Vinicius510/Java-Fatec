package br.edu.fatec.recuparacaoP1;

import br.edu.fatec.recuparacaoP1.services.ConsomeAPI;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RecuparacaoP1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RecuparacaoP1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsomeAPI lerapi = new ConsomeAPI();
		String dados = lerapi.ObterDados("https://api.escuelajs.co/api/v1/products");
		ObjectMapper objMapper = new ObjectMapper();
		JsonNode jsonNode = objMapper.readTree(dados);
		List<String> emailList = new ArrayList<>();

		jsonNode.forEach(node -> {
			double price = node.get("price").asDouble();
			if (price < 30) {
				String name = node.get("title").asText().toUpperCase();
				String preco = node.get("price").asText().toUpperCase();
				emailList.add(name);
				emailList.add(preco);
			}
		});

		emailList.forEach(System.out::println);
		System.out.println("Produtos imperdíveis: " + emailList.size());
	}

}
