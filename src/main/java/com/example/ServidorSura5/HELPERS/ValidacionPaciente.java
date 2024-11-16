package com.example.ServidorSura5.HELPERS;
import com.example.ServidorSura5.MODELOS.Paciente;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionPaciente
{
    // 1. Inyectar un objeto de la clase modelo.

    private Paciente paciente = new Paciente();

    // 2. Creamos un metodo para cada campo que quiero validar
    public boolean validarNombre (String nombre) {
        //1. Se consulta una expresión regular, almacenándola en una variable STRING
        String expresionregular = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        //2. Activar el patrón
        Pattern patron = Pattern.compile(expresionregular);
        //3. Se busca coinciencia entre la cadena y el patron
        Matcher coincidencia = patron.matcher(nombre);
        //4. Indico si hubo o no coincidencia
        return coincidencia.find();
    }
    public boolean validarFechaNacimiento (String anionacimiento){
        String REGEX =  "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(anionacimiento);
        return coincidencia1.find();
    }

    public boolean validarCiudad (String ciudad){
        String REGEX = "^[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(ciudad);
        return coincidencia1.find();
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
    public boolean validarIps (String ips) {
        String REGEX = "^[a-zA-ZñÑ0-9._%+-]+@sura\\.com$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(ips);
        return coincidencia1.find();
    }
    public boolean validarGrupo (String grupoIngresos) {
        return "A".equalsIgnoreCase(grupoIngresos) || "B".equalsIgnoreCase(grupoIngresos) || "C".equalsIgnoreCase(grupoIngresos);
    }
    public boolean validarFechaAfiliacion  (String fechaAfiliacion) {
        String REGEX =  "^\\d{4}-\\d{2}-\\d{2}$";
        Pattern patron1 = Pattern.compile(REGEX);
        Matcher coincidencia1 = patron1.matcher(fechaAfiliacion);
        return coincidencia1.find();
    }
}



