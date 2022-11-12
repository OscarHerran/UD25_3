package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ICajaDAO;
import com.example.demo.dto.Caja;

@Service
public class CajaServices implements ICajaServices{
	
	@Autowired
	ICajaDAO cajaDAO;

	@Override
	public List<Caja> totalCajas() {
		return cajaDAO.findAll();
	}

	@Override
	public Caja guardaCaja(Caja box) {
		return cajaDAO.save(box);
	}

	@Override
	public Caja actualizaCaja(Caja box) {
		return cajaDAO.save(box);
	}

	@Override
	public Caja ubicaPorID(String num_referencia) {
		return cajaDAO.findById(num_referencia).get();
	}

	@Override
	public void eliminaCaja(String num_referencia) {
		cajaDAO.deleteById(num_referencia);
	}

}
