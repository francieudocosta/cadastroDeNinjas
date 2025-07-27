package br.git.francieudocosta.dev.cadastrodeninjas.ninjas.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @PostMapping
    public String criarNinja() {

        return "Ninja Criada com Sucesso!";
    }

    @GetMapping
    public String mostrarTodosNinjas(){

        return "Mostrar todos os ninjas";
    }

    @GetMapping("/{id}")
    public String mostrarNinjaPorId(@PathVariable Long id) {

        return "Ninja encontrada com sucesso!";
    }

    @PutMapping("/{id}")
    public  String atualizarNinja(Long id) {

        return "Ninja atualizada com sucesso!";
    }

    @DeleteMapping("/{id}")
    public  String deletarNinjaId(Long id) {

        return "Ninja deletado com sucesso!";
    }
}
