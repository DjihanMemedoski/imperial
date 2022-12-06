package main.java.at.fhtechnikum.imperial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController
@SpringBootApplication
public class ImperialApplication {

	@GetMapping("/api/centimeter?inch={inch}")
	public float calcRectangle(@PathVariable float inch){
		return inch * 2.54;
	}
}
