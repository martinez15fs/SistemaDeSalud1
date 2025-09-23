import java.time.LocalDateTime;
import java.util.Map;
import java.util.UUID;

public class RegistroAtencion {
    private String id;
    private Paciente paciente;
    private Medico medico;
    private CentroSalud centro;
    private ServicioAtencion servicio;
    private LocalDateTime fecha;
    private String motivo;
    private Map<String, Object> contexto;

    public RegistroAtencion(Paciente paciente, Medico medico, CentroSalud centro,
                            ServicioAtencion servicio, LocalDateTime fecha, String motivo,
                            Map<String, Object> contexto) {
        this.id = UUID.randomUUID().toString();
        this.paciente = paciente;
        this.medico = medico;
        this.centro = centro;
        this.servicio = servicio;
        this.fecha = fecha;
        this.motivo = motivo;
        this.contexto = contexto;
    }

    public double calcularCosto() {
        return servicio.calcularCosto(contexto);
    }

    @Override
    public String toString() {
        return "RegistroAtencion{" +
                "id='" + id + '\'' +
                ", paciente=" + paciente.nombreCompleto() +
                ", medico=" + medico.nombreCompleto() +
                ", centro=" + centro.getNombre() +
                ", servicio=" + servicio.getNombre() +
                ", fecha=" + fecha +
                ", costo=" + calcularCosto() +
                '}';
    }
}
