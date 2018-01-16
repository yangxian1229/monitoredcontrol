package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IInletDAO;
import org.easybooks.bookstore.service.IInletService;

public class InletService implements IInletService{
	private IInletDAO inletDAO;

	public List getAllInlets() {
		
		return inletDAO.getAllInlets();
	}

	public IInletDAO getInletDAO() {
		return inletDAO;
	}

	public void setInletDAO(IInletDAO inletDAO) {
		this.inletDAO = inletDAO;
	}
	

}
