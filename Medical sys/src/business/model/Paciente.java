package business.model;

import java.util.Date;

public class Paciente {
	String nome; 
	String cpf;
	Date data_nascimento; 
	String enderešo;
	String telefone; 
	String email;
	
	public Paciente(String nome, String cpf, Date data_nascimento, String enderešo, String telefone, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.enderešo = enderešo;
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

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
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
