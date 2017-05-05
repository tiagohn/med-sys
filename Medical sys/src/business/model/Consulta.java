package business.model;

import java.util.Date;

public class Consulta {
	private Date dataDaConsulta;
	private Tratamento tratamento_atual;
	
	
	public Consulta(Date dataDaConsulta, Tratamento tratamento_atual) {
		this.dataDaConsulta = dataDaConsulta;
		this.tratamento_atual = tratamento_atual;
	}
	
	public Date getDataDaConsulta() {
		return dataDaConsulta;
	}
	public void setDataDaConsulta(Date dataDaConsulta) {
		this.dataDaConsulta = dataDaConsulta;
	}
	public Tratamento getTratamento_atual() {
		return tratamento_atual;
	}
	public void setTratamento_atual(Tratamento tratamento_atual) {
		this.tratamento_atual = tratamento_atual;
	}
	
	
}
