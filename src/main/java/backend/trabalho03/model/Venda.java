package backend.trabalho03.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "peixe_id")
    private Peixe peixe;

    private LocalDate dataVenda;
    private Double valor;
    private String comprador;

    public Venda() {}

}

