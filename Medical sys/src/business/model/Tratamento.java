package business.model;

public class Tratamento {
	private String nome;
	private String descricao;
	private String observacao;
	private Meta metas;
	
	
	public Tratamento(String nome, String descricao, String observacao, Meta metas) {
		this.nome = nome;
		this.descricao = descricao;
		this.observacao = observacao;
		this.metas = metas;
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
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public Meta getMetas() {
		return metas;
	}

	public void setMetas(Meta metas) {
		this.metas = metas;
	}
	
	
	
	
}
