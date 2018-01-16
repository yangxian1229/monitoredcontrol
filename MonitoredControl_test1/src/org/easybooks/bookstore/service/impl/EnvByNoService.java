package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IEnvByNoDAO;
import org.easybooks.bookstore.service.IEnvByNoService;

public class EnvByNoService implements IEnvByNoService{
	private IEnvByNoDAO envByNoDAO; 

	public List getEnviromentByEnt_no(Integer Ent_no) {
		return envByNoDAO.getEnvironmentByEnt_no(Ent_no);
	}

	public IEnvByNoDAO getEnvByNoDAO() {
		return envByNoDAO;
	}

	public void setEnvByNoDAO(IEnvByNoDAO envByNoDAO) {
		this.envByNoDAO = envByNoDAO;
	}
	
	

}
