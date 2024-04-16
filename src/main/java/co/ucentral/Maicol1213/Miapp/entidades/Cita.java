package co.ucentral.Maicol1213.Miapp.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.time.LocalDateTime;

@Entity
public class Cita {

    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String identidad;
    private String correo;
    private String telefono;
    private LocalDateTime fechaHora;
    private String sedeServicio;
    private String tipoServicio;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Constructor, getters y setters
}
