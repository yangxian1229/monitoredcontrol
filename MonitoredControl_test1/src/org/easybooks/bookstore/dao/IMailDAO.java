package org.easybooks.bookstore.dao;

import java.util.List;

import org.easybooks.bookstore.vo.Mail;

public interface IMailDAO {

	public List getAllMail();
	public void insertMail(Mail mail);
	public void deleteMail(String mailId);
}
