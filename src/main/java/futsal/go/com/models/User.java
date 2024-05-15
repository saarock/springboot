package futsal.go.com.models;

import java.util.ArrayList;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "user")
@Setter
@Getter
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;



    
    @ManyToMany(mappedBy = "users", cascade = CascadeType.ALL)
    private ArrayList<Role> roles = new ArrayList<Role>();

    @ManyToMany(mappedBy = "bookedBy", cascade = CascadeType.ALL)
    private ArrayList<Booking> bookings = new ArrayList<Booking>();

    @OneToMany(mappedBy = "user", cascade = CascadeType.REMOVE)
    private ArrayList<Ground> grounds;

    public User(Long id, String username, String password, ArrayList<Role> roles) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.roles = roles;
 ;
    }

}