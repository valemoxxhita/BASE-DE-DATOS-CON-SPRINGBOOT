package com.example.ServidorSura5.SERVICIOS;
import com.example.ServidorSura5.MODELOS.Medicamento;
import com.example.ServidorSura5.MODELOS.Medico;
import com.example.ServidorSura5.MODELOS.Paciente;
import com.example.ServidorSura5.REPOSITORIOS.IRepositorioMedicamento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioMedicamento {

    //1. Llamar al repositorio respectivo
    @Autowired
    IRepositorioMedicamento iRepositorioMedicamento;

    //2. Se programan las funcines para las distintas operaciones en la base de Datos
    // Funcion para guardar datos

    public Medicamento guardarMedicamento(Medicamento datosMedicamento) throws Exception {
        try {
            return iRepositorioMedicamento.save(datosMedicamento);
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
    public List<Medicamento> buscarMedicamentos() throws Exception {
        try {
            return iRepositorioMedicamento.findAll();
        } catch (Exception error) {
            throw new Exception(error.getMessage());
        }
    }
}

