package org.easybooks.bookstore.service.impl;

import java.util.List;

import org.easybooks.bookstore.dao.IAlarmRegularDAO;
import org.easybooks.bookstore.dao.impl.AlarmRegularDAO;
import org.easybooks.bookstore.service.IAlarmRegularService;

public class AlarmRegularService implements IAlarmRegularService{
	//属性alarmRegularDAO
	private IAlarmRegularDAO alarmRegularDAO;
	//得到所有的警告
	public List getAllRegulars() {
		return alarmRegularDAO.getAllAlarmRegular();
	}
	
	//属性alarmRegularDAO的getter/setter方法
	public IAlarmRegularDAO getAlarmRegularDAO() {
		return alarmRegularDAO;
	}
	public void setAlarmRegularDAO(IAlarmRegularDAO alarmRegularDAO) {
		this.alarmRegularDAO = alarmRegularDAO;
	}
	

}
