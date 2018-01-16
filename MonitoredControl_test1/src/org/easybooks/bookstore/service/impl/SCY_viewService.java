package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.ISCY_viewDAO;
import org.easybooks.bookstore.service.ISCY_viewService;

public class SCY_viewService implements ISCY_viewService{
	
	private ISCY_viewDAO scy_viewDAO;

	public List getAllSCY_views() {
		
		return scy_viewDAO.getAllSCY_views();
	}

	public ISCY_viewDAO getScy_viewDAO() {
		return scy_viewDAO;
	}

	public void setScy_viewDAO(ISCY_viewDAO scy_viewDAO) {
		this.scy_viewDAO = scy_viewDAO;
	}
	
	
	

}
