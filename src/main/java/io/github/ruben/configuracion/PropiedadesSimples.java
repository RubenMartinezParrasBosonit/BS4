package io.github.ruben.configuracion;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "my")
public class PropiedadesSimples {
    private int var2;
}
