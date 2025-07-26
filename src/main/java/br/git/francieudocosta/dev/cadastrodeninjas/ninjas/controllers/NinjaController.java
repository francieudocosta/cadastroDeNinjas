package br.git.francieudocosta.dev.cadastrodeninjas.ninjas.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @GetMapping
    public String boasVindas(){

        return "Boas Vindas";
    }
}
