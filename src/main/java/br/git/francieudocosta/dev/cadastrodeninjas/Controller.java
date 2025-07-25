package br.git.francieudocosta.dev.cadastrodeninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class Controller {

    @GetMapping
    public String boasVindas(){

        return "Boas Vindas";
    }
}
