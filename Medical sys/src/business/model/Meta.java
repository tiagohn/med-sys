package business.model;

public class Meta {
	private String nome; 
	private String descricao;
	private String observacoes;
	private Medicamento medicamento;
	
	public Meta(String nome, String descricao, String observacoes, Medicamento medicamento) {
		this.nome = nome;
		this.descricao = descricao;
		this.observacoes = observacoes;
		this.medicamento = medicamento;
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

	public Medicamento getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	
}
