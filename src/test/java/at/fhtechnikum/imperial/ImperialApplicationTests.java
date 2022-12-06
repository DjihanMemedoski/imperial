package main.java.at.fhtechnikum.imperial;

import main.java.at.fhtechnikum.imperial.Controller.ImperialController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ImperialApplicationTests {

	@Test
	void contextLoads() {

		// Vorhanden
		ImperialController controller = new ImperialController();

		// Falls
		int resultInch = controller.calcInch(1);
		int resultYard = controller.calcYard(1);

		// Sollte ergebniss
		assertEquals(resultInch, 2.54);
		assertEquals(resultYard, 0.9144);

	}

}
