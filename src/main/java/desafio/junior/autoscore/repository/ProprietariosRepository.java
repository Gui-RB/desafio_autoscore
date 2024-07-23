package desafio.junior.autoscore.repository;

import desafio.junior.autoscore.entity.ProprietariosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProprietariosRepository extends JpaRepository<ProprietariosEntity, Long> {
}
