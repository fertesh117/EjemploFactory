package com.example.factory;

import com.example.dao.MongoDBDAOCliente;
import com.example.dao.MongoDBDAOProducto;
import com.example.interfaces.DAOCliente;
import com.example.interfaces.DAOProducto;

public class MongoDBDAOFactory extends DAOFactory {

	@Override
	public DAOCliente getDAOCliente() {
		return new MongoDBDAOCliente();
	}

	@Override
	public DAOProducto getDAOProducto() {
		return new MongoDBDAOProducto();
	}

}
