package business.model;

import java.util.Calendar;

public class Paciente {
	private String nome; 
	private String cpf;
	private Calendar data_nascimento; 
	private String endere�o;
	private String telefone; 
	private String email;
	private Tratamento tratamento;
	

	public Paciente(String nome, String cpf, Calendar data_nascimento, String endere�o, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.endere�o = endere�o;
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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
			// Cria inst�ncia da estrutura de dados.
		}else{
			// Adiciona o "tratamento" a estrutura. 
			
		}
		
	}
	
	
	
}
