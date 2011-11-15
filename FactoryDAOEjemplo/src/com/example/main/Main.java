package com.example.main;

import com.example.dto.DTOCliente;
import com.example.factory.DAOFactory;
import com.example.interfaces.DAOCliente;
import com.example.util.Constants;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		DTOCliente cliente = new DTOCliente();
		DAOFactory factory = DAOFactory.getDAOFactory(Constants.TIPO_DB_MONGO_DB);
		DAOCliente daocliente = factory.getDAOCliente();
		
		daocliente.insertarCliente(cliente);
		
	}

}
