/**
 * 
 */
package com.apmanager.repository;

import org.springframework.data.repository.CrudRepository;

import com.apmanager.entity.Affiliate;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Interface que contiene el CRUD con Spring JPA para la tabla de Affiliate.
 */
public interface AffiliatesRepository extends CrudRepository<Affiliate, Long> {

}
