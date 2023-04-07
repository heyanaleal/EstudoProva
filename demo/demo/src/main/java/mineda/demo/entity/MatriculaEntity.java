package mineda.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "matricula")
public class MatriculaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Integer id_matricula;

    @ManyToOne
    @JoinColumn(name="id_estudante", referencedColumnName = "id_estudante")
    private EstudanteEntity id_estudante;

    @ManyToOne
    @JoinColumn(name="id_aula", referencedColumnName = "id_aula")
    private AulaEntity id_aula;


}
