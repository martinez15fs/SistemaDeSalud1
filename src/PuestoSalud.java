public class PuestoSalud extends CentroSalud {
    public PuestoSalud(String id, String nombre, String direccion, int nivelComplejidad, boolean guardia24h) {
        super(id, nombre, direccion, nivelComplejidad, guardia24h);
    }

    @Override
    public String descripcion() {
        return "Puesto de Salud: " + nombre;
    }
}
