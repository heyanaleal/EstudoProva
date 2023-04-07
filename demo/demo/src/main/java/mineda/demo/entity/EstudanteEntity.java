package mineda.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="estudantes")
@Data
public class EstudanteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_estudante")
    private Integer id_estudante;

    @Column(name="nome")
    private String nome;
    @Column(name="sobrenome")
    private String sobrenome;

}
