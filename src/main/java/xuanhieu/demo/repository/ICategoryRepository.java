package xuanhieu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xuanhieu.demo.entity.Category;

@Repository

public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
