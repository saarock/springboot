package futsal.go.com.services.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import futsal.go.com.models.User;
import futsal.go.com.repo.UserRepo;
import futsal.go.com.services.UserService;

@Service
public class UserImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    public boolean createNewUser(User user) {
        try {
        User savedUser = userRepo.save(user);
        System.out.println(savedUser + "this are the saved userd");
        return savedUser != null;
        } catch (Exception error ) {
            // error.printStackTrace();
            System.out.println(error.getMessage());
            return false;
        }
    }

}
