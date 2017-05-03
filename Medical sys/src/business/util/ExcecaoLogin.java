package business.util;

@SuppressWarnings("serial")
public class ExcecaoLogin extends Exception{

	public ExcecaoLogin(){
		super("Falha no login !");
	}
	
	public ExcecaoLogin(String msg){
		super(msg);
	}
	
}
