package business.control;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import business.model.Paciente;
import business.model.Usuario;
import business.util.ExcecaoCadastro;

public class ControlePaciente {
	Map<String,Usuario> pacientes = new HashMap<String,Usuario>();
    
    public void addPaciente(String nome, String cpf, Date data_nascimento, String endereço, String telefone, String email) throws ExcecaoCadastro {
        
    	if (pacientes.containsKey(cpf)){throw new ExcecaoCadastro("Já existe um paciente com o cpf informado.");}
			
		Paciente p = new Paciente(nome, cpf, data_nascimento, endereço, telefone, email);
		// persistir dados.
		// atualizar hashmap.

    }
    
    public void delPaciente(String cpf){
        
    }
    
	
}
