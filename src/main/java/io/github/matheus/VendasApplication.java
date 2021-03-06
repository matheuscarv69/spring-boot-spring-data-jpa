package io.github.matheus;

import io.github.matheus.domain.entity.Cliente;
import io.github.matheus.domain.repository.Clientes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class VendasApplication extends SpringBootServletInitializer {

    @Bean
    public CommandLineRunner commandLineRunner(@Autowired Clientes clientes){
        return args -> {
           // Cliente c = new Cliente(null, "Fulano");

            //clientes.save(c);


        };

    }



    public static void main(String[] args) {
        SpringApplication.run(VendasApplication.class, args);

    }
}
