/*package com.apmanager.controllers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.*;

import com.apmanager.DTO.AffiliateDTO;
import com.apmanager.entity.Affiliate;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class AffiliatesControllersTest2 {

	private TestRestTemplate testRestTemplate;
	
	@Autowired
	private RestTemplateBuilder restTemplateBuilder;
	
	@LocalServerPort
	private int port;
	
	@BeforeEach
	void setUp() {
		restTemplateBuilder=restTemplateBuilder.rootUri("http://localhost:"+port);
		testRestTemplate =new TestRestTemplate(restTemplateBuilder);
	}
	
	@Test
	void testConsultarAffiliates() {
		ResponseEntity<Affiliate[]> response=
				testRestTemplate.getForEntity("/api/controller/affiliates", Affiliate[].class);
		List<Object> affiliates=Arrays.asList(response.getBody());
		assertEquals(HttpStatus.OK, response.getStatusCode());
		assertEquals(181,affiliates.size());
		//FALTA EL NOT_CONTENT
	}

	@Test
	void testConsultarAffiliate() {
		ResponseEntity<Affiliate> response=
				testRestTemplate.getForEntity("/api/controller/affiliates/1", Affiliate.class);
		String affiliateJSON="""
				{
					    "id_affiliate": 1,
						"name": "***",
						"age": 15,
						"mail": "ngonnely0@bloglovin.com"
				}
				""";
		Affiliate affiliate1=response.getBody();
		assertEquals(1, response.getBody().getId_affiliate());
		assertEquals("***", response.getBody().getName());
		assertEquals(15, response.getBody().getAge());
		assertEquals("ngonnely0@bloglovin.com", response.getBody().getMail());


	}

	@Test
	void testGuardarAffiliate() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	
        String affiliateJSON="""
        		{
				    "name": "Nikolos Ppppp",
				    "age": 11,
				    "mail": "parangos@eafit.edu.co"
                }
                """;
        HttpEntity<String> request=new HttpEntity<>(affiliateJSON,headers);
        ResponseEntity<AffiliateDTO> response=testRestTemplate.exchange("/api/controller/affiliates", HttpMethod.POST,request,AffiliateDTO.class);
        AffiliateDTO resultAffiliate=response.getBody();
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
	}

	@Test
	void testActualizarAffiliate() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	
        String affiliateJSON="""
				{
				    "id_affiliate": 34,
				    "name": "Pedro Arango",
				    "age": 22,
				    "mail": "parangos@eafit.edu.co"
				}
                """;
        HttpEntity<String> request=new HttpEntity<>(affiliateJSON,headers);
        ResponseEntity<AffiliateDTO> response=testRestTemplate.exchange("/api/controller/affiliates", HttpMethod.PUT,request,AffiliateDTO.class);
        AffiliateDTO resultAffiliate=response.getBody();
        assertEquals(HttpStatus.CREATED, response.getStatusCode());
	}

	@Test
	void testEliminarAffiliate() {
        HttpEntity<String> request=new HttpEntity<>(null,null);
        ResponseEntity<AffiliateDTO> response=testRestTemplate.exchange("/api/controller/affiliates/199", HttpMethod.DELETE,request,AffiliateDTO.class);
        assertEquals(HttpStatus.NO_CONTENT,response.getStatusCode());
	}

}*/
