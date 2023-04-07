package mineda.demo.repository;

import mineda.demo.entity.AulaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AulaRepository extends JpaRepository<AulaEntity,Integer> {
}
