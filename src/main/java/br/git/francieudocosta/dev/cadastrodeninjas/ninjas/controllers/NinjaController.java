package br.git.francieudocosta.dev.cadastrodeninjas.ninjas.controllers;

import br.git.francieudocosta.dev.cadastrodeninjas.ninjas.NinjaModel;
import br.git.francieudocosta.dev.cadastrodeninjas.ninjas.service.NinjaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
@RequiredArgsConstructor
public class NinjaController {

    private final NinjaService ninjaService;

    @PostMapping
    public String criarNinja() {

        return "Ninja Criada com Sucesso!";
    }

    @GetMapping
    public List<NinjaModel> listarTodosNinjas(){

        return ninjaService.listarNinjas();
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
