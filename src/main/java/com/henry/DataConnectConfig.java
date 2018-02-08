package com.henry;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.henry.SfdcServicesClient;

@Configuration
public class DataConnectConfig {
    
    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        // this package must match the package in the <generatePackage> specified in pom.xml
        marshaller.setContextPath("sales.wsdl");
        return marshaller;
    }
    
    @Bean
    public SfdcServicesClient sfdcServicesClient(Jaxb2Marshaller marshaller) {
        SfdcServicesClient client = new SfdcServicesClient();
        client.setDefaultUri("http://sfdcservices-dev.covidien.com/SFDC.Services.Proxy.Proxy.svc");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
