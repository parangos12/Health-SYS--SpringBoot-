/**
 * 
 */
package com.apmanager.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apmanager.entity.Test;
import com.apmanager.repository.TestsRepository;
import com.apmanager.service.TestsService;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Clase que implementa los metodos de logica de negocio de la interface TestService.
 */
@Service
public class TestsServiceImpl implements TestsService {
	/**
	 * Bean Repository de Spring inyectado para ejecutar el CRUD.
	 */
	
	@Autowired
	private TestsRepository testsRepository;
	
	@Override
	public List<Test> consultarTests() {
		
		List<Test> testsDataSource = StreamSupport.stream(
				this.testsRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return testsDataSource;
	}

	@Override
	public Test consultarTest(Long id_test) {
		Optional<Test> optTest= this.testsRepository.findById(id_test);
		if(optTest.isPresent()) {
			return optTest.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Test guardarTests(Test test) {
		if(test.getName().isEmpty()) {
			return null;
		}else {
			return this.testsRepository.save(test);
		}
	}

	@Override
	public Test actualizarTests(Test test) {
		if(consultarTest(test.getId_test())!=null) {
			return this.testsRepository.save(test);
		}else {
			return null;
		}
	}

	@Override
	public String eliminarTest(Long id_test) {
		if(consultarTest(id_test)==null) {
			return "NO OK";
		}else {
			this.testsRepository.deleteById(id_test);
			return "OK";
		}
	}

}
