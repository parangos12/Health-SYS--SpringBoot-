/**
 * 
 */
package com.apmanager.controllers;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.apmanager.entity.Affiliate;
import com.apmanager.entity.Appoinment;
import com.apmanager.service.AppoinmentsService;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Controlador que manipula el flujo de los servicios REST del microservicio TESTS.
 */
@RestController
@RequestMapping("api/controllers/appoinments")
public class AppoinmentsControllers {
	
	@Autowired
	private AppoinmentsService appoinmentsServiceImpl;
	
	
	@GetMapping
	@RequestMapping(value="",method = RequestMethod.GET)
	public ResponseEntity<?> consultarAppoinments() {
		List<Appoinment> appoinmentsConsultados=this.appoinmentsServiceImpl.consultarAppoinments();
		if(appoinmentsConsultados.isEmpty()) {
			return new ResponseEntity<>(appoinmentsConsultados, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(appoinmentsConsultados, HttpStatus.OK);
			}
	}
	
	@GetMapping
	@RequestMapping(value="/{id_appoinment}",method = RequestMethod.GET)
	public ResponseEntity<Appoinment> consultarAppoinment(@PathVariable Long id_appoinment) {
		Appoinment response=appoinmentsServiceImpl.consultarAppoinment(id_appoinment);
		
		if(response==null) {
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}

	@GetMapping
	@RequestMapping(value="getByDate/{date}",method = RequestMethod.GET)
	public ResponseEntity<?> consultarAppoinmentxDate(@PathVariable LocalDate date) {
		List<Appoinment> response=appoinmentsServiceImpl.consultarAppoinmentsxDate(date);
		
		if(response.isEmpty()) {
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}	
	
	@GetMapping
	@RequestMapping(value="getbyIdAffiliate/{id_affiliate}",method = RequestMethod.GET)
	public ResponseEntity<?> consultarAppoinmentxIdAffiliate(@PathVariable Affiliate id_affiliate) {
		List<Appoinment> response=appoinmentsServiceImpl.consultarAppoinmentsxIdaffiliate(id_affiliate);
		
		if(response.isEmpty()) {
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}else {
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
	}	
	
	
	
	public Integer number(String s) {
		try {
			double n_converted=Double.parseDouble(s);
			return (int) (n_converted-n_converted);
		}catch(Exception e) {
			return 1;
		}
	}
	@PostMapping
	@RequestMapping(value="",method = RequestMethod.POST)
	public ResponseEntity<?> guardarAppoinment(@RequestBody Appoinment appoinment) 
	{
		if(appoinment.getDate().equals(null) || appoinment.getHour().equals(null) ||appoinment.getId_test().getId_test().equals(null)||appoinment.getAffiliateId().getId_affiliate().equals(null) || appoinment.getId_test().getId_test()<0) 
		{
				return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		if(number(String.valueOf(appoinment.getAffiliateId().getId_affiliate()))+number(String.valueOf(appoinment.getId_test().getId_test()))==0)
		{
			Appoinment appoinmentGuardado=this.appoinmentsServiceImpl.guardarAppoinment(appoinment);
			return ResponseEntity.status(HttpStatus.CREATED).body(appoinmentGuardado);
		}
		else
		{
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping
	@RequestMapping(value="",method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarAppoinment(@RequestBody Appoinment appoinment) {
		if(this.appoinmentsServiceImpl.actualizarAppoinments(appoinment)==null || appoinment.getDate().equals(null) || appoinment.getHour().equals(null) || appoinment.getId_test().getId_test().equals(null)||appoinment.getAffiliateId().getId_affiliate().equals(null) || appoinment.getId_test().getId_test()<0) 
		{
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		try {
			Appoinment affiliateActualizado=this.appoinmentsServiceImpl.actualizarAppoinments(appoinment);
			return ResponseEntity.status(HttpStatus.CREATED).body(affiliateActualizado);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);}
	}
	
	
	@DeleteMapping
	@RequestMapping(value="/{id_appoinment}",method = RequestMethod.DELETE)
	public ResponseEntity<String> eliminarAffiliate(@PathVariable Long id_appoinment) {
		String resp=this.appoinmentsServiceImpl.eliminarAppoinment(id_appoinment);
		if("OK".equalsIgnoreCase(resp)) {
			 return new ResponseEntity<>(null, HttpStatus.OK);
		}else {
			 return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	

	
	
	
	
	

}
