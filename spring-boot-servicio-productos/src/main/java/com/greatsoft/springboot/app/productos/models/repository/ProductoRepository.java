package com.greatsoft.springboot.app.productos.models.repository;

import org.springframework.data.repository.CrudRepository;

import com.greatsoft.springboot.app.productos.models.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
