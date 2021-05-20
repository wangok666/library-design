package library.DAO.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import library.PO.Userdetail;
import library.PO.Usertype;

class UserdetailDAOTest {

	@Test
	void testCreateUserdetail() {
		Userdetail u=new Userdetail();
		u.setCollege("����");
		u.setDocID("00");;
		u.setLoginID("1");
		u.setMail("1842281812@qq.com");
		u.setProfession("������");
		u.setSex("��");
		u.setUserID("1");
		u.setUserName("����");
		createUserdetail(u);
		
		Userdetail u2=new Userdetail();
		u2.setCollege("����");
		u2.setDocID("01");;
		u2.setLoginID("2");
		u2.setMail("1842281812@qq.com");
		u2.setProfession("������");
		u2.setSex("��");
		u2.setUserID("2");
		u2.setUserName("����");
		createUserdetail(u2);

		}

	@Test
	void testUpdateUserdetail() {
		Userdetail u=new Userdetail();
		u.setCollege("������ҵ��ѧ");
		u.setDocID("00");;
		u.setLoginID("1");
		u.setMail("1842281812@qq.com");
		u.setProfession("������");
		u.setSex("��");
		u.setUserID("1");
		u.setUserName("����");
		updateUserdetail(u);
	}

	@Test
	void testQueryUserdetail() {
		String s="2"
		queryUserdetail(s);
	}
	

	@Test
	void testDeleteUserdetailUserdetail() {
		Userdetail u=new Userdetail();
		u.setCollege("����");
		u.setDocID("00");
		u.setLoginID("1");
		u.setMail("1842281812@qq.com");
		u.setProfession("������");
		u.setSex("��");
		u.setUserID("1");
		u.setUserName("����");
		deleteUserdetail(u);
	}

	@Test
	void testDeleteUserdetailString() {
		String s="1";
		deleteUserdetail(s);
	}


}
