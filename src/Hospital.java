public class Hospital extends CentroSalud {
    private boolean unidadCritica;

    public Hospital(String id, String nombre, String direccion, int nivelComplejidad, boolean guardia24h, boolean unidadCritica) {
        super(id, nombre, direccion, nivelComplejidad, guardia24h);
        this.unidadCritica = unidadCritica;
    }

    @Override
    public String descripcion() {
        return "Hospital: " + nombre + " - Unidad crítica: " + unidadCritica;
    }
}
