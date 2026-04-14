package backend.trabalho03.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
public class Peixe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String especie;
    private LocalDate dataNascimento;
    private String sexo;
    private Double tamanho;
    private String status;

    @ManyToOne
    @JoinColumn(name = "tanque_id")
    private Tanque tanque;
}


