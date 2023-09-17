/**
 * 
 */
package com.apmanager.service;

import java.util.List;

import com.apmanager.entity.Test;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Interface que contiene los metodos de logica de negocio para los TESTS.
 */
public interface TestsService {
	
	/**
	 * Metodo que permite consultar todos los listado de Test
	 * @return Listado todos los Test.
	 */
	List<Test> consultarTests();
	
	/**
	 * Metodo que permite consultar un test por su id.
	 * @param test {@link Long} objeto test a consultar por su id.
	 * @return información del test por su id.
	 */
	Test consultarTest(Long id_test);
	
	/**
	 * Metodo que permite guardar un test.
	 * @param Test {@link Test} objeto test a guardar.
	 * @return test guardado
	 */
	
	Test guardarTests(Test test);
	
	/**
	 * Metodo que permite actualizar un test.
	 * @param Test {@link Test} objeto test a actualizar.
	 * @return test actualizado.
	 */
	
	Test actualizarTests(Test test);
	
	/**
	 * Metodo que permite eliminar un test.
	 * @param Test {@link Long} objeto test a eliminar por su id.
	 * @return test eliminado.
	 */
	String eliminarTest(Long id_test);
	
	
}
