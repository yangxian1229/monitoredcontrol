package org.easybooks.bookstore.service.impl;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.easybooks.bookstore.dao.ISignDAO;
import org.easybooks.bookstore.dao.impl.SignDAO;
import org.easybooks.bookstore.service.ISignService;

@Entity
public class SignService implements ISignService {
	  @ManyToOne
		private ISignDAO signDAO;
	  
	  public List getAllSign() {			
			return signDAO.getAllSign();
		}
	  public ISignDAO getSignDAO() {
			return signDAO;
		}
		public void setSignDAO(ISignDAO signDAO) {
			this.signDAO = signDAO;
		}
}
