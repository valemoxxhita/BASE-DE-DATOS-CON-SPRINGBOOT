package com.example.ServidorSura5.HELPERS;
import com.example.ServidorSura5.MODELOS.Medicamento;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionMedicamento {
    private Medicamento medicamento = new Medicamento();

    public boolean validarNombre(String nombre){
        String REGEX = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(nombre);
        return coincidencia.find();
    }
    public boolean validarPresentacion(String presentacion){
        String REGEX = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(presentacion);
        return coincidencia.find();
    }
    public boolean validarDosis(String dosis){
        String REGEX = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(dosis);
        return coincidencia.find();
    }
    public boolean validarLaboratorio(String laboratorio){
        String REGEX = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(laboratorio);
        return coincidencia.find();
    }
    public boolean validarFechaCaducidad (String fechaCaducidad) {
        String REGEX =  "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(fechaCaducidad);
        return coincidencia1.find();
    }
    public boolean validarContraindicaciones(String contraindicaciones){
        String REGEX = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(contraindicaciones);
        return coincidencia.find();
    }
    public boolean validarRegistroInvima(String registroInvima){
        String REGEX = "^[a-zA-ZáéíóúÁÉÍÓÚñÑ0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(registroInvima);
        return coincidencia.find();
    }
        public boolean validarCopago(String copago){
        String REGEX = "^[0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(copago);
        return coincidencia.find();
    }
}
