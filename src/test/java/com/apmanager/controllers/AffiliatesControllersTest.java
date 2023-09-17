package com.apmanager.controllers;

import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.apmanager.entity.Affiliate;
import com.apmanager.service.AffiliatesService;

@ExtendWith(MockitoExtension.class)
class AffiliatesControllersTest {

	
	@InjectMocks
	private AffiliatesControllers affiliateController=new AffiliatesControllers();
	
	@Mock
	private AffiliatesService affiliateServiceMock;
	
	@Autowired
	Affiliate mockAffiliate=new Affiliate();
	
	@BeforeEach
	void setUp() {
		mockAffiliate.setAge(1);
		mockAffiliate.setId_affiliate(1L);
		mockAffiliate.setMail("ngonnely0@bloglovin.com");
		mockAffiliate.setName("Nikolos Gonnely");

	}
	
	@Test
	void testGetAffiliates() {
		when(affiliateServiceMock.consultarAffiliates()).thenReturn(Collections.emptyList());
		var response = affiliateController.consultarAffiliates();
		Assertions.assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
		
		List<Affiliate> listResponse= new ArrayList<Affiliate>();
		listResponse.add(mockAffiliate);
		listResponse.add(mockAffiliate);
		listResponse.add(mockAffiliate);
		
		when(affiliateServiceMock.consultarAffiliates()).thenReturn(listResponse);
		var response1 = affiliateController.consultarAffiliates();
		Assertions.assertEquals(HttpStatus.OK, response1.getStatusCode());
	}
	/*
	@Test
	void testGetAffiliate() {
		ResponseEntity<Affiliate> responseService;
		when(affiliateServiceMock.consultarAffiliate(1L)).thenReturn(mockAffiliate);
		responseService = affiliateController.consultarAffiliate(1L);
		Assertions.assertEquals("Nikolos Gonnely", responseService.getBody().getName());
		Assertions.assertEquals(HttpStatus.OK, responseService.getStatusCode());
		
		when(affiliateServiceMock.consultarAffiliate(5L)).thenReturn(null);
		responseService = affiliateController.consultarAffiliate(5L);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, responseService.getStatusCode());
	}*/
	/*
	@Test
	void testPostAffiliate() {

		when(affiliateServiceMock.guardarAffiliates(mockAffiliate)).thenReturn(mockAffiliate);
		var response = affiliateController.guardarAffiliate(mockAffiliate);
		Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
		
		mockAffiliate.setAge(-700);
		var response1 = affiliateController.guardarAffiliate(mockAffiliate);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, response1.getStatusCode());
		
	}*/
	/*
	@Test
	void testPutAffiliate() {
		
		when(affiliateServiceMock.actualizarAffiliates(mockAffiliate)).thenReturn(mockAffiliate);
		var responseService1 = affiliateController.actualizarAffiliate(mockAffiliate);
		Assertions.assertEquals(HttpStatus.CREATED, responseService1.getStatusCode());
		
		mockAffiliate.setAge(-800);
		var response1 = affiliateController.actualizarAffiliate(mockAffiliate);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, response1.getStatusCode());
	}*/
	/*
	@Test
	void testDeleteAffiliate() {
		
		when(affiliateServiceMock.eliminarAffiliate(4L)).thenReturn("OK");
		var response = affiliateController.eliminarAffiliate(4L);
		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
		
		when(affiliateServiceMock.eliminarAffiliate(5L)).thenReturn("NO OK");
		var response2 = affiliateController.eliminarAffiliate(5L);
		Assertions.assertEquals(HttpStatus.NO_CONTENT, response2.getStatusCode());
	}*/
	
}
