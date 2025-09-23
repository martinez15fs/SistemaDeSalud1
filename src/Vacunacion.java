import java.util.Map;

public class Vacunacion extends ServicioAtencion {
    private double tarifaBase;

    public Vacunacion(String codigo, String nombre, double tarifaBase) {
        super(codigo, nombre);
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularCosto(Map<String, Object> contexto) {
        return tarifaBase;
    }

    @Override
    public String descripcion() {
        return "Vacunación. Tarifa base: " + tarifaBase;
    }
}
