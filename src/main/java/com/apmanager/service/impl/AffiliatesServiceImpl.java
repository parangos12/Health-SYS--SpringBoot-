/**
 * 
 */
package com.apmanager.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apmanager.entity.Affiliate;
import com.apmanager.repository.AffiliatesRepository;
import com.apmanager.service.AffiliatesService;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Clase que implementa los metodos de logica de negocio de la interface AffiliatesService.
 */
@Service
public class AffiliatesServiceImpl implements AffiliatesService {
	/**
	 * Bean Repository de Spring inyectado para ejecutar el CRUD.
	 */
	
	@Autowired
	private AffiliatesRepository affiliatesRepository;
	
	@Override
	public List<Affiliate> consultarAffiliates() {
		Iterable<Affiliate>  affiliateIterable=affiliatesRepository.findAll();
		List<Affiliate> affiliateListAll=new ArrayList<>();
		affiliateIterable.forEach(a->affiliateListAll.add(a));
		return affiliateListAll;
	}

	@Override
	public Optional<Affiliate> consultarAffiliate(Long id_affiliate) {
		Optional<Affiliate> affiliateById=affiliatesRepository.findById(id_affiliate);
		return affiliateById;
		}

	@Override
	public Affiliate guardarAffiliates(Affiliate affiliate) {
			return this.affiliatesRepository.save(affiliate);
		}
	

	@Override
	public Affiliate actualizarAffiliates(Affiliate affiliate) {
		if(consultarAffiliate(affiliate.getId_affiliate())!=null) {
			return this.affiliatesRepository.save(affiliate);
		}else {
			return null;
		}
	}

	@Override
	public void eliminarAffiliate(Long id_affiliate) {
		this.affiliatesRepository.deleteById(id_affiliate);
	}

	@Override
	public boolean existeAffiliate(Long id_affiliate) {
		return this.affiliatesRepository.existsById(id_affiliate);
	}

}
