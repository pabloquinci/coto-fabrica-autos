package com.fabricaautos.model;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class CentroDistribucion {
    private String idCentro;
    private List<Vehiculo> autos= new ArrayList<>();

    private String direccion;
}
