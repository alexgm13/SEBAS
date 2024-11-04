package org.upn.pe.edu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.upn.pe.edu.Repositorie.ICategoria;
import org.upn.pe.edu.models.Categoria;

@RestController
@RequestMapping("/Categoria")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class CategoriaController {
	@Autowired
	private ICategoria repo;
	
	@GetMapping
	public List<Categoria> listarCategoria(){
		return (List<Categoria>)repo.findAll();
	}

}
