package futsal.go.com.controllers;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import futsal.go.com.models.Role;
import futsal.go.com.models.User;
import futsal.go.com.services.UserService;
import futsal.go.com.utils.ResponseMessage;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/add-user")
    public ResponseMessage<String> postMethodName(@RequestBody User user) {
        try {
            
            if (user.getRoles().isEmpty() || user.getRoles() == null) {
                return new ResponseMessage<>("not-success", "There is no any roles", 403, null);
                                
            }

            ArrayList<Role> role = user.getRoles();

            if (!userService.createNewUser(user)) {
                return new ResponseMessage<>("not-success", "Some thing wrong pleased try again", 403, null);
            }

            return new ResponseMessage<>("success", "User created SuccessFully", 200, null);
        } catch (Exception error) {
            error.printStackTrace();
            return new ResponseMessage<>("not-success", error.getMessage(), 500, null);

        }
    }

}
