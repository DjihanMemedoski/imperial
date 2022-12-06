package main.java.at.fhtechnikum.imperial.Controller;


@RestController
public class ImperialController {

    @GetMapping("/api/centimeter?inch={inch}")
    public float calcInch(@PathVariable float inch){
        return inch * 2.54;
    }

    @GetMapping("/api/meter?yard={yard}")
    public float calcYard(@PathVariable float yard){
        return yard/1.094;
    }

}
