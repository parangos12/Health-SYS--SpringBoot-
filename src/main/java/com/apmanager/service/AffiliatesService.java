/**
 * 
 */
package com.apmanager.service;

import java.util.List;
import java.util.Optional;

import com.apmanager.entity.Affiliate;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Interface que contiene los metodos de logica de negocio para los AFFILIATES.
 */
public interface AffiliatesService {
	
	/**
	 * Metodo que permite consultar todos los listado de Affiliates
	 * @return Listado todos los Affiliates.
	 */
	List<Affiliate> consultarAffiliates();
	
	/**
	 * Metodo que permite consultar un Affiliate por su id.
	 * @param Affiliate {@link Long} objeto Affiliate a consultar por su id.
	 * @return información del Affiliate por su id.
	 */
	Optional<Affiliate> consultarAffiliate(Long id_affiliate);
	
	/**
	 * Metodo que permite guardar un Affiliate.
	 * @param Affiliate {@link Affiliate} objeto Affiliate a guardar.
	 * @return Affiliate guardado
	 */
	
	Affiliate guardarAffiliates(Affiliate affiliate);
	
	/**
	 * Metodo que permite actualizar un Affiliate.
	 * @param Affiliate {@link Affiliate} objeto Affiliate a actualizar.
	 * @return Affiliate actualizado.
	 */
	
	Affiliate actualizarAffiliates(Affiliate affiliate);
	
	/**
	 * Metodo que permite eliminar un Affiliate.
	 * @param Affiliate {@link Long} objeto Affiliate a eliminar por su id.
	 * @return Affiliate eliminado.
	 */
	void eliminarAffiliate(Long id_affiliate);
	
	boolean existeAffiliate(Long id_affiliate);
	
	
}
