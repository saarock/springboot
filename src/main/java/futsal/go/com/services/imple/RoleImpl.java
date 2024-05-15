package futsal.go.com.services.imple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import futsal.go.com.models.Role;
import futsal.go.com.repo.RoleRepo;
import futsal.go.com.services.RoleService;

@Service
public class RoleImpl implements RoleService {
    @Autowired
    private RoleRepo roleRepo;

    
        @Override
        public boolean addNewRole(Role role) {
            try {
            Role roleSavedOrNot = this.roleRepo.save(role);
            return roleSavedOrNot != null;
            } catch(Exception error) {
                error.printStackTrace();
                return false;
            }
        }
}
