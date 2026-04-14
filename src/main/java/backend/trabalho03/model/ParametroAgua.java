package backend.trabalho03.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class ParametroAgua {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime dataRegistro;
    private Double ph;
    private Double temperatura;
    private Double amonia;
    private Double nitrito;
    private Double nitrato;

    @ManyToOne
    @JoinColumn(name = "tanque_id")
    private Tanque tanque;

    public ParametroAgua() {}

}

