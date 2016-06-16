package org.com.model;

import org.com.entity.Imc_Com_MVC;
import org.com.enums.EnumSexo;

public class ImcModelo {
	
	public static Imc_Com_MVC calcularImc(Double peso, Double altura, EnumSexo sexo){
	    Imc_Com_MVC imc_Com_MVC = new Imc_Com_MVC();
		
	    if((peso!= null && peso <=0) || (altura!= null && altura <=0) || (sexo == null)){
	        return imc_Com_MVC;
	    }
	    
	    Double valorImc = peso / (altura * altura);
	    imc_Com_MVC.setValor(valorImc);
	    
	    if(sexo.equals(EnumSexo.MASCULINO)){
	        if(valorImc<20.7){
	        	imc_Com_MVC.setSituacao("Abaixo do peso!");
	        }else if(valorImc>=20.7 && valorImc <26.4){
	        	imc_Com_MVC.setSituacao("No peso Normal!");
	        }
	        else if(valorImc>=26.4 && valorImc <27.8){
	        	imc_Com_MVC.setSituacao("Marginalmente acima do peso!");
	        }else if(valorImc>=27.8 && valorImc <31.1){
	        	imc_Com_MVC.setSituacao("Acima do peso!");
	        }else if(valorImc>=31.1){
	        	imc_Com_MVC.setSituacao("Obeso!");
	        }
	    }else if(sexo.equals(EnumSexo.FEMININO)){
	        if(valorImc<19.1){
	        	imc_Com_MVC.setSituacao("Abaixo do peso!");
	        }else if(valorImc>=19.1 && valorImc <25.8){
	        	imc_Com_MVC.setSituacao("No peso Normal!");
	        } else if(valorImc>=25.8 && valorImc <27.3){
	        	imc_Com_MVC.setSituacao("Marginalmente acima do peso!");
	        }else if(valorImc>=27.3 && valorImc <32.3){
	        	imc_Com_MVC.setSituacao("Acima do peso!");
	        }else if(valorImc>=32.3){
	        	imc_Com_MVC.setSituacao("Obeso!");
	        }
	    }
	    return imc_Com_MVC;
	}
}
