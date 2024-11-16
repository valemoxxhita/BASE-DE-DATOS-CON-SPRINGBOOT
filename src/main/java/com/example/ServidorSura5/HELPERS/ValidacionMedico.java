package com.example.ServidorSura5.HELPERS;
import com.example.ServidorSura5.MODELOS.Enfermedad;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionMedico {
    private Enfermedad enfermedad = new Enfermedad();

    public boolean validarNombre(String nombre){
        String REGEX = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(nombre);
        return coincidencia.find();
    }
    public boolean validarMatricula (String matriculaProfesional){
        String REGEX = "^[a-zA-Z0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(matriculaProfesional);
        return coincidencia.find();
    }
    public boolean validarEspecialidad (String especialidad){
        String REGEX = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(especialidad);
        return coincidencia.find();
    }
    public boolean validarSalario (String salario){
        String REGEX = "^[0-9]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(salario);
        return coincidencia.find();
    }
    public boolean validarIps (String ips){
        String REGEX = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron = Pattern.compile(REGEX);
        Matcher coincidencia = patron.matcher(ips);
        return coincidencia.find();
    }
    public boolean validarCorreo (String correo) {
        String REGEX = "^[a-zA-ZñÑ0-9._%+-]+@sura\\.com$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(correo);
        return coincidencia1.find();
    }
    public boolean validarTelefono (String telefono) {
        String REGEX = "^[0-9]+$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(telefono);
        return coincidencia1.find();
    }
    public boolean validarDireccion (String direccionConsultorio) {
        String REGEX = "^[\\dA-Za-zÁÉÍÓÚáéíóúñÑ\\s,.#-]+$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(direccionConsultorio);
        return coincidencia1.find();
    }
    public boolean validarDisponibilidad (String finDeSemanaDisponible) {
        String REGEX = "^(true|false)$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(finDeSemanaDisponible);
        return coincidencia1.find();
    }
}
