package futsal.go.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import futsal.go.com.models.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

}
