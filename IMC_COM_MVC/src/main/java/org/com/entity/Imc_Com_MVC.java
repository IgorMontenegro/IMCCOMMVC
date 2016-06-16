package org.com.entity;

public class Imc_Com_MVC {
	
	private Double valor;
	
	private String situacao;

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		if(valor == null){
			valor = 0.0;
		}
		this.valor = valor;
	}

	public String getSituacao() {
		if(situacao == null){
			situacao = "";
		}
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
}
