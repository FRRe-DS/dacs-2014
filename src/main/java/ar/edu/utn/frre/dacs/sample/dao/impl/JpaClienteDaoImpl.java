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
package ar.edu.utn.frre.dacs.sample.dao.impl;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import ar.edu.utn.frre.dacs.sample.dao.ClienteDao;
import ar.edu.utn.frre.dacs.sample.model.Cliente;

/**
 * 
 * @author Jorge E. Villaverde
 * @version 1.0.0
 * @since 1.0.0
 */
@Stateless
@Local(ClienteDao.class)
public class JpaClienteDaoImpl implements ClienteDao {

	// Constants --------------------------------------------------------------
	
	// Properties -------------------------------------------------------------
	
	// Dependencies -----------------------------------------------------------
	
    /**
     * Entity Manager
     */
    @PersistenceContext
    private EntityManager em;
	
	// Overrides --------------------------------------------------------------
	
	@Override
	public void create(Cliente cliente) {
		em.persist(cliente);
	}

	@Override
	public Cliente findById(Long id) {
		return em.find(Cliente.class, id);
	}

	@Override
	public void update(Cliente cliente) {
		em.refresh(cliente);		
	}

	@Override
	public void delete(Cliente cliente) {
		em.remove(cliente);		
	}

	@Override
	public List<Cliente> findAll() {
		CriteriaBuilder builder = em.getCriteriaBuilder();
		
		CriteriaQuery<Cliente> query = builder.createQuery(Cliente.class);
		
		Root<Cliente> root = query.from(Cliente.class);
		
		CriteriaQuery<Cliente> all = query.select(root);
		
        TypedQuery<Cliente> allQuery = em.createQuery(all);
        
        return allQuery.getResultList();
	}

}
