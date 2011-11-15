package com.example.factory;

import com.example.dao.MySQLDAOCliente;
import com.example.dao.MySQLDAOProducto;
import com.example.interfaces.DAOCliente;
import com.example.interfaces.DAOProducto;

public class MySQLDAOFactory extends DAOFactory {

	@Override
	public DAOCliente getDAOCliente() {
		return new MySQLDAOCliente();
	}

	@Override
	public DAOProducto getDAOProducto() {
		return new MySQLDAOProducto();
	}

}
