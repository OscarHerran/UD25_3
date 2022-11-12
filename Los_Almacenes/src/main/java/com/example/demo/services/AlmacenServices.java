package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.IAlmacenDAO;
import com.example.demo.dto.Almacen;

@Service
public class AlmacenServices implements IAlmacenServices{

	@Autowired
	IAlmacenDAO almaDAO;
	
	@Override
	public List<Almacen> totalAlmacenes() {
		return almaDAO.findAll();
	}

	@Override
	public Almacen ubicaPorID(int id) {
		return almaDAO.findById(id).get();
	}

	@Override
	public Almacen guardaAlmacen(Almacen alma) {
		return almaDAO.save(alma);
	}

	@Override
	public Almacen actualizaAlmacen(Almacen alma) {
		return almaDAO.save(alma);
	}

	@Override
	public void eliminaAlmacen(int id) {
		almaDAO.deleteById(id);
	}

}
