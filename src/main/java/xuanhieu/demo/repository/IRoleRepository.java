package xuanhieu.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import xuanhieu.demo.entity.Role;

@Repository
public interface IRoleRepository extends JpaRepository<Role, Long> {
    @Query("SELECT r.id FROM Role r WHERE r.name =?1")
    Long getRoleIdByName(String roleName);
}
