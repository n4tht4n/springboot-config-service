package com.polarbookshop.configservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * To turn the project into a functioning config server only needs to add
 * the `@EnableConfigServer` annotation. That is all to do on the Java side.
 *
 * The other part is the configuration of the config server 😉. See the
 * `application.yml` for that, the normal place of config stuff.
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServiceApplication.class, args);
	}

}
