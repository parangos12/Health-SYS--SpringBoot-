/**
 * 
 */
package com.apmanager.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import com.apmanager.entity.Affiliate;

import com.apmanager.entity.Appoinment;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Interface que contiene el CRUD con Spring JPA para la tabla de Appoinment.
 */
public interface AppoinmentsRepository extends CrudRepository<Appoinment, Long> {
	List<Appoinment> findAllByDate(LocalDate date);
	List<Appoinment> findAllByAffiliateId(Affiliate idaffiliate);

}
