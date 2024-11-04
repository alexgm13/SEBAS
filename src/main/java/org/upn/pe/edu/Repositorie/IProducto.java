package org.upn.pe.edu.Repositorie;

import org.springframework.data.jpa.repository.JpaRepository;
import org.upn.pe.edu.models.Producto;

public interface IProducto extends JpaRepository<Producto, Long> {

}
