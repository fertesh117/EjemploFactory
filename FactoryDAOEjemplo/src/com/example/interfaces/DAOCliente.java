package com.example.interfaces;

import com.example.dto.DTOCliente;

public interface DAOCliente {

	public void insertarCliente(DTOCliente cliente);

	public DTOCliente obtenerCliente(int id);
	
	public void borrarCliente(DTOCliente cliente);

}
