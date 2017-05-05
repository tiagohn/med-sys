package business.model;

import java.util.Calendar;

public class Paciente {
	private String nome; 
	private String cpf;
	private Calendar data_nascimento; 
	private String endereço;
	private String telefone; 
	private String email;
	private Tratamento tratamento;
	

	public Paciente(String nome, String cpf, Calendar data_nascimento, String endereço, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.endereço = endereço;
		this.telefone = telefone;
		this.email = email;
		this.tratamento = null;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Calendar data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Tratamento getTratamento() {
		return tratamento;
	}

	public void addTratamento(Tratamento tratamento) {
		if(tratamento == null){
			// Cria instância da estrutura de dados.
		}else{
			// Adiciona o "tratamento" a estrutura. 
			
		}
		
	}
	
	
	
}
