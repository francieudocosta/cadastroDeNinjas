package br.git.francieudocosta.dev.cadastrodeninjas.ninjas.repository;

import br.git.francieudocosta.dev.cadastrodeninjas.ninjas.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRespository extends JpaRepository<NinjaModel, Long> {
}
