package com.henry.servlet;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBElement;

import org.apache.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.henry.DataConnectConfig;
import com.henry.SfdcServicesClient;
import com.henry.controller.GameController;
import com.henry.model.Card;

import sales.wsdl.ArrayOfHistoryItem;
import sales.wsdl.GetSalesHistoryProductDetailsResponse;
import sales.wsdl.GetSalesHistoryResponse;
import sales.wsdl.HistoryItem;


@SpringBootApplication
public class GeneralServlet extends HttpServlet {
    
    Logger _logger = Logger.getLogger(GeneralServlet.class.getName());
    
	private static final long serialVersionUID = 1L;
	
	GameController _controller = new GameController();
	   
    private SfdcServicesClient _client;
    AbstractApplicationContext  context = new AnnotationConfigApplicationContext(DataConnectConfig.class);
    
    public GeneralServlet() {
        super();
        _client = (SfdcServicesClient)context.getBean("sfdcServicesClient");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	    _logger.debug("request.getRequestURI()  " + request.getRequestURI());
	    if (request.getRequestURI().contains("sendit"))
	    {
	        GetSalesHistoryProductDetailsResponse rez =  _client.getSalesHistory();
	      
	      
	      _logger.debug("rez: " + rez.getGetSalesHistoryProductDetailsResult());
	      JAXBElement<ArrayOfHistoryItem> arrayOfHistoryItem = rez.getGetSalesHistoryProductDetailsResult();
	      ArrayOfHistoryItem s = arrayOfHistoryItem.getValue();

	      for (HistoryItem hi : s.getHistoryItem() )
	      {
	          _logger.debug("rez: " + hi.getQuantity());

	      }
          response.getWriter().append(Arrays.toString(s.getHistoryItem().toArray()));
	    }
	    else
	    {
	        this.processCards(request, response);
	    }
	  
	}

	private void processCards(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
	    String count = request.getParameter("count");
        String deal = request.getParameter("deal");
        String reset = request.getParameter("shuffle");
        if (Boolean.valueOf(count).booleanValue()) {
            response.getWriter().append(Integer.toString(_controller.getDeckSize()));
        } else if (Boolean.valueOf(deal).booleanValue()) {
               Card card = _controller.deal();
               
               if (card != null) {
                   response.getWriter().append("<span style='color : " + card.getColor().toString().toLowerCase() 
                               + "'>" + card.getRank() + " of " + card.getSuite() + "</span>");
               }
      
        } else if (Boolean.valueOf(reset).booleanValue()) {
            _controller.shuffle();
            response.getWriter().append("shuffled");
   
     } else {
           response.getWriter().append("Served at: ").append(request.getContextPath());
        }

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
