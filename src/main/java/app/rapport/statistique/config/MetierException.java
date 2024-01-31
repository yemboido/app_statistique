package app.rapport.statistique.config;

public class MetierException extends Exception {

	private Object[] errorArgs;

	  private static final long serialVersionUID = 1L;


	  public MetierException(String message, Throwable cause) {
	    super(message, cause);
	  }

	  public MetierException(String message, Object[] args) {
	    super(message);
	    this.errorArgs = args;
	  }

	  public MetierException(Throwable cause) {
	    super(cause);
	  }

	  public MetierException(String message) {
	    super(message);
	  }

	  public Object[] getErrorArgs() {
	    return errorArgs;
	  }

	  public void setErrorArgs(Object[] errorArgs) {
	    this.errorArgs = errorArgs;
	  }


	  public String getCodeI18n() {
	    return this.getMessage();
	  }

}
