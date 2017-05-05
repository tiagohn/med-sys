package business.util;

@SuppressWarnings("serial")
public class ExcecaoDados extends Exception{
	public ExcecaoDados(){
		super("Dados inconsistentes !");
	}
	
	public ExcecaoDados(String msg){
		super(msg);
	}
	
}
