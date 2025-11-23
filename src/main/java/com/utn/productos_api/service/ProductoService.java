package com.utn.productos_api.service;

import com.utn.productos_api.model.Producto;
import com.utn.productos_api.model.Categoria;

import java.util.List;
import java.util.Optional;

public interface ProductoService {

    Producto crearProducto(Producto producto);

    List<Producto> obtenerTodos();

    Optional<Producto> obtenerPorId(Long id);

    List<Producto> obtenerPorCategoria(Categoria categoria);

    Producto actualizarProducto(Long id, Producto productoActualizado);

    Producto actualizarStock(Long id, Integer nuevoStock);

    void eliminarProducto(Long id);
}
