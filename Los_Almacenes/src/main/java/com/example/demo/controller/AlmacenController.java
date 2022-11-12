package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.Almacen;
import com.example.demo.services.AlmacenServices;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenServices almaSERVICES;
	
	@GetMapping("/almacenes")
	public List<Almacen> totalAlmacenes(){
		return almaSERVICES.totalAlmacenes();
	}
	
	@GetMapping("/almacenes/{id}")
	public Almacen ubicaPorID(@PathVariable (name = "id") int id) {
		return almaSERVICES.ubicaPorID(id);
	}
	
	@PostMapping("/almacenes/add")
	public Almacen guardaAlmacen(@RequestBody Almacen alma) {
		return almaSERVICES.guardaAlmacen(alma);
	}
	
	@PutMapping("/almacenes/{id}/actualiza")
	public Almacen actualizaAlmacen(@PathVariable (name = "id") int id, @RequestBody Almacen alma) {
		Almacen almaSEL = new Almacen();
		Almacen almaACTUALIZA = new Almacen();
		almaSEL = almaSERVICES.ubicaPorID(id);
		almaSEL.setLugar(alma.getLugar());
		almaSEL.setCapacidad(alma.getCapacidad());
		
		almaACTUALIZA = almaSEL;
		
		return almaACTUALIZA;
	}
	
	@DeleteMapping("/almacenes/{id}/elimina")
	public void eliminaAlmacen(@PathVariable (name = "id") int id) {
		almaSERVICES.eliminaAlmacen(id);
	}
}
