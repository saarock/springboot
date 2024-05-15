package futsal.go.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import futsal.go.com.models.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, Integer> {
    // You can add custom query methods here if needed
}
