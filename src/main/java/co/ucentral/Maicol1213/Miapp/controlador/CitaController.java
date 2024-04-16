package co.ucentral.Maicol1213.Miapp.controlador;

import co.ucentral.Maicol1213.Miapp.entidades.Cita;
import co.ucentral.Maicol1213.Miapp.servicios.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CitaController {

    @Autowired
    private CitaService citaService;

    @PostMapping("/citas/solicitar")
    public ResponseEntity<String> solicitarCita(@RequestBody Cita cita) {
        citaService.guardarCita(cita);
        return ResponseEntity.ok("Cita solicitada exitosamente");
    }
}
