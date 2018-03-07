package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IEnvByNoDAO;
import org.easybooks.bookstore.service.IEnvByNoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvByNoService implements IEnvByNoService{
	@Autowired
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
