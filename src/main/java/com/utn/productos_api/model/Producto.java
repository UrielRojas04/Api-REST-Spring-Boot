package com.utn.productos_api.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private Double precio;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private String descripcion;

    private Integer stock;
}
