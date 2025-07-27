package br.git.francieudocosta.dev.cadastrodeninjas.Missoes;

import br.git.francieudocosta.dev.cadastrodeninjas.ninjas.NinjaModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String dificuldade;

    @OneToMany(mappedBy = "missao")
    @Setter(AccessLevel.NONE)
    @JsonIgnore
    private List<NinjaModel> ninjas = new ArrayList<>();
}
