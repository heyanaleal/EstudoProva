package mineda.demo.repository;

import mineda.demo.entity.MatriculaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MatriculaRepository extends JpaRepository <MatriculaEntity, Integer> {
}
