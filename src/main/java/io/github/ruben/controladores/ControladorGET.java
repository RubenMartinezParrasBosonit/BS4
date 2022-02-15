package io.github.ruben.controladores;

import io.github.ruben.configuracion.MiConfiguracion;
import io.github.ruben.configuracion.PropiedadesSimples;
import io.github.ruben.interfaces.Perfiles;
import io.github.ruben.objetos.Perfil1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorGET {

    @Autowired
    PropiedadesSimples propiedadesSimples;

    @Autowired
    MiConfiguracion miConfiguracion;

    @Autowired
    private Environment env;

    @Autowired
    Perfiles perfiles;

    @Value("${VAR_SISTEMA:var3 no tiene valor}")
    private String var3;

    @GetMapping("/get/valores")
    public String getPropiedades(){
        return "valor de var1 es: " + env.getProperty("var1") + ", valor de my.var2 es: " + propiedadesSimples.toString();
    }

    @GetMapping("/get/var3")
    public String getValor3(){
        return "valor de var3 es: " + var3;
    }

    @GetMapping("/parametros")
    public String getParametros(){
        return "url: " + env.getProperty("url") + ", password: " + env.getProperty("password");
    }

    @GetMapping("/miconfiguracion")
    public String getConfiguracion(){
        return miConfiguracion.toString();
    }

    @GetMapping("/perfil")
    public String getPerfil(){
        perfiles.miFuncion();
        return perfiles.toString();
    }
}
