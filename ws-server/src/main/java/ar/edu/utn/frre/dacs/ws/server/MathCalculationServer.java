/*
 * (C) Copyright 2014 
 *
 * Univesidad Tecnol�gica Nacional - Facultad Regional Resistencia.
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
package ar.edu.utn.frre.dacs.ws.server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;


/**
 * Provee los servicios de c&aacute;lculo m&aacute;tematico.
 * @author Dr. Jorge E. Villaverde
 * @version 1.0.0
 * @since 1.0.0
 */
@WebService
public interface MathCalculationServer {
	@WebMethod
	int sum(@WebParam(name="a")
			int a, 
			@WebParam(name="b")
			int b);
	
}
