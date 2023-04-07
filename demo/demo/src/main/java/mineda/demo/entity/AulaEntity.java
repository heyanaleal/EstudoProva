package mineda.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "aulas")
public class AulaEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name="id_aula")
    private  Integer id_aula;
    @Column(name="titulo")
    private String titulo;

    @Column(name="descricao")
    private String descricao;


}
