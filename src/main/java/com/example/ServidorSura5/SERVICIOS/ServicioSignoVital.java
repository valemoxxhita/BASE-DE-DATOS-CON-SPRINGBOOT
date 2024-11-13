package com.example.ServidorSura5.SERVICIOS;

import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.MODELOS.SignoVital;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedico;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioSignoVital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioSignoVital {

    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioSignoVital iRepositorioSignoVital;

    //2. Se programan las funcines para las distintas operaciones en la base de Datos
    // Funcion para guardar datos

    public SignoVital guardarSignoVital(SignoVital datosSignoVital) throws Exception {
        try {
            return iRepositorioSignoVital.save(datosSignoVital);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
