package business.model;

public class Medicamento {
	private String nome;
	private String posologia;
	private String descricao;
	private String observacoes;
	
	
	public Medicamento(String nome, String posologia, String descricao, String observacoes) {
		this.nome = nome;
		this.posologia = posologia;
		this.descricao = descricao;
		this.observacoes = observacoes;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	public String getPosologia() {
		return posologia;
	}

	public void setPosologia(String posologia) {
		this.posologia = posologia;
	}
	
}
