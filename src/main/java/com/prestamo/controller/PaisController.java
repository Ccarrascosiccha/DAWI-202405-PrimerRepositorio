package com.prestamo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prestamo.entity.Pais;
import com.prestamo.service.PaisService;

//2
@RestController
//3
@RequestMapping("/url/pais")
public class PaisController {
//4
	private final PaisService paisService;

//5
	@Autowired
	public PaisController(PaisService paisService) {
		this.paisService = paisService;
	}

//6
	@GetMapping("/lista")
	public List<Pais> getAllPaises() {
		return paisService.findAll();
	}

}
