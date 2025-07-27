package br.git.francieudocosta.dev.cadastrodeninjas.Missoes.controllers;

import br.git.francieudocosta.dev.cadastrodeninjas.Missoes.MissoesModel;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/missoes")
public class MissaoController {


    @GetMapping
    public String listarMissoes() {

        return "Lista de missoes";
    }

    @PostMapping()
    public String criarMissao(){

        return "Criado com sucesso!";
    }

    @PutMapping
    public  String alterarMissao() {

        return "Alterado com sucesso!";
    }

    @DeleteMapping
    public  String deletarMissao() {

        return "Deletado com sucesso!";
    }
}
