package com.ap.controller;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Producto {
	private int idProducto;
    private String nombre;
    private double precio;
    private int cantidad;
}
