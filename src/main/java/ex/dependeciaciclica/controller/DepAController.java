package ex.dependeciaciclica.controller;

import ex.dependeciaciclica.entity.DepA;
import ex.dependeciaciclica.usercase.DepAUserCase;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/depa")
public class DepAController {

    private final DepAUserCase depAUserCase;

    public DepAController(DepAUserCase depAUserCase) {
        this.depAUserCase = depAUserCase;
    }

    @GetMapping
    public DepA get() {
        return new DepA();
    }

    @PostMapping
    public DepA save(@RequestBody DepA depA) {
        return depAUserCase.save(depA);
    }

}
