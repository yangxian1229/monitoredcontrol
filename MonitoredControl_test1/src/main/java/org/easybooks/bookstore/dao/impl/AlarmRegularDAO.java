package org.easybooks.bookstore.dao.impl;

import java.util.List;

import org.easybooks.bookstore.dao.BaseDAO;
import org.easybooks.bookstore.dao.IAlarmRegularDAO;
import org.hibernate.*;
import org.springframework.stereotype.Repository;

@Repository
public class AlarmRegularDAO extends BaseDAO implements IAlarmRegularDAO{

	public List getAllAlarmRegular() {
		Session session = getSession();
		Query query = session.createQuery("from Alarmregular a");
		List alarmRegulars = query.list();
		System.out.println("AlarmRegularDAO:size"+alarmRegulars.size());
		session.close();
		return alarmRegulars;
	}
	

}
