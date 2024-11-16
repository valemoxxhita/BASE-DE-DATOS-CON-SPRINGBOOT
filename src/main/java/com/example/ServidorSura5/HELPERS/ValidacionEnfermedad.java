package com.example.ServidorSura5.HELPERS;
import com.example.ServidorSura5.MODELOS.Enfermedad;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionEnfermedad {
    private Enfermedad enfermedad = new Enfermedad();

    public boolean validarNombre(String nombre) {
        String expresionregular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron = Pattern.compile(expresionregular);
        Matcher coincidencia = patron.matcher(nombre);
        return coincidencia.find();
    }
    public boolean validarSintomas (String sintomas){
        String REGEX = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(sintomas);
        return coincidencia.find();
    }
    public boolean validarClasificacion (String clasificacion){
        String REGEX = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(clasificacion);
        return coincidencia.find();
    }
    public boolean validarGrado (String grado){
        String REGEX = "^[0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(grado);
        return coincidencia.find();
    }
    public boolean validarProbabilidad(String probabilidadDeVida){
        String REGEX = "^[a-zA-Z]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(probabilidadDeVida);
        return coincidencia.find();
    }
}