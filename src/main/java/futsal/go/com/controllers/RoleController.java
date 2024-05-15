package futsal.go.com.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import futsal.go.com.models.Role;
import futsal.go.com.services.RoleService;
import futsal.go.com.utils.ResponseMessage;

@RestController
public class RoleController {

    @Autowired
    private RoleService roleService;

    @PostMapping("/create-new-role")
    public ResponseMessage<String> createNewRole(@RequestBody Role role) {
        System.out.println("yes");
        ResponseMessage<String> response = new ResponseMessage<>();
        if (roleService.addNewRole(role)) {
            response.setMessage("Role created successfully");
            response.setStatus(200); // or any appropriate success status code
        } else {
            response.setMessage("Failed to create role");
            response.setStatus(500); // or any appropriate error status code
        }
        return response;
    }

}
