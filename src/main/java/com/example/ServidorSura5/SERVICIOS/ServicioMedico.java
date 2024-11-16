package com.example.ServidorSura5.SERVICIOS;
import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioMedico {

    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioMedico iRepositorioMedico;

    //2. Se programan las funcines para las distintas operaciones en la base de Datos
    // Funcion para guardar datos

    public Medico guardarMedico(Medico datosMedico) throws Exception {
        try {
            return iRepositorioMedico.save(datosMedico);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}
