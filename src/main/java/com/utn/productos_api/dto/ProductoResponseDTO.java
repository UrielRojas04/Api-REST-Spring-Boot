package com.utn.productos_api.dto;

import com.utn.productos_api.model.Categoria;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(description = "DTO devuelto al cliente con información del producto")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoResponseDTO {

    @Schema(description = "ID del producto", example = "1")
    private Long id;

    @Schema(description = "Nombre del producto")
    private String nombre;

    @Schema(description = "Descripción")
    private String descripcion;

    @Schema(description = "Precio")
    private Double precio;

    @Schema(description = "Stock disponible")
    private Integer stock;

    @Schema(description = "Categoría del producto")
    private Categoria categoria;
}

