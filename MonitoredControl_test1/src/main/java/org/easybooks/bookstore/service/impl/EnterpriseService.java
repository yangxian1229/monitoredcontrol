package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IEnterpriseDAO;
import org.easybooks.bookstore.service.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnterpriseService implements IEnterpriseService{
	@Autowired
	private IEnterpriseDAO enterpriseDAO;

	public List getAllEnterprises() {
		return enterpriseDAO.getAllEnterprises();
	}

	public IEnterpriseDAO getEnterpriseDAO() {
		return enterpriseDAO;
	}

	public void setEnterpriseDAO(IEnterpriseDAO enterpriseDAO) {
		this.enterpriseDAO = enterpriseDAO;
	}
	

}
