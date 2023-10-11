package edu.Sim3LR4.sevice;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import edu.Sim3LR4.exception.ValidationFailedException;

@Service
public class RequestValidationService implements ValidationService {
    @Override
    public void isValid(BindingResult bindingResult) throws ValidationFailedException {
        if (bindingResult.hasErrors()) {
            throw new ValidationFailedException(bindingResult.getFieldError().toString());
        }
    }
}