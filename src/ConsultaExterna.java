import java.util.Map;

public class ConsultaExterna extends ServicioAtencion {
    private double tarifaBase;

    public ConsultaExterna(String codigo, String nombre, double tarifaBase) {
        super(codigo, nombre);
        this.tarifaBase = tarifaBase;
    }

    @Override
    public double calcularCosto(Map<String, Object> contexto) {
        double adicional = 0;
        if (contexto != null && Boolean.TRUE.equals(contexto.get("procedimiento"))) {
            adicional = tarifaBase * 0.5;
        }
        return tarifaBase + adicional;
    }

    @Override
    public String descripcion() {
        return "Consulta externa. Tarifa base: " + tarifaBase;
    }
}
