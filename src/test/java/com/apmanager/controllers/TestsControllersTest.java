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

import com.apmanager.service.TestsService;

@ExtendWith(MockitoExtension.class)
class TestsControllersTest {

	@InjectMocks
	private TestsControllers testController=new TestsControllers();
	
	@Mock
	private TestsService testsServiceMock;
	
	@Autowired
	com.apmanager.entity.Test mockTest= new com.apmanager.entity.Test();
	
	@BeforeEach
	void setUp() {
		mockTest.setDescription("This is a description example");
		mockTest.setId_test(7L);
		mockTest.setName("Paracetamol");
	}
	
	@Test
	void testGetTests() {
		when(testsServiceMock.consultarTests()).thenReturn(Collections.emptyList());
		var response = testController.consultarTests();
		Assertions.assertEquals(HttpStatus.NO_CONTENT, response.getStatusCode());
		
		List<com.apmanager.entity.Test> listResponse= new ArrayList<com.apmanager.entity.Test>();
		listResponse.add(mockTest);
		listResponse.add(mockTest);
		listResponse.add(mockTest);
		
		when(testsServiceMock.consultarTests()).thenReturn(listResponse);
		var response1 = testController.consultarTests();
		Assertions.assertEquals(HttpStatus.OK, response1.getStatusCode());
	}
	
	@Test
	void testGetTest() {
		
		ResponseEntity<com.apmanager.entity.Test> responseService;		
		when(testsServiceMock.consultarTest(7L)).thenReturn(mockTest);
		responseService = testController.consultarTest(7L);
		Assertions.assertEquals("Paracetamol", responseService.getBody().getName());
		Assertions.assertEquals(HttpStatus.OK, responseService.getStatusCode());

		when(testsServiceMock.consultarTest(5L)).thenReturn(null);
		responseService = testController.consultarTest(5L);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, responseService.getStatusCode());
	}
	
	@Test
	void testPostTest() {
		
		when(testsServiceMock.guardarTests(mockTest)).thenReturn(mockTest);
		var response = testController.guardarTest(mockTest);
		Assertions.assertEquals(HttpStatus.CREATED, response.getStatusCode());
		
		mockTest.setDescription("");
		var response1 = testController.guardarTest(mockTest);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, response1.getStatusCode());
	}
	
	@Test
	void testPutTest() {
				
		when(testsServiceMock.actualizarTests(mockTest)).thenReturn(mockTest);
		var responseService1 = testController.actualizarTest(mockTest);
		Assertions.assertEquals(HttpStatus.CREATED, responseService1.getStatusCode());
		
		mockTest.setDescription("");
		var response1 = testController.actualizarTest(mockTest);
		Assertions.assertEquals(HttpStatus.NOT_FOUND, response1.getStatusCode());
	}
	
	@Test
	void testDeleteTest() {
		
		when(testsServiceMock.eliminarTest(7L)).thenReturn("OK");
		var response = testController.eliminarTest(7L);
		Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
		
		when(testsServiceMock.eliminarTest(5L)).thenReturn("NO OK");
		var response2 = testController.eliminarTest(5L);
		Assertions.assertEquals(HttpStatus.NO_CONTENT, response2.getStatusCode());
	}
}
