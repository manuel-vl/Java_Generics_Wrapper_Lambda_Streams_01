import java.util.Comparator;
import java.util.List;

public class Garaje<T extends Vehiculo> {
    private Integer id;
    private List<T> listaVehiculos;

    // Constructor
    public Garaje(Integer id, List<T> listaVehiculos) {
        this.id = id;
        this.listaVehiculos = listaVehiculos;
    }

    // Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<T> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<T> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    // Methods
    protected List<T> ordenadosByPrecio() {
        // Utiliza Comparator.comparing y pasamos el tipo junto con el valor a tener en cuenta para ordenar vehículos
        return listaVehiculos.stream().sorted(Comparator.comparing(Vehiculo::getCosto)).toList();
    }

    protected List<T> ordenadosByMarcaYPrecio(){
        // Utiliza Comparator.comparing y pasamos el tipo junto con el valor a tener en cuenta para ordenar los vehiculos
        return listaVehiculos.stream().sorted(Comparator.comparing(Vehiculo::getCosto)).sorted(Comparator.comparing(Vehiculo::getMarca)).toList();
    }

    protected List<T> menoresA1000(){
        return  listaVehiculos.stream().filter(v -> v.getCosto() < 1000).toList();
    }

    protected List<T> mayoresIgualesA100(){
        return listaVehiculos.stream().filter(v->v.getCosto() >= 1000).toList();
    }

    protected Double promedio(){
        return listaVehiculos.stream().mapToDouble(Vehiculo::getCosto).average().orElse(0);
    }
}
