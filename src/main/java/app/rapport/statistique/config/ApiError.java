package app.rapport.statistique.config;


import org.springframework.http.HttpStatus;
import java.util.Collections;
import java.util.Map;

public class ApiError  {

  private HttpStatus status;

  private String message;

  private Map<String, String> errors;

  public ApiError(HttpStatus status, String message, Map<String, String> errors) {
    super();
    this.status = status;
    this.message = message;
    this.errors = errors;
  }

  public ApiError(HttpStatus status, String message) {
    super();
    this.status = status;
    this.message = message;
    errors = Collections.emptyMap();
  }

public HttpStatus getStatus() {
	return status;
}

public void setStatus(HttpStatus status) {
	this.status = status;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

public Map<String, String> getErrors() {
	return errors;
}

public void setErrors(Map<String, String> errors) {
	this.errors = errors;
}
  
  
  



}

