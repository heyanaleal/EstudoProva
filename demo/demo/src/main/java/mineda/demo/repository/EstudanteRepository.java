package mineda.demo.repository;

import mineda.demo.entity.EstudanteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudanteRepository extends JpaRepository<EstudanteEntity,Integer> {
}
