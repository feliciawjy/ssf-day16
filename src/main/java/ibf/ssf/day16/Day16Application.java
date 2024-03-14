package ibf.ssf.day16;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.json.Json;
import jakarta.json.JsonArrayBuilder;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

@SpringBootApplication
public class Day16Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Day16Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// slide 7
		JsonObjectBuilder empBuilder = Json.createObjectBuilder();
		empBuilder.add("firstName", "Will")
				.add("lastName", "Smith")
				.add("salary", 20000);
		JsonObjectBuilder addressBuilder = Json.createObjectBuilder();
		addressBuilder.add("address1", "Potong Pasir View")
				.add("address2", "Potong Pasir Ave 1")
				.add("postal", "358000");

		empBuilder.add("address", addressBuilder);

		JsonObjectBuilder phone1 = Json.createObjectBuilder();
		phone1.add("type", "mobile").add("number", "91234567");
		JsonObjectBuilder phone2 = Json.createObjectBuilder();
		phone1.add("type", "mobile").add("number", "81234321");

		JsonArrayBuilder arrayBuilder = Json.createArrayBuilder();
		arrayBuilder.add(phone1).add(phone2);
		empBuilder.add("phones", arrayBuilder);

		JsonObject employee = empBuilder.build();

		

		System.out.println(employee);
		

	}

}
