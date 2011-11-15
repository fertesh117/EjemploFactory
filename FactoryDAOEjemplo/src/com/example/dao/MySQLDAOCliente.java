package com.example.dao;

import com.example.dto.DTOCliente;
import com.example.interfaces.DAOCliente;

public class MySQLDAOCliente implements DAOCliente{

	@Override
	public void insertarCliente(DTOCliente cliente) {
		System.out.println("Inserto cliente en MySQL");
		
	}

	@Override
	public DTOCliente obtenerCliente(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void borrarCliente(DTOCliente cliente) {
		// TODO Auto-generated method stub
		
	}


}
