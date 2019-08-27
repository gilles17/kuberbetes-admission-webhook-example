package com.huifu.k8s.awh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.huifu.k8s.awh")
public class AdmissionWebhookApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdmissionWebhookApplication.class, args);
	}

}
