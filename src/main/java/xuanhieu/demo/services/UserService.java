package xuanhieu.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xuanhieu.demo.entity.User;
import xuanhieu.demo.repository.IRoleRepository;
import xuanhieu.demo.repository.IUserRepository;

@Service
public class UserService {
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IRoleRepository roleRepository;
    public void save(User user){
        userRepository.save(user);
        Long userId = userRepository.getUserIdByUsername(user.getUsername());
        Long roleId = roleRepository.getRoleIdByName("USER");
        if (roleId != 0 && userId !=0){
            userRepository.addRoleToUser(userId, roleId);
        }
    }
}
