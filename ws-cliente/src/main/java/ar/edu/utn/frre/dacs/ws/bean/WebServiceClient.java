/*
 * (C) Copyright 2014 
 *
 * Univesidad Tecnológica Nacional - Facultad Regional Resistencia.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ar.edu.utn.frre.dacs.ws.bean;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import ar.edu.utn.frre.dacs.ws.client.MathCalculationServer;

/**
 * 
 * @author Dr. Jorge E. Villaverde
 * @version 1.0.0
 * @since 1.0.0
 */
@ManagedBean
@ViewScoped
public class WebServiceClient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final Logger logger = Logger.getLogger(WebServiceClient.class.getName());
	
	// Constants --------------------------------------------------------------
	
	// Properties -------------------------------------------------------------
	
	private int a;
	
	private int b;
	
	private int result;
	
	// Dependencies -----------------------------------------------------------
	
	private URL url;
	
	private QName qname;
	
	private Service service;
	
	private MathCalculationServer calculationService;

	// Methods ----------------------------------------------------------------
	
	@PostConstruct
	public void init() {
		try {
			this.url = new URL("http://localhost:8080/ws-server/MathCalculationService/SimpleMathCalculationServiceImpl?wsdl");

			this.qname = new QName("http://www.frre.utn.edu.ar/wsdl", "MathCalculationService");
			
		    this.service = Service.create(url, qname);

		    this.calculationService = service.getPort(MathCalculationServer.class);
		} catch (MalformedURLException e) {
			logger.severe(e.getMessage());
		}
	}
	
	
	public void execute() {
		logger.info("El valor de a es: " + a + " el valor de b es: " + b);
		this.result = calculationService.sum(a, b);
		logger.info("El resultado es: " + result);
	}

	// Properties -------------------------------------------------------------

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}
	
	

}
