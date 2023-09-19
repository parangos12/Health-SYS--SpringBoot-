/**
 * 
 */
package com.apmanager.controllers;

import java.util.List;
import java.util.Optional;

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

import com.apmanager.DTO.AffiliateDTO;
import com.apmanager.entity.Affiliate;
import com.apmanager.service.AffiliatesService;
import com.apmanager.util.Validators;

/**
 * @author Pedro
 * @version 1.0 28/12/2022
 * Controlador que manipula el flujo de los servicios REST del microservicio TESTS.
 */
@RestController
@RequestMapping("api/controllers/affiliates")
public class AffiliatesControllers {
	
	@Autowired
	private AffiliatesService affiliatesService;
	
	@Autowired
	private Validators validators;
	
	@GetMapping
	public ResponseEntity<List<Affiliate>> consultarAffiliates() {
		List<Affiliate> listAffiliates=this.affiliatesService.consultarAffiliates();
		if(listAffiliates.isEmpty()) {
			return ResponseEntity.noContent().build();
		}else {
			return ResponseEntity.ok(listAffiliates);
			}
	}
	
	@GetMapping("/{id_affiliate}")
	public ResponseEntity<Affiliate> consultarAffiliate(@PathVariable Long id_affiliate) {
		Optional<Affiliate> optAffiliate=affiliatesService.consultarAffiliate(id_affiliate);
		return optAffiliate.map(ResponseEntity::ok).orElseGet(()->ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<AffiliateDTO> guardarAffiliate(@RequestBody Affiliate affiliate) {
		
		AffiliateDTO affiliateDTO=new AffiliateDTO();
		Affiliate responseAffiliate=new Affiliate(affiliate.getName(),affiliate.getAge(),affiliate.getMail());
					
		List<String> validators=this.validators.validateAffiliate(affiliate,"POST");
		
		if(validators.isEmpty()) {
			affiliateDTO.setStatus(HttpStatus.CREATED.value());
			affiliateDTO.setMensaje("El afiliado ha sido guardado con exito");
			affiliateDTO.setAffiliate(this.affiliatesService.guardarAffiliates(responseAffiliate));	
			return ResponseEntity.status(HttpStatus.CREATED).body(affiliateDTO); 
		}else {
			affiliateDTO.setStatus(HttpStatus.BAD_REQUEST.value());
			affiliateDTO.setMensaje("El afiliado dado no ha sido guardado debido a: "+String.join(" ", validators));
			affiliateDTO.setAffiliate(responseAffiliate); 
			return new ResponseEntity<>(affiliateDTO, HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping
	public ResponseEntity<AffiliateDTO> actualizarAffiliate(@RequestBody Affiliate affiliate) {
		
		AffiliateDTO affiliateDTO=new AffiliateDTO();
		Affiliate responseAffiliate=new Affiliate(affiliate.getId_affiliate(),affiliate.getName(),affiliate.getAge(),affiliate.getMail());
					
		List<String> validators=this.validators.validateAffiliate(affiliate,"PUT");
		
		if(validators.isEmpty()) {
			affiliateDTO.setStatus(HttpStatus.CREATED.value());
			affiliateDTO.setMensaje("El afiliado ha sido actualizado con exito");
			affiliateDTO.setAffiliate(this.affiliatesService.actualizarAffiliates(responseAffiliate));	
			return ResponseEntity.status(HttpStatus.CREATED).body(affiliateDTO); 
		}else {
			affiliateDTO.setStatus(HttpStatus.BAD_REQUEST.value());
			affiliateDTO.setMensaje("El afiliado dado no ha sido actualizado debido a: "+String.join(" ", validators));
			affiliateDTO.setAffiliate(responseAffiliate); 
			return new ResponseEntity<>(affiliateDTO, HttpStatus.BAD_REQUEST);
		}
	}
	
	
	@DeleteMapping("/{id_affiliate}")
	public ResponseEntity<AffiliateDTO> eliminarAffiliate(@PathVariable Long id_affiliate) {
		AffiliateDTO affiliateDTO=new AffiliateDTO();

		if(this.affiliatesService.existeAffiliate(id_affiliate)) {
			affiliateDTO.setStatus(HttpStatus.NO_CONTENT.value());
			affiliateDTO.setMensaje("El afiliado ha sido eliminado con exito");
			this.affiliatesService.eliminarAffiliate(id_affiliate);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(affiliateDTO);
		}else {
			affiliateDTO.setStatus(HttpStatus.NOT_FOUND.value());
			affiliateDTO.setMensaje("El afiliado que intenta eliminar no existe");
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(affiliateDTO);}
	}
	
}