/**
 * This is the main class that starts the REST API application.
 */
package org.tse.mr.restAPI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestApiApplication {

	/**
	 * The main method that starts the REST API application.
	 *
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(RestApiApplication.class, args);
	}

}
