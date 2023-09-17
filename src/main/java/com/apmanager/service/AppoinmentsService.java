/**
 * 
 */
package com.apmanager.service;

import java.time.LocalDate;
import java.util.List;

import com.apmanager.entity.Affiliate;
import com.apmanager.entity.Appoinment;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Interface que contiene los metodos de logica de negocio para los APPOINMENTS.
 */
public interface AppoinmentsService {
	
	/**
	 * Metodo que permite consultar todos los listado de Appoinments
	 * @return Listado todos los Appoinments.
	 */
	List<Appoinment> consultarAppoinments();
	
	/**
	 * Metodo que permite consultar todos los listado de appoiments X Date
	 * @return Listado todos los Appoinments x fecha.
	 */
	List<Appoinment> consultarAppoinmentsxDate(LocalDate date);
	
	
	/**
	 * Metodo que permite consultar todos los listado de appoiments X IdAffiliate
	 * @return Listado todos los Appoinments x id del afiliado.
	 */
	List<Appoinment> consultarAppoinmentsxIdaffiliate(Affiliate idaffiliate);
	
	/**
	 * Metodo que permite consultar un Appoinments por su id.
	 * @param Appoinment {@link Long} objeto Appoinments a consultar por su id.
	 * @return información del Appoinment por su id.
	 */
	Appoinment consultarAppoinment(Long id_appoinment);
	
	/**
	 * Metodo que permite guardar un Appoinment.
	 * @param Appoinment {@link Appoinment} objeto Appoinment a guardar.
	 * @return Appoinment guardado
	 */
	
	Appoinment guardarAppoinment(Appoinment appoinment);
	
	/**
	 * Metodo que permite actualizar un Appoinment.
	 * @param Appoinment {@link Appoinment} objeto Appoinment a actualizar.
	 * @return Appoinment actualizado.
	 */
	
	Appoinment actualizarAppoinments(Appoinment appoinment);
	
	/**
	 * Metodo que permite eliminar un Appoinment.
	 * @param Appoinment {@link Long} objeto Appoinment a eliminar por su id.
	 * @return Appoinment eliminado.
	 */
	String eliminarAppoinment(Long id_appoinment);
	
	
}
