package Exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(reason="Bad Request! Flight status already exists!!")
public class FlightStatusAlreadyExistsException extends RuntimeException {

}
