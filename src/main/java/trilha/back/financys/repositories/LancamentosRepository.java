package trilha.back.financys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.entities.Lancamentos;

public interface LancamentosRepository extends JpaRepository<Lancamentos, Long> {}
