public class Paciente extends Persona {
    public Paciente(String codigo, String apellidos, String nombres, String sexo, String direccion) {
        super(codigo, apellidos, nombres, sexo, direccion);
    }

    @Override
    public String tipoIdentificacion() {
        return "Cédula";
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombreCompleto() + '\'' +
                '}';
    }
}
