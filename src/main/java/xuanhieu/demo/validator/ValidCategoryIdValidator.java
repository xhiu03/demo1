package xuanhieu.demo.validator;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;
import xuanhieu.demo.validator.annotation.ValidCategoryId;
import xuanhieu.demo.entity.Category;

public class ValidCategoryIdValidator implements ConstraintValidator<ValidCategoryId, Category> {
    @Override
    public boolean isValid(Category category, ConstraintValidatorContext context){
        return category !=null && category.getId() !=null;
    }
}
