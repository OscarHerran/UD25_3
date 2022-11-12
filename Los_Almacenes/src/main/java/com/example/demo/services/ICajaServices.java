package com.example.demo.services;

import java.util.List;

import com.example.demo.dto.Caja;

public interface ICajaServices {

	public List<Caja> totalCajas();
	public Caja guardaCaja(Caja box);
	public Caja actualizaCaja(Caja box);
	public Caja ubicaPorID(String num_referencia);
	public void eliminaCaja(String num_referencia);
}
