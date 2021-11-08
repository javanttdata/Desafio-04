package trilha.back.financys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import trilha.back.financys.entities.Category;
import trilha.back.financys.entities.Lancamentos;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    }


