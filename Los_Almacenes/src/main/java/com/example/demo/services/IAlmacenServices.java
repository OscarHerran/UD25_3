package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Almacen;

public interface IAlmacenServices {

	public List<Almacen> totalAlmacenes();
	public Almacen ubicaPorID(int id);
	public Almacen guardaAlmacen(Almacen alma);
	public Almacen actualizaAlmacen(Almacen alma);
	public void eliminaAlmacen(int id);
}
