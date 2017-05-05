package business.control;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import business.model.Paciente;
import business.util.ExcecaoCadastro;
import business.util.ExcecaoDados;

public class ControlePaciente {
	private Map<String,Paciente> pacientes = new HashMap<String,Paciente>(); // [key: cpf; value: Paciente]
	
	public ControlePaciente(){
		carregarPacientes();
		
	}
    
    public void addPaciente(String nome, String cpf, String data_nascimento, String endereço, String telefone, String email) throws ExcecaoCadastro {
        
    	if (this.pacientes.containsKey(cpf)){throw new ExcecaoCadastro("Já existe um paciente com o cpf informado.");}
		
    	String data[] = data_nascimento.split("/",3);
    	
    	Calendar dataNasc = Calendar.getInstance();
    	dataNasc.set(Integer.parseInt(data[2]), Integer.parseInt(data[1]), Integer.parseInt(data[0]));
    	
		Paciente p = new Paciente(nome, cpf, dataNasc, endereço, telefone, email);
		// persistir dados.
		this.pacientes.put(cpf, p);	// Simulando inserção no BD
		//carregarPacientes();

    }
	    
    private void carregarPacientes(){
    	// Busca Pacientes no BD.
    	// Carrega os valores no hash map [key: cpf; value: Paciente].
    	this.pacientes = loadTest();	// Método para simular alimentação de dados.
    	
    }
	
	public Calendar obterDataNasc(String cpf, String data_nascimento) throws ExcecaoDados{
		carregarPacientes();
		if (!this.pacientes.containsKey(cpf)){throw new ExcecaoDados("Paciente não consta no sistema.");}
		
		return this.pacientes.get(cpf).getData_nascimento();	// O correto é retornar uma string (corrigir).
    	
    }
    
	public String obterEmail(String cpf, String email) throws ExcecaoDados{
		carregarPacientes();
		if (!this.pacientes.containsKey(cpf)){throw new ExcecaoDados("Paciente não consta no sistema.");}
		
		return this.pacientes.get(cpf).getEmail();
    	
    }
	
	public String obterNome(String cpf, String nome) throws ExcecaoDados{
		carregarPacientes();
		if (!this.pacientes.containsKey(cpf)){throw new ExcecaoDados("Paciente não consta no sistema.");}
		
		return this.pacientes.get(cpf).getNome();
    	
    }
	
	public String obterTelefone(String cpf, String phone) throws ExcecaoDados{
		carregarPacientes();
		if (!this.pacientes.containsKey(cpf)){throw new ExcecaoDados("Paciente não consta no sistema.");}
		
		return this.pacientes.get(cpf).getTelefone();
    	
    }
	
	public String obterEndereco(String cpf, String endereco) throws ExcecaoDados{
		carregarPacientes();
		if (!this.pacientes.containsKey(cpf)){throw new ExcecaoDados("Paciente não consta no sistema.");}
		
		return this.pacientes.get(cpf).getEndereço();
    	
    }
	
	public Map<String, String> listarCpf(){		
		//carregarPacientes();	// Comentado para fins de teste.
		
		Map<String, String> listaPacientes = new HashMap<String, String>(); 
		String nome;
		
		for(String key : this.pacientes.keySet()){
			nome = this.pacientes.get(key).getNome();
			listaPacientes.put(key, nome);
		}
		
		return listaPacientes;
    	
    }
	
	public void atualizarDataNasc(String cpf, String data_nascimento) throws ExcecaoCadastro{
		if (this.pacientes.containsKey(cpf)){
			// Atualiza informação no BD.
			carregarPacientes();
			
		}else{throw new ExcecaoCadastro("Paciente não consta no sistema.");}
    	
    }
    
	public void atualizarEmail(String cpf, String email) throws ExcecaoCadastro{
		if (this.pacientes.containsKey(cpf)){
			// Atualiza informação no BD.
			carregarPacientes();
			
		}else{throw new ExcecaoCadastro("Paciente não consta no sistema.");}
    	
    }
	
	public void atualizarNome(String cpf, String nome) throws ExcecaoCadastro{
		if (this.pacientes.containsKey(cpf)){
			// Atualiza informação no BD.
			carregarPacientes();
			
		}else{throw new ExcecaoCadastro("Paciente não consta no sistema.");}
    	
    }
	
	public void atualizarPhone(String cpf, String phone) throws ExcecaoCadastro{
		if (this.pacientes.containsKey(cpf)){
			// Atualiza informação no BD.
			carregarPacientes();
			
		}else{throw new ExcecaoCadastro("Paciente não consta no sistema.");}
    	
    }
	
	public void atualizarEndereco(String cpf, String endereco) throws ExcecaoCadastro{
		if (this.pacientes.containsKey(cpf)){
			// Atualiza informação no BD.
			carregarPacientes();
			
		}else{throw new ExcecaoCadastro("Paciente não consta no sistema.");}
    	
    }
	
	public void addTratamento(String cpf, String nomeTratamento){
		// Busca tratamento no BD.
		// Atualiza informação no BD.
		carregarPacientes();
		
	}
	    
    
    public void delPaciente(String cpf){
    	// Solicita deleção no BD.
    	carregarPacientes();
        
    }
    
    // Métodos teste
    
    private Map<String, Paciente> loadTest(){
    	Map<String, Paciente> tst = new HashMap<String, Paciente>();
    	
    	Paciente p;
    	String[] nome = {"João", "Maria", "José", "Marcos", "Josefa",
    					 "Marta", "Paulo", "Moises", "Emilia", "Roseane"};
    	Calendar dataNasc = Calendar.getInstance();
    	
    	for(int i = 0; i < 10; i++){
    		dataNasc.set(1993, i+1, 12+i);

    		p = new Paciente(nome[i], i+"", dataNasc, "rua de casa", "83988776655", nome[i]+"@email.com");
    		tst.put(i+"", p);
    	}
    	
    	return tst;
    	
    }
    
	
}
