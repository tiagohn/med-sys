package view;

import java.util.HashMap;
import java.util.Map;

import business.control.ControlePaciente;
import business.control.ControleUsuario;
import business.util.ExcecaoCadastro;
import business.util.ExcecaoLogin;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			if (ControleUsuario.start("José", "12345")){			// Cadastra um novo usuário.
				System.out.println("Usuário ativo: "+ControleUsuario.nomeUsuario());
				
				Map<String, String> pacientes = new HashMap<String, String>();
				
				ControlePaciente controler_P = new ControlePaciente();
				pacientes = controler_P.listarCpf();
				
				System.out.println("\nPacientes:\n"
								 + "--------------------");
				for(String cpf : pacientes.keySet()){
					System.out.println("nome: "+pacientes.get(cpf)+" | CPF: "+cpf+"\n");
					
				}
				
				System.out.println("\nInseriu um novo paciente (nova lista):\n"
						        + "--------------------------------------------");
				
				controler_P.addPaciente("Nome do paciente novo", "001122334455", "17/06/1993", "minharua", "83988776655", "paciente@email.com");
				
				pacientes = controler_P.listarCpf();
				
				for(String cpf : pacientes.keySet()){
					System.out.println("nome: "+pacientes.get(cpf)+" | CPF: "+cpf+"\n");
					
				}
				
				
			}
			
			ControleUsuario.start("Josa", "1234"); // Testando autenticação.   
			System.out.println(ControleUsuario.nomeUsuario());
			
		} catch (ExcecaoCadastro | ExcecaoLogin e) {
			System.out.println("Erro: "+e.getMessage());
			//e.printStackTrace();
			
		}
	}

}
