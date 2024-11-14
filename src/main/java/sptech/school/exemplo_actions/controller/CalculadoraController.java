package sptech.school.exemplo_actions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import sptech.school.exemplo_actions.service.CalculadoraService;

@RestController
public class CalculadoraController {
    private final CalculadoraService calculadoraService;

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
    @GetMapping ("/divisão/{a}/{b}")
    public ResponseEntity<Double>divisao(@PathVariable Double a,@PathVariable Double b){
        return ResponseEntity.ok(calculadoraService.dividir(a, b));
    }

    }

