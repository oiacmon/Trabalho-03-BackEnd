package backend.trabalho03.model;

import jakarta.persistence.*;
import java.util.List;

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

    public Tanque() {}


}

