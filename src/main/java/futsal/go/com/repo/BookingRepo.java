package futsal.go.com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import futsal.go.com.models.Booking;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Integer> {
    // You can add custom query methods here if needed
}
