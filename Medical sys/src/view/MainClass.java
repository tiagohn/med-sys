package view;

import business.control.ControleUsuario;
import business.util.ExcecaoCadastro;
import business.util.ExcecaoLogin;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			if (ControleUsuario.start("Jos�", "12345")){			// Cadastra um novo usu�rio.
				System.out.println(ControleUsuario.nomeUsuario());
				
			}
			
			ControleUsuario.start("Josa", "1234"); // Testando autentica��o.   
			System.out.println(ControleUsuario.nomeUsuario());
			
		} catch (ExcecaoCadastro | ExcecaoLogin e) {
			System.out.println("Erro: "+e.getMessage());
			//e.printStackTrace();
			
		}
	}

}
