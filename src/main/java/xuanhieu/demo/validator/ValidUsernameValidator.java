package xuanhieu.demo.validator;

import jakarta.validation.ConstraintValidatorContext;
import xuanhieu.demo.repository.IUserRepository;
import jakarta.validation.ConstraintValidator;
import org.springframework.beans.factory.annotation.Autowired;
import xuanhieu.demo.validator.annotation.ValidUsername;

public class ValidUsernameValidator implements ConstraintValidator<ValidUsername, String> {
    @Autowired
    private IUserRepository userRepository;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context){
        if(userRepository == null)
            return true;
        return userRepository.findByUsername(username) == null;
    }
}
