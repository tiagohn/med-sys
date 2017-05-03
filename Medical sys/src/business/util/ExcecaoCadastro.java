package business.util;

@SuppressWarnings("serial")
public class ExcecaoCadastro extends Exception {

	public ExcecaoCadastro(){
		super("Falha ao realizar cadastro !");
	}
	
	public ExcecaoCadastro(String msg){
		super(msg);
	}
	
}
