package com.example.factory;

import com.example.interfaces.DAOCliente;
import com.example.interfaces.DAOProducto;
import com.example.util.Constants;

public abstract class DAOFactory {

	
	public abstract DAOCliente getDAOCliente();
	public abstract DAOProducto getDAOProducto();
	
	
	public static DAOFactory getDAOFactory(int factory){
		switch (factory) {
		case Constants.TIPO_DB_MONGO_DB:
			return new MongoDBDAOFactory();
		case Constants.TIPO_DB_MY_SQL:
			return new MySQLDAOFactory();
		case Constants.TIPO_DB_ORACLE:
			return new OracleDAOFactory();
		default:
			return null;
		}
		
	}

	
}
