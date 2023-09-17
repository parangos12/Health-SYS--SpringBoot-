/**
 * 
 */
package com.apmanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apmanager.entity.Test;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Interface que contiene el CRUD con Spring JPA para la tabla de Test.
 */
@Repository
public interface TestsRepository extends CrudRepository<Test, Long> {
	
}
