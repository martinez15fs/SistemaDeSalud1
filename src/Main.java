import model.*;
import repository.*;

import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PacienteRepository pacienteRepo = new PacienteRepository();
        MedicoRepository medicoRepo = new MedicoRepository();
        RegistroAtencionRepository registroRepo = new RegistroAtencionRepository();

        Paciente p1 = new Paciente("P001", "Gonzalez", "Ana", "F", "Cll 10 #20-30");
        Paciente p2 = new Paciente("P002", "Ramirez", "Luis", "M", "Cll 50 #10-15");
        pacienteRepo.create(p1);
        pacienteRepo.create(p2);

        Medico m1 = new Medico("M001", "Lopez", "Carlos", "M", "Cra 7 #34-21", "Pediatría", "REG-1234");
        Medico m2 = new Medico("M002", "Perez", "Mariana", "F", "Av 5 #11-02", "Medicina General", "REG-5678");
        medicoRepo.create(m1);
        medicoRepo.create(m2);

        CentroSalud c1 = new Clinica("C001", "Clínica San José", "Cll 5 #6-7", 2, true);
        CentroSalud c2 = new PuestoSalud("C002", "Puesto La Esperanza", "Cra 2 #3-4", 1, false);

        ServicioAtencion consulta = new ConsultaExterna("S-CONS-001", "Consulta general", 50.0);
        ServicioAtencion urgencia = new Urgencias("S-URG-001", "Urgencia general", 100.0);
        ServicioAtencion vacuna = new Vacunacion("S-VAC-001", "Vacunación Influenza", 15.0);

        Map<String,Object> contexto1 = new HashMap<>();
        contexto1.put("procedimiento", true);
        registroRepo.add(new RegistroAtencion(p1, m2, c1, consulta, LocalDateTime.now().minusDays(1), "Dolor de garganta", contexto1));

        Map<String,Object> contexto2 = new HashMap<>();
        contexto2.put("nivelUrgencia", 4);
        registroRepo.add(new RegistroAtencion(p2, m1, c1, urgencia, LocalDateTime.now(), "Trauma leve", contexto2));

        registroRepo.add(new RegistroAtencion(p1, m2, c2, vacuna, LocalDateTime.now(), "Vacunación anual", null));

        registroRepo.findAll().forEach(System.out::println);
    }
}
