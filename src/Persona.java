public abstract class Persona {
    protected String codigo;
    protected String apellidos;
    protected String nombres;
    protected String sexo;
    protected String direccion;

    public Persona(String codigo, String apellidos, String nombres, String sexo, String direccion) {
        this.codigo = codigo;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public String nombreCompleto() {
        return apellidos + " " + nombres;
    }

    public String getCodigo() { return codigo; }
    public abstract String tipoIdentificacion();

    // Getters y setters
    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }
    public String getNombres() { return nombres; }
    public void setNombres(String nombres) { this.nombres = nombres; }
    public String getSexo() { return sexo; }
    public void setSexo(String sexo) { this.sexo = sexo; }
    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }
}
