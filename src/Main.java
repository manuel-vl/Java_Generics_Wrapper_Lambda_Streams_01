import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("Ford", "Fiesta", 1000.0);
        Vehiculo vehiculo2 = new Vehiculo("Ford", "Focus", 1200.0);
        Vehiculo vehiculo3 = new Vehiculo("Ford", "Explorer", 2500.0);
        Vehiculo vehiculo4 = new Vehiculo("Flat", "Uno", 500.0);
        Vehiculo vehiculo5 = new Vehiculo("Flat", "Cronos", 1000.0);
        Vehiculo vehiculo6 = new Vehiculo("Flat", "Torino", 1250.0);
        Vehiculo vehiculo7 = new Vehiculo("Chevrolet", "Aveo", 1250.0);
        Vehiculo vehiculo8 = new Vehiculo("Chevrolet", "Spin", 2500.0);
        Vehiculo vehiculo9 = new Vehiculo("Toyota", "Corola", 1200.0);
        Vehiculo vehiculo10 = new Vehiculo("Toyota", "Fortuner", 3000.0);
        Vehiculo vehiculo11 = new Vehiculo("Renault", "Logan", 950.0);


        List<Vehiculo> listaVehiculos = new ArrayList<>(
                Arrays.asList(vehiculo1, vehiculo2, vehiculo3, vehiculo4, vehiculo5, vehiculo6, vehiculo7, vehiculo8, vehiculo9, vehiculo10, vehiculo10, vehiculo11)
        );

        Garaje<Vehiculo> garaje=new Garaje<Vehiculo>(1, listaVehiculos);

        System.out.println(garaje.ordenadosByPrecio());
        System.out.println(garaje.promedio());
        System.out.println(garaje.menoresA1000());
        System.out.println(garaje.mayoresIgualesA100());
        System.out.println(garaje.ordenadosByMarcaYPrecio());
    }
}
