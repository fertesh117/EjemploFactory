package com.example.factory;

import com.example.dao.OracleDAOCliente;
import com.example.dao.OracleDAOProducto;
import com.example.interfaces.DAOCliente;
import com.example.interfaces.DAOProducto;

public class OracleDAOFactory extends DAOFactory {

	@Override
	public DAOCliente getDAOCliente() {
		return new OracleDAOCliente();
	}

	@Override
	public DAOProducto getDAOProducto() {
		return new OracleDAOProducto();
	}

}
