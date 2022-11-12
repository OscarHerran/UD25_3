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

import com.example.demo.dto.Caja;
import com.example.demo.services.CajaServices;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaServices cajaSERVICES;
	
	@GetMapping("/cajas")
	public List<Caja> totalCajas(){
		return cajaSERVICES.totalCajas();
	}
	
	@GetMapping("/cajas/{num_referencia}")
	public Caja ubicaPorID(@PathVariable (name = "num_referencia") String num_referencia) {
		return cajaSERVICES.ubicaPorID(num_referencia);
	}
	
	@PostMapping("/cajas/add")
	public Caja guardaCaja(@RequestBody Caja caja) {
		return cajaSERVICES.guardaCaja(caja);
	}
	
	@PutMapping("/cajas/{num_referencia}/actualiza")
	public Caja actualizaCaja(@PathVariable (name = "num_referencia") String num_referencia, @RequestBody Caja caja) {
		Caja cajaSEL = new Caja();
		Caja cajaACTUALIZA = new Caja();
		
		cajaSEL = cajaSERVICES.ubicaPorID(num_referencia);
		cajaSEL.setContenido(caja.getContenido());
		cajaSEL.setValor(caja.getValor());
		cajaSEL.setAlmacen(caja.getAlmacen());
		
		cajaACTUALIZA = cajaSEL;
		
		return cajaACTUALIZA;
	}
	
	@DeleteMapping("/cajas/{num_referencia}/elimina")
	public void eliminaCaja(@PathVariable (name = "num_referencia") String num_referencia) {
		cajaSERVICES.eliminaCaja(num_referencia);
	}
}
