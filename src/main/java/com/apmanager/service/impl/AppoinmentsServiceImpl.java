/**
 * 
 */
package com.apmanager.service.impl;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apmanager.entity.Affiliate;
import com.apmanager.entity.Appoinment;
import com.apmanager.repository.AppoinmentsRepository;
import com.apmanager.service.AppoinmentsService;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Clase que implementa los metodos de logica de negocio de la interface AppoinmentsService.
 */
@Service
public class AppoinmentsServiceImpl implements AppoinmentsService {
	/**
	 * Bean Repository de Spring inyectado para ejecutar el CRUD.
	 */
	
	@Autowired
	private AppoinmentsRepository appoinmentsRepository;
	
	@Override
	public List<Appoinment> consultarAppoinments() {
		
		List<Appoinment> appoinmentsDataSource = StreamSupport.stream(
				this.appoinmentsRepository.findAll().spliterator(), false)
				.collect(Collectors.toList());
		return appoinmentsDataSource;
	}
	
	@Override
	public List<Appoinment> consultarAppoinmentsxDate(LocalDate date) {
		
		List<Appoinment> appoinmentsDataSource = StreamSupport.stream(
				this.appoinmentsRepository.findAllByDate(date).spliterator(), false)
				.collect(Collectors.toList());
		return appoinmentsDataSource;
	}

	@Override
	public List<Appoinment> consultarAppoinmentsxIdaffiliate(Affiliate idaffiliate) {
		
		List<Appoinment> appoinmentsDataSource = StreamSupport.stream(
				this.appoinmentsRepository.findAllByAffiliateId(idaffiliate).spliterator(), false)
				.collect(Collectors.toList());
		return appoinmentsDataSource;
	}
	
	
	@Override
	public Appoinment consultarAppoinment(Long id_appoinment) {
		Optional<Appoinment> optAffiliate= this.appoinmentsRepository.findById(id_appoinment);
		if(optAffiliate.isPresent()) {
			return optAffiliate.get();
		}
		else {
			return null;
		}
	}

	@Override
	public Appoinment guardarAppoinment(Appoinment appoinment) {
			return this.appoinmentsRepository.save(appoinment);
		}
	

	@Override
	public Appoinment actualizarAppoinments(Appoinment appoinment) {
		if(consultarAppoinment(appoinment.getId_appoinment())!=null) {
			return this.appoinmentsRepository.save(appoinment);
		}else {
			return null;
		}
	}

	@Override
	public String eliminarAppoinment(Long id_appoinment) {
		if(consultarAppoinment(id_appoinment)==null) {
			return "NO OK";
		}else {
			this.appoinmentsRepository.deleteById(id_appoinment);
			return "OK";
		}
	}

}
