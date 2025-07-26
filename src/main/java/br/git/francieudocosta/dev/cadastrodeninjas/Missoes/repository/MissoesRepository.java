package br.git.francieudocosta.dev.cadastrodeninjas.Missoes.repository;

import br.git.francieudocosta.dev.cadastrodeninjas.Missoes.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {
}
