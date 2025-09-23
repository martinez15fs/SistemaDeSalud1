import java.util.Map;

public class Urgencias extends ServicioAtencion {
    private double tarifaBase;

    public Urgencias(String codigo, String nombre, double tarifaBase) {
        super(codigo, nombre);
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularCosto(Map<String, Object> contexto) {
        int nivel = (contexto != null && contexto.containsKey("nivelUrgencia"))
                ? ((Number) contexto.get("nivelUrgencia")).intValue()
                : 3;
        return tarifaBase * (1 + (nivel - 1) * 0.25);
    }

    @Override
    public String descripcion() {
        return "Urgencias. Tarifa base: " + tarifaBase;
    }
}
