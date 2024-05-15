package futsal.go.com.models;


import java.util.Set;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "booking_request")
@Setter
@Getter
@NoArgsConstructor
public class Booking {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String bookingDate;
    private String bookingTime;

    @ManyToMany
    private Set<User> bookedBy;

    public Booking(int id, String bookingDate, String bookingTime, Set<User> bookedBy) {
        this.id = id;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.bookedBy = bookedBy;
    }

}
