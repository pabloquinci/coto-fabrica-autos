package com.fabricaautos.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Vehiculo {


        private String marca;
        private String modelo;

        private ETipoVehiculo tipo;

        private Double precio;
}
