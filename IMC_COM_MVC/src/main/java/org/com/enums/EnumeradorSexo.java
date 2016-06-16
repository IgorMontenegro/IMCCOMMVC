package org.com.enums;

public enum EnumeradorSexo {
	FEMININO("Feminino");
	MASCULINO("Masculino"),
	private String label;
	private EnumeradorSexo(String label){
		this.label = label;
	}
	public String getLabel(){
		return label;
	}
}
