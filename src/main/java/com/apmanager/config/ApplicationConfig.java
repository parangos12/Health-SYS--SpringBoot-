package com.apmanager.config;

import javax.sql.DataSource;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.gson.Gson;

import software.amazon.awssdk.auth.credentials.AwsBasicCredentials;
import software.amazon.awssdk.auth.credentials.AwsCredentialsProvider;
import software.amazon.awssdk.auth.credentials.StaticCredentialsProvider;
import software.amazon.awssdk.regions.Region;
import software.amazon.awssdk.services.secretsmanager.SecretsManagerClient;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueRequest;
import software.amazon.awssdk.services.secretsmanager.model.GetSecretValueResponse;	

@Configuration
public class ApplicationConfig{	
	
    //Gson to convert Java objects<-->JSON
    private Gson gson=new Gson();
    
   // @Value("${cloud.aws.credentials.access-key}")
     String accessKeyId="AKIAT34LR6WUXSRQR3TX";
    
    //@Value("${cloud.aws.credentials.secret-key}")
     String secretAccessKey="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";

	@Bean
	public DataSource dataSource() {
		AwsSecrets secrets=getSecret();
		return DataSourceBuilder
				.create()
				//.driverClassName("com.mysql.cj.jdbc.Driver")
				.url("jdbc:mysql"+"://"+secrets.getHost()+":"+secrets.getPort()+"/appManagement")
				.username(secrets.getUsername())
				.password(secrets.getPassword())
				.build();
	}
	

	public AwsSecrets getSecret() {

	    String secretName = "rds-App-Management";
	    Region region = Region.of("us-east-1");

	    
	    AwsCredentialsProvider credentialsProvider = StaticCredentialsProvider.create(
	    		AwsBasicCredentials.create(accessKeyId, secretAccessKey)
	    		);
	    
	    // Create a Secrets Manager client
	    SecretsManagerClient client = SecretsManagerClient.builder()
	            .region(region).credentialsProvider(credentialsProvider)
	            .build();

	    GetSecretValueRequest getSecretValueRequest = GetSecretValueRequest.builder()
	            .secretId(secretName)
	            .build();

	    GetSecretValueResponse getSecretValueResponse;

	    try {
	        getSecretValueResponse = client.getSecretValue(getSecretValueRequest);
	    } catch (Exception e) {
	        throw e;
	    }

	    String secret = getSecretValueResponse.secretString();
	    return gson.fromJson(secret, AwsSecrets.class);
	}
}
