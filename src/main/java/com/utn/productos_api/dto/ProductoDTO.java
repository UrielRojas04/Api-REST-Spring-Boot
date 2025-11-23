package com.utn.productos_api.dto;

import com.utn.productos_api.model.Categoria;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.*;
import lombok.Data;

@Schema(description = "DTO para crear o actualizar un producto")
@Data
public class ProductoDTO {

    @Schema(description = "Nombre del producto", example = "Café Colombiano")
    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 3, max = 100)
    private String nombre;

    @Schema(description = "Descripción del producto", example = "Café premium de origen")
    @Size(max = 500)
    private String descripcion;

    @Schema(description = "Precio del producto", example = "1999.99")
    @NotNull
    @DecimalMin("0.01")
    private Double precio;

    @Schema(description = "Stock disponible", example = "50")
    @NotNull
    @Min(0)
    private Integer stock;

    @Schema(description = "Categoría del producto", example = "BEBIDAS")
    @NotNull
    private Categoria categoria;
}

