package br.com.impacta.ibpf.ibpfinvestimento;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class IbpfInvestimentoApplication {

	public static void main(String[] args) {
		SpringApplication.run(IbpfInvestimentoApplication.class, args);
	}

}
