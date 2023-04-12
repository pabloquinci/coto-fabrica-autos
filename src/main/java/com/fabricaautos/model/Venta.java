package com.fabricaautos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Venta {
    private Double monto;
    private Vehiculo autoVendido;

    private CentroDistribucion centroVenta;

    private LocalDate fechaVenta;
}
