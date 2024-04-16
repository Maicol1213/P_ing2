package co.ucentral.Maicol1213.Miapp.servicios;

import co.ucentral.Maicol1213.Miapp.entidades.Cita;
import co.ucentral.Maicol1213.Miapp.repositorios.CitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaService {

    @Autowired
    private CitaRepository citaRepository;

    public void guardarCita(Cita cita) {
        citaRepository.save(cita);
    }
}

