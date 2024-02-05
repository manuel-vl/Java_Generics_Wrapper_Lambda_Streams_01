import java.util.List;

public class Garaje<T> {
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
}
