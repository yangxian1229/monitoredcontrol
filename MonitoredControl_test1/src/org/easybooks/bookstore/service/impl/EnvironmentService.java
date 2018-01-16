package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IEnvironmentDAO;
import org.easybooks.bookstore.service.IEnvironmentService;

public class EnvironmentService implements IEnvironmentService{
	private IEnvironmentDAO environmentDAO;
	
    //得到所有环境
	public List getAllEnvironments() {
		return environmentDAO.getAllEnvironments();
	}

	public IEnvironmentDAO getEnvironmentDAO() {
		return environmentDAO;
	}

	public void setEnvironmentDAO(IEnvironmentDAO environmentDAO) {
		this.environmentDAO = environmentDAO;
	}
	
}
