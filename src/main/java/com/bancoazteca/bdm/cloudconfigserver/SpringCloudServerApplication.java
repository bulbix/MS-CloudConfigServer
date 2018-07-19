package com.bancoazteca.bdm.cloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.context.config.annotation.RefreshScope;

/**
 * @author Cesar M Orozco R
 *
 */

@SpringBootApplication
@EnableConfigServer
@RefreshScope
public class SpringCloudServerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudServerApplication.class, args);
	}

}
