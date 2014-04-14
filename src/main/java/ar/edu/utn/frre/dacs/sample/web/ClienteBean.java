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
package ar.edu.utn.frre.dacs.sample.web;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import ar.edu.utn.frre.dacs.sample.dao.ClienteDao;
import ar.edu.utn.frre.dacs.sample.model.Cliente;

/**
 * 
 * @author Jorge E. Villaverde
 * @version 1.0.0
 * @since 1.0.0
 */
@Model
public class ClienteBean implements Serializable {

	// Constants --------------------------------------------------------------
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Properties -------------------------------------------------------------

	// Dependencies -----------------------------------------------------------
	
	@Inject
	private ClienteDao clienteDao;

	// Getters/Setters --------------------------------------------------------
	
	public List<Cliente> getClientes() {
		return clienteDao.findAll();
	}
	
	// Actions ----------------------------------------------------------------
}
