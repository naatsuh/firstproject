package com.laercio.firstproject.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String marca;
    @Column(nullable = false)
    private String modelo;
    @Column(nullable = false)
    private String ano;
    @Column(nullable = false)
    private long idusuario;
}
