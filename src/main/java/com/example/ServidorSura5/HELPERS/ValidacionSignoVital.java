package com.example.ServidorSura5.HELPERS;
import com.example.ServidorSura5.MODELOS.SignoVital;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionSignoVital {
    private SignoVital signoVital = new SignoVital();

    public boolean validarNombre (String nombre){
        String REGEX = "^[a-zA-Z0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(nombre);
        return coincidencia.find();
    }
    public boolean validarValor (String valor){
        String REGEX = "^[a-zA-Z0-9/°]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(valor);
        return coincidencia.find();
    }
    public boolean validarFechaMedida (String fechaMedida){
        String REGEX =  "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(fechaMedida);
        return coincidencia1.find();
    }
}