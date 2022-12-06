package main.java.at.fhtechnikum.imperial.Controller;


@RestController
public class ImperialController {

    @GetMapping("/api/centimeter?inch={inch}")
    public float calcRectangle(@PathVariable float inch){
        return inch * 2.54;
    }
}
