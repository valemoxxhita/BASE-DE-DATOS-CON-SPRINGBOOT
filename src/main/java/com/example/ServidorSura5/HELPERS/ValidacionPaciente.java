/* package com.example.ServidorSura5.HELPERS;

import com.example.ServidorSura5.MODELOS.Paciente;

import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente
{
    // 1. Inyectar un objeto de la clase modelo.

    private Paciente paciente = new Paciente();

    // 2. Creamos un metodo para cada campo que quiero validar



    public boolean validarNombres (String nombres) {
        //1. Se consulta una expresión regular, almacenándola en una variable STRING
        String expresionregular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";

        //2. Activar el patrón
        Pattern patron = Pattern.compile(expresionregular);

        //3. Se busca coinciencia entre la cadena y el patron

        Matcher coincidencia = patron.matcher(nombres);

        //4. Indico si hubo o no coincidencia

        if (coincidencia.find()) {
            return true;
        } else {
            return false;
        }

    }
    public boolean validarFechaNacimiento (LocalDate anionacimiento){}

    public boolean validarCiudad (String ciudad){
        String REGEX = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(ciudad);
        if(coincidencia1.find()){
            return true;
        }

        else {
            return false;
        }
    }
    public boolean validarCorreo (String correo) {
        String REGEX = "^[a-zA-ZñÑ0-9._%+-]+@sura\\.com$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(correo);
        if(coincidencia1.find()){
            return true;
        }

        else {
            return false;
        }
    }
    public boolean validarTelefono (String telefono) {
        String REGEX = "^[0-9]+$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(telefono);
        if(coincidencia1.find()){
            return true;
        }

        else {
            return false;
        }
    }
    public boolean validarIps (String ips) {
        String REGEX = "^[a-zA-ZñÑ0-9._%+-]+@sura\\.com$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(ips);
        if(coincidencia1.find()){
            return true;
        }

        else {
            return false;
        }
    }
    public boolean validarGrupo (String grupoIngresos) {}
    public boolean validarFechaAfiliacion  (LocalDate fechaAfiliacion) {}

}
 */
