package business.util;

@SuppressWarnings("serial")
public class LoginException extends Exception{

	LoginException(){
		super("Falha no login !");
	}
	
	LoginException(String msg){
		super(msg);
	}
	
}
