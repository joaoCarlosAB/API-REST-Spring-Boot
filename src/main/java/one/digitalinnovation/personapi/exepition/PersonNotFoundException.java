package one.digitalinnovation.personapi.exepition;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class PersonNotFoundException extends Exception{
    public PersonNotFoundException(Long id){
        super("person id not found " + id);
    }
}
