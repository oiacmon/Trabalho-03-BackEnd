package backend.trabalho03.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class Tanque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private Double volumeLitros;
    private String tipoAgua;
    private Double temperaturaIdeal;
    private Double phIdeal;

    @OneToMany(mappedBy = "tanque")
    private List<Peixe> peixes;

    @OneToMany(mappedBy = "tanque")
    private List<ParametroAgua> parametros;
}


