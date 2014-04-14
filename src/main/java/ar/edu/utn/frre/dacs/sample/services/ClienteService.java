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
package ar.edu.utn.frre.dacs.sample.services;

import ar.edu.utn.frre.dacs.sample.model.Cliente;

/**
 * Servicios de negocio para Clientes.
 * @author Jorge E. Villaverde
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ClienteService {
	
	void createClienteSiEsMayorEdad(Cliente cliente) 
			throws ClienteMenorEdadException;
	
}
