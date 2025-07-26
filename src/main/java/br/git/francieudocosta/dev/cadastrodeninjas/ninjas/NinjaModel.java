package br.git.francieudocosta.dev.cadastrodeninjas.ninjas;

import br.git.francieudocosta.dev.cadastrodeninjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @Column(unique = true)
    private String email;

    private int idade;

    @ManyToOne
    @JoinColumn(name = "missao_id") //fk
    private MissoesModel missao;

}
