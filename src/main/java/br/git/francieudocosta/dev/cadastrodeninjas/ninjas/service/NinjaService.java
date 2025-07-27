package br.git.francieudocosta.dev.cadastrodeninjas.ninjas.service;

import br.git.francieudocosta.dev.cadastrodeninjas.ninjas.NinjaModel;
import br.git.francieudocosta.dev.cadastrodeninjas.ninjas.repository.NinjaRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class NinjaService {

    private final NinjaRespository ninjaRespository;

    public List<NinjaModel> listarNinjas() {

        return ninjaRespository.findAll();
    }

    public NinjaModel listarNinjaPorId(Long id) {

        return ninjaRespository.findById(id).orElseThrow();
    }
}
