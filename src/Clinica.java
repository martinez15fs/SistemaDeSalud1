public class Clinica extends CentroSalud {
    public Clinica(String id, String nombre, String direccion, int nivelComplejidad, boolean guardia24h) {
        super(id, nombre, direccion, nivelComplejidad, guardia24h);
    }

    @Override
    public String descripcion() {
        return "Clínica: " + nombre;
    }
}
