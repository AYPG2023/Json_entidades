package com.ap.controller;

import java.util.Date;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Compra {

	  private int idCompra;
	    private Date fecha;
	    private double total;
	    private List<Producto> productos;
	    private Descuento descuento;
}
