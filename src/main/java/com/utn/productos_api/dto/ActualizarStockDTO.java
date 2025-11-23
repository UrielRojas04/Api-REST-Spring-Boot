package com.utn.productos_api.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
@Schema(description = "DTO para actualizar únicamente el stock del producto")
public class ActualizarStockDTO {

    @Schema(description = "Nuevo stock", example = "40")
    @NotNull
    @Min(0)
    private Integer stock;
}

