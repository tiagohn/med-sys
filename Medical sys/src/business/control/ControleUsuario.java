package business.control;

import business.model.Usuario;
import business.util.ExcecaoCadastro;
import business.util.ExcecaoLogin;

public class ControleUsuario {
	private static Usuario usr;
	private static boolean autenticado;
	
	public static boolean start(String usuario, String senha) throws ExcecaoCadastro, ExcecaoLogin{
		usr = carregarUsuario();
		
			if (usr == null){
				addUsuario(usuario, senha);
				autenticado = true;
				
			}else{
				autenticarUsuario(usuario, senha);
				
			}
    	
		
		return true;
		
	}
	    
	    private static void addUsuario(String user, String pw) throws ExcecaoCadastro {
	    	if (usr != null){throw new ExcecaoCadastro("Não é possível criar um novo usuário.");}
	        
			validarUsr(user, pw);
			usr = new Usuario(user, pw);
			// Persistir usuário.
	    	
	    }
	    
	    private static void validarUsr(String usuario, String senha) throws ExcecaoCadastro{
	        // Algoritmo de validação.
	    	
	    }
	    
	    private static Usuario carregarUsuario(){
	    	if(!autenticado){
		    	Usuario user = null;
		    	// Busca por usuário no BD. [return: array(nome, senha)]
		    	String resultado_buscaBD[] = {null, null};
		    	
		    	if(resultado_buscaBD[0] != null && resultado_buscaBD[1] != null){
		    		user = new Usuario(resultado_buscaBD[0], resultado_buscaBD[1]);
		    	}
		    	
		    	return user;
		    	
	    	}else{
	    		return usr;
	    	}
	    	
	    }
	    
	    private static void autenticarUsuario(String usuario, String senha) throws ExcecaoLogin{
	    	boolean usuarioCorresponde = usuario.equals(usr.getName());
	    	boolean senhaCorresponde = senha.equals(usr.getPassword());
	    	
	    	if(!autenticado){
	    		if(!usuarioCorresponde && !senhaCorresponde){throw new ExcecaoLogin("Usuário ou senha inválidos !");}
	    		autenticado = true;
	    	}else{
	    		throw new ExcecaoLogin("O usuário " + usr.getName() + " já está em atividade, operação falhou !");
	    	}
	    	
		}
	    
		public static void newPassword(String oldPassword, String newPassword) throws ExcecaoCadastro{
			if((oldPassword.equals(usr.getPassword())) && autenticado){
				usr.setPassword(newPassword);
			}else{throw new ExcecaoCadastro("Senha antiga não corresponde.");}
		}
		
		public static String nomeUsuario(){
			if(autenticado){
				return usr.getName();
				
			}else {
				return null;
			}
			
		}
		
}
