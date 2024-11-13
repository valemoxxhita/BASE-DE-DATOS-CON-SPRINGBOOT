package com.example.ServidorSura5.SERVICIOS;

import com.example.ServidorSura5.MODELOS.Enfermedad;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioEnfermedad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioEnfermedad {

  //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioEnfermedad iRepositorioEnfermedad;

    //2. Se programan las funcines para las distintas operaciones en la base de Datos
    // Funcion para guardar datos

    public Enfermedad guardarEnfermedad(Enfermedad datosEnfermedad) throws Exception {
        try {
            return iRepositorioEnfermedad.save(datosEnfermedad);

        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}