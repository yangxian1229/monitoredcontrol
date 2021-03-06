package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IOutfall_viewDAO;
import org.easybooks.bookstore.service.IOutfall_viewService;

public class Outfall_viewService implements IOutfall_viewService{

	private IOutfall_viewDAO outfall_viewDAO;
	
	public List getOutfall_views() {
		return outfall_viewDAO.getAllOutfall_views();
	}

	public IOutfall_viewDAO getOutfall_viewDAO() {
		return outfall_viewDAO;
	}

	public void setOutfall_viewDAO(IOutfall_viewDAO outfall_viewDAO) {
		this.outfall_viewDAO = outfall_viewDAO;
	}
	
	

}
