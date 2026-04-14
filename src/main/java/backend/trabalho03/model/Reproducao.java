package backend.trabalho03.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Reproducao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "peixe_pai_id")
    private Peixe peixePai;

    @ManyToOne
    @JoinColumn(name = "peixe_mae_id")
    private Peixe peixeMae;

    private LocalDate dataReproducao;
    private Integer quantidadeFilhotes;
}
