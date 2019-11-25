package com.greatsoft.springboot.app.item.models;

public class Item {
	private Producto producto;
	private Integer Cantidad;

	public Item() { }

	public Item(Producto producto, Integer cantidad) {
		this.producto = producto;
		Cantidad = cantidad;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Integer getCantidad() {
		return Cantidad;
	}

	public void setCantidad(Integer cantidad) {
		Cantidad = cantidad;
	}

	public Double getTotal() {
		return this.producto.getPrecio() * this.Cantidad.doubleValue();
	}
}
