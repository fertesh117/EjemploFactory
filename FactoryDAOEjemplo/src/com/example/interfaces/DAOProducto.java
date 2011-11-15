package com.example.interfaces;

import java.util.List;

import com.example.dto.DTOProducto;

public interface DAOProducto {

	public List<DTOProducto> obtenerListaProducto();
	
	public void insertarProducto (DTOProducto producto);
	
	public void borrarProducto (DTOProducto producto);
	
	public void obtenerProducto(int id);
	
}
