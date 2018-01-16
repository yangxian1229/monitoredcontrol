package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IAlarmloggingDAO;
import org.easybooks.bookstore.service.IAlarmloggingService;

public class AlarmloggingService implements IAlarmloggingService{
	private IAlarmloggingDAO alarmloggingDAO;

	public List getAllAlarmloggings() {
		return alarmloggingDAO.getAllAlarmloggings();
	}

	public IAlarmloggingDAO getAlarmloggingDAO() {
		return alarmloggingDAO;
	}

	public void setAlarmloggingDAO(IAlarmloggingDAO alarmloggingDAO) {
		this.alarmloggingDAO = alarmloggingDAO;
	}
	
	

}
