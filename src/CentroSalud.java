
public abstract class CentroSalud {
    protected String id;
    protected String nombre;
    protected String direccion;
    protected int nivelComplejidad;
    protected boolean guardia24h;

    public CentroSalud(String id, String nombre, String direccion, int nivelComplejidad, boolean guardia24h) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.nivelComplejidad = nivelComplejidad;
        this.guardia24h = guardia24h;
    }

    public abstract String descripcion();

    public String getId() { return id; }
    public String getNombre() { return nombre; }
}
