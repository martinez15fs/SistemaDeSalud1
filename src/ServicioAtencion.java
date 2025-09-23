import java.util.Map;

public abstract class ServicioAtencion {
    protected String codigo;
    protected String nombre;

    public ServicioAtencion(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public abstract double calcularCosto(Map<String, Object> contexto);
    public abstract String descripcion();

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
}
