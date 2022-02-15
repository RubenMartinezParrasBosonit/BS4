package io.github.ruben.objetos;

import io.github.ruben.interfaces.Perfiles;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Profile("perfil2")
@Component
public class Perfil2 implements Perfiles {
    private final String perfil = "perfil2";

    @Override
    public void miFuncion() {
        System.out.println("Este es el perfil2");
    }
}
