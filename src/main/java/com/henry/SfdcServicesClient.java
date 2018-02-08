package com.henry;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBElement;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import sales.wsdl.CustomerWrapper;
import sales.wsdl.GetContractEligibilityByRoot;
import sales.wsdl.GetContractEligibilityByRootResponse;
import sales.wsdl.ObjectFactory;

public class SfdcServicesClient extends WebServiceGatewaySupport {

    public GetContractEligibilityByRootResponse getSalesHistory()
    {
        
        GetContractEligibilityByRoot request = new GetContractEligibilityByRoot();

        ObjectFactory factory = new ObjectFactory();
        CustomerWrapper arrayOfCustomer = factory.createCustomerWrapper();
        

        //JAXBElement<CustomerWrapper> customers = factory.createArrayOfstring(arrayOfCustomer);
  
        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());
        XMLGregorianCalendar startDate = null;
        XMLGregorianCalendar endDate = null;
        try {
            endDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            c.add(Calendar.YEAR, -1);
            startDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        } catch (DatatypeConfigurationException e) {
            e.printStackTrace();
        }

        //request.setProducts(products);
        
        JAXBElement<String> salesOrg = factory.createString("NEL");
        //request.setSalesOrg(salesOrg);
        
        WebServiceTemplate template = getWebServiceTemplate();
        SoapActionCallback callback = new SoapActionCallback("http://tempuri.org/IProxy/GetSalesHistoryProductDetails");
        
        GetContractEligibilityByRootResponse response 
              = (GetContractEligibilityByRootResponse) 
                      template.marshalSendAndReceive("http://sfdcservices-dev.covidien.com/SFDC.Services.Proxy.Proxy.svc", request, callback);
        
        return response;
        
    }
    
}
