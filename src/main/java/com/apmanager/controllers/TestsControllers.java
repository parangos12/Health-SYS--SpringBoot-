/**
 * 
 */
package com.apmanager.controllers;

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

import com.apmanager.entity.Test;
import com.apmanager.service.TestsService;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Controlador que manipula el flujo de los servicios REST del microservicio TESTS.
 */
@RestController
@RequestMapping("api/controller/tests")
public class TestsControllers {
	
	@Autowired
	private TestsService testServiceImpl;
	
	
	@GetMapping
	@RequestMapping(value="",method = RequestMethod.GET)
	public ResponseEntity<?> consultarTests() {
		List<Test> testsConsultados=this.testServiceImpl.consultarTests();
		if(testsConsultados.isEmpty()) {
			return new ResponseEntity<>(testsConsultados, HttpStatus.NO_CONTENT);
		}else {
			return new ResponseEntity<>(testsConsultados, HttpStatus.OK);
			}
	}
	
	@GetMapping
	@RequestMapping(value="/{id_test}",method = RequestMethod.GET)
	public ResponseEntity<Test> consultarTest(@PathVariable Long id_test) {
		Test response=testServiceImpl.consultarTest(id_test);
		
		if(response==null) {
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
	public ResponseEntity<?> guardarTest(@RequestBody Test test) {
	
	if(test.getName().isEmpty() || test.getDescription().isEmpty()) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);}
	if(number(test.getName())+number(test.getDescription())==2) {
		Test testGuardado=this.testServiceImpl.guardarTests(test);
		return ResponseEntity.status(HttpStatus.CREATED).body(testGuardado);
	}
	else {
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);}
	}

	@PutMapping
	@RequestMapping(value="",method = RequestMethod.PUT)
	public ResponseEntity<?> actualizarTest(@RequestBody Test test) {
		if(this.testServiceImpl.actualizarTests(test)==null || test.getName().isEmpty() || test.getDescription().isEmpty() || (number(test.getName())+number(test.getDescription())!=2) ) 
		{
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		try {
			Test testActualizado=this.testServiceImpl.actualizarTests(test);
			return ResponseEntity.status(HttpStatus.CREATED).body(testActualizado);
		}catch(Exception e) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);}

	}
	
	
	@DeleteMapping
	@RequestMapping(value="/{id_test}",method = RequestMethod.DELETE)
	public ResponseEntity<String> eliminarTest(@PathVariable Long id_test) {
		String resp=this.testServiceImpl.eliminarTest(id_test);
		if("OK".equalsIgnoreCase(resp)) {
			 return new ResponseEntity<>(null, HttpStatus.OK);
		}else {
			 return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
	}
	

	
	
	
	
	

}
