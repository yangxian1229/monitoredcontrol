package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IEnt_viewDAO;
import org.easybooks.bookstore.service.IEnt_viewService;

public class Ent_viewService implements IEnt_viewService{
	private IEnt_viewDAO ent_viewDAO;
   
	public List getAllEnt_views() {
		return ent_viewDAO.getAllEnt_views();
	}
    //属性的getter/setter方法
	public IEnt_viewDAO getEnt_viewDAO() {
		return ent_viewDAO;
	}

	public void setEnt_viewDAO(IEnt_viewDAO ent_viewDAO) {
		this.ent_viewDAO = ent_viewDAO;
	}
	

}
