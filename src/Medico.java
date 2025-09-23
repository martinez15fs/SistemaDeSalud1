public class Medico extends Persona {
    private String especialidad;
    private String registroProfesional;

    public Medico(String codigo, String apellidos, String nombres, String sexo, String direccion,
                  String especialidad, String registroProfesional) {
        super(codigo, apellidos, nombres, sexo, direccion);
        this.especialidad = especialidad;
        this.registroProfesional = registroProfesional;
    }

    @Override
    public String tipoIdentificacion() {
        return "Cédula médico";
    }

    @Override
    public String toString() {
        return "Medico{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombreCompleto() + '\'' +
                ", especialidad='" + especialidad + '\'' +
                '}';
    }
}
