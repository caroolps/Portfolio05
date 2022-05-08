package fatec.sp.gov.br.firstspring.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.METHOD_NOT_ALLOWED)
public class CantBeSaveException extends RuntimeException {

    public CantBeSaveException(){
        super();
    }

    public CantBeSaveException(String message){
        super(message);
    }

    public CantBeSaveException(Throwable cause){
        super(cause);
    }

    public CantBeSaveException(String message, Throwable cause){
        super(message, cause);
    }

}
