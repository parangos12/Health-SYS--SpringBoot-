package com.apmanager.controllers;

import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.LocalTime;
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
import com.apmanager.entity.Appoinment;
import com.apmanager.service.AppoinmentsService;



@ExtendWith(MockitoExtension.class)
class AppoinmentsControllersTest {

	@InjectMocks
	private AppoinmentsControllers appoinmentController=new AppoinmentsControllers();
	
	@Mock
	private AppoinmentsService appoinmentServiceMock;
	
	@Autowired
	Affiliate mockAffiliate=new Affiliate();
	
	@Autowired
	com.apmanager.entity.Test mockTest= new com.apmanager.entity.Test();
	
	@Autowired
	Appoinment mockAppoinment= new Appoinment();

	@Autowired
	List<Appoinment> listResponse= new ArrayList<Appoinment>();

	@BeforeEach
	void setUp() {

		mockAffiliate.setAge(1);
		mockAffiliate.setId_affiliate(1L);
		mockAffiliate.setMail("ngonnely0@bloglovin.com");
		mockAffiliate.setName("Nikolos Gonnely");
		
		mockTest.setDescription("This is a description example");
		mockTest.setId_test(7L);
		mockTest.setName("Paracetamol");
		
		mockAppoinment.setId_appoinment(5L);
		mockAppoinment.setDate(LocalDate.of(2023, 01, 02));
		mockAppoinment.setHour(LocalTime.of(13, 50, 00));
		mockAppoinment.setId_test(mockTest);
		mockAppoinment.setAffiliateId(mockAffiliate);
		
		listResponse.add(mockAppoinment);
		listResponse.add(mockAppoinment);
		listResponse.add(mockAppoinment);
	}
	
	@Test
	void testGetAppoinments() {
		when(appoinmentServiceMock.consultarAppoinments()).thenReturn(Collections.emptyList());
		var response = appoinmentController.consultarAppoinments();
		Assertions.assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
		
		when(appoinmentServiceMock.consultarAppoinments()).thenReturn(listResponse);
		var response1 = appoinmentController.consultarAppoinments();
		Assertions.assertEquals(HttpStatus.OK, response1.getStatusCode());

	}

	@Test
	void testGetAppoinment() {
		ResponseEntity<Appoinment> responseService;

		when(appoinmentServiceMock.consultarAppoinment(5L)).thenReturn(mockAppoinment);
		responseService = appoinmentController.consultarAppoinment(5L);
		Assertions.assertEquals(HttpStatus.OK, responseService.getStatusCode());
		
		when(appoinmentServiceMock.consultarAppoinment(5L)).thenReturn(null);
		responseService = appoinmentController.consultarAppoinment(5L);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, responseService.getStatusCode());

	}
	
	@Test
	void testPostAppoinment() {
				
		when(appoinmentServiceMock.guardarAppoinment(mockAppoinment)).thenReturn(mockAppoinment);
		var response = appoinmentController.guardarAppoinment(mockAppoinment);
		Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
		
		mockTest.setId_test(-7000L);
		var response1 = appoinmentController.guardarAppoinment(mockAppoinment);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, response1.getStatusCode());
		
	}
	
	@Test
	void testPutAppoinment() {
				
		when(appoinmentServiceMock.actualizarAppoinments(mockAppoinment)).thenReturn(mockAppoinment);
		var responseService = appoinmentController.actualizarAppoinment(mockAppoinment);
		Assertions.assertEquals(HttpStatus.CREATED, responseService.getStatusCode());
		
		mockTest.setId_test(-7000L);
		var response1 = appoinmentController.actualizarAppoinment(mockAppoinment);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, response1.getStatusCode());
	}
	
	@Test
	void testDeleteAppoinment() {
		
		when(appoinmentServiceMock.eliminarAppoinment(5L)).thenReturn("OK");
		var response = appoinmentController.eliminarAffiliate(5L);
		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
		
		when(appoinmentServiceMock.eliminarAppoinment(5L)).thenReturn("NO OK");
		var response2 = appoinmentController.eliminarAffiliate(5L);
		Assertions.assertEquals(HttpStatus.NO_CONTENT, response2.getStatusCode());
		
	}
	
	@Test
	void testGetAppoinmentByDate() {

		when(appoinmentServiceMock.consultarAppoinmentsxDate(LocalDate.of(2022, 01, 02))).thenReturn(Collections.emptyList());
		var responseService= appoinmentController.consultarAppoinmentxDate(LocalDate.of(2022, 01, 02));
		Assertions.assertEquals(HttpStatus.NOT_FOUND, responseService.getStatusCode());
		
		when(appoinmentServiceMock.consultarAppoinmentsxDate(LocalDate.of(2022, 01, 02))).thenReturn(listResponse);
		var responseService1= appoinmentController.consultarAppoinmentxDate(LocalDate.of(2022, 01, 02));
		Assertions.assertEquals(HttpStatus.OK, responseService1.getStatusCode());

	}
	
	@Test
	void testGetAppoinmentByIdAffiliate() {

		when(appoinmentServiceMock.consultarAppoinmentsxIdaffiliate(mockAffiliate)).thenReturn(Collections.emptyList());
		var responseService= appoinmentController.consultarAppoinmentxIdAffiliate(mockAffiliate);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, responseService.getStatusCode());
		

		when(appoinmentServiceMock.consultarAppoinmentsxIdaffiliate(mockAffiliate)).thenReturn(listResponse);
		var responseService1= appoinmentController.consultarAppoinmentxIdAffiliate(mockAffiliate);
		Assertions.assertEquals(HttpStatus.OK, responseService1.getStatusCode());

	}
	
	
	
	
	
	
	
}
