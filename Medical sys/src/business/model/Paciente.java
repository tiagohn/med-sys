package business.model;

import java.util.Date;

public class Paciente {
	String nome; 
	String cpf;
	Date data_nascimento; 
	String endere�o;
	String telefone; 
	String email;
	
	public Paciente(String nome, String cpf, Date data_nascimento, String endere�o, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.endere�o = endere�o;
		this.telefone = telefone;
		this.email = email;
		
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

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
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
	
	
	
}
