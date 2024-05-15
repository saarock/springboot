package futsal.go.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import futsal.go.com.models.Ground;

@Repository
public interface GroundRepo extends JpaRepository<Ground, Long> {
    // You can add custom query methods here if needed
}
