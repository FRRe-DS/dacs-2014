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
package ar.edu.utn.frre.dacs.sample.dao;

import java.util.List;

import ar.edu.utn.frre.dacs.sample.model.Cliente;

/**
 * Capa de Acceso a Datos para Clientes.
 * <p>Provee acceso CRUD para los Clientes.</p>
 * @author Jorge E. Villaverde
 * @version 1.0.0
 * @since 1.0.0
 */
public interface ClienteDao {
	
	/**
	 * Crea un <code>Cliente</code> en el repositorio.
	 * @param cliente Cliente a ser persitido en el repositorio.
	 */
	void create(Cliente cliente);
	
	/**
	 * Busca un <code>Cliente</code> por su Id.
	 * @param id Id de Cliente a buscar.
	 * @return Cliente en caso de encontrase, <code>null</code> si no se encuentra.
	 */
	Cliente findById(Long id);
	
	/**
	 * Actualiza un <code>Cliente</code> en el repositorio.
	 * @param cliente Cliente a ser actualizado.
	 */
	void update(Cliente cliente);
	
	/**
	 * Elimina un <code>Cliente</code> del repositorio.
	 * @param cliente Cliente a ser eliminado.
	 */
	void delete(Cliente cliente);
	
	/**
	 * Devuelve la lista de todos los <code>Cliente</code>. 
	 * @return Lista de clientes.
	 */
	List<Cliente> findAll();
	
}
