package com.apmanager.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.apmanager.entity.Affiliate;

@Component
public class Validators {

	//private Affiliate affiliate;
	private List<String> validators;

	private String regexValName="^([a-z|A-Z]{1,20}[ ]?){1,5}$";
	private String regexValAge="^[0-9]{1,3}$";
	private String regexValEmail="^[a-zA-Z0-9]{1,256}@[a-zA-Z]{1,256}\\.[a-zA-Z]{1,256}(\\.[a-zA-Z]{1,256})?$";
	
	public List<String> validateAffiliate(Affiliate affiliate, String method){
		this.validators=new ArrayList<>();
		if(affiliate.getId_affiliate()!=null && method.equals("POST")) {validators.add("No puede ingresar Id, este es asignado automaticamente.");}
		else if(affiliate.getId_affiliate()==null && method.equals("PUT")){validators.add("Requiere un Id para ser actualizado.");}
		if(!affiliate.getName().matches(regexValName)) {validators.add("Valores invalidos. Solo se aceptan caracteres tipo String.");}
		if(!String.valueOf(affiliate.getAge()).matches(regexValAge)) {validators.add("Valores invalidos. Edad incorrecta.");}
		if(!affiliate.getMail().matches(regexValEmail)) {validators.add("Valores invalidos. No tiene formato de un Email.");}
		return this.validators;
	}
	/*
	public List<String> validateTest(Test test){
		this.validators.addAll(Arrays.asList(validateName,validateAge,validateEmail));
		return this.validators;
	}
	
	public List<String> validateAppoinment(Appoinment appoinment){
		this.validators.addAll(Arrays.asList(validateName,validateAge,validateEmail));
		return this.validators;
	}*/
	
}
