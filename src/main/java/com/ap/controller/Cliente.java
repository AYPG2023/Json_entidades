package com.ap.controller;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter

public class Cliente {
	
	private int idCliente;
    private String nombre;
    private Direccion direccion;
    private List<Compra> compras;


}
