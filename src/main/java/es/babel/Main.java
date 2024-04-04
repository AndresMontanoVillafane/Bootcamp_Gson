package es.babel;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        empleado.setNombre("Patricio");
        empleado.setPuesto("Jefazo");
        empleado.setEdad(25);
        System.out.println("Realizando el proceso de toJson: ");
        System.out.println(new Gson().toJson(empleado));
        System.out.println("Proceso finalizado");

        System.out.println("Realizando el proceso fromJson: ");
        Empleado empleadoNuevo = new Empleado();
        //empleadoNuevo = new Gson().fromJson();
    }
}