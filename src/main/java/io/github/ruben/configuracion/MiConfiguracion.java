package io.github.ruben.configuracion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Configuration
@PropertySource("classpath:miconfiguracion.properties")
public class MiConfiguracion {

    @Value("${valor1:valor1 no tiene valor}")
    private String valor1;

    @Value("${valor2:valor2 no tiene valor}")
    private String valor2;

    @PostConstruct
    private void postInit(){
        System.out.println("valor 1:" + valor1);
        System.out.println("valor 2:" + valor2);
    }
}
