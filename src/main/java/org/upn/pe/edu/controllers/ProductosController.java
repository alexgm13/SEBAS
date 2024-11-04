package org.upn.pe.edu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.upn.pe.edu.Repositorie.IProducto;
import org.upn.pe.edu.models.Producto;

@RestController
@RequestMapping("/Producto")
@CrossOrigin(origins = "localhost:4200", maxAge = 3600)
public class ProductosController {
	@Autowired
	private IProducto repo;
	
	public List<Producto> listarProducto(){
		return (List<Producto>)repo.findAll();
	}
	@GetMapping("/{id}")
	public Producto buscarProducto(@PathVariable long id) {
		return repo.findById(id).orElse(null);
	}
	

}
