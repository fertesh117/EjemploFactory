package com.example.dao;

import com.example.dto.DTOCliente;
import com.example.interfaces.DAOCliente;

public class MongoDBDAOCliente implements DAOCliente{

	@Override
	public void insertarCliente(DTOCliente cliente) {
		System.out.println("Inserto cliente en MongoDB");
		
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
