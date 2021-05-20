package library.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

import library.PO.Document;
import library.PO.Userdetail;

public class DocumentDAO extends DAOBase {
	
	// ֤��Document
	// ��
	public void createDocument(Document document) throws Exception{
		// SQL���
		String CREATE_DOCUMENT_SQL = "insert into document(effdate,expdate,appdate,owed,violations,usertypeID,deposit,credits,counts) values(?,?,?,?,?,?,?,?,?) where docID=?";

		Connection connection = null;
		PreparedStatement pStatement = null;
		try {
			connection = getConnection();
			pStatement = connection.prepareStatement(CREATE_DOCUMENT_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setDate(0, (java.sql.Date) document.getEffdate());
			pStatement.setDate(1, (java.sql.Date) document.getExpdate());
			pStatement.setDate(2, (java.sql.Date) document.getAppdate());
			pStatement.setFloat(3, document.getOwed());
			pStatement.setInt(4, document.getViolations());
			pStatement.setString(5, document.getUsertypeID());
			pStatement.setFloat(6, document.getDeposit());
			pStatement.setInt(7, document.getCredits());
			pStatement.setInt(8, document.getCounts());
			pStatement.setString(9, document.getDocID());
			/*
			 * ��Ҫʵ�ֵĲ��ֽ���
			 */
			
			/*
			 * �̶�����
			 * ���ø��·���    executeUpdate()
			 * �ر�����    pStatement.close()
			 */
			pStatement.executeUpdate();
			pStatement.close();
					
		}catch(Exception e) {
			throw new DAOException();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				throw new DAOException();
			}
		}
	}	
	
	// ɾ
	// ɾ��֤������Ҫ��ɾ���û���ϸ��Ϣ������Ҫ��ɾ���û���½��Ϣ
	public void deleteDocument(Document document) throws Exception{
		// SQL���
		String DELETE_DOCUMENT_SQL = "delete from document where docID=?";
		String QUERY_USERID_SQL = "select * from userdetail where docID=?";

		Connection connection = null;
		PreparedStatement pStatement = null;
		PreparedStatement pStatement0 = null;
		try {
			connection = getConnection();
			
			// ɾ���û���ϸ��Ϣ�Լ���½��Ϣ
			pStatement0 = connection.prepareStatement(QUERY_USERID_SQL);
			pStatement0.setString(0, document.getDocID());
			Userdetail userdetail = (Userdetail) pStatement0.executeQuery();
			
			UserdetailDAO ud = new UserdetailDAO();
			ud.deleteUserdetail(userdetail);
			pStatement0.close();
		
			// ɾ��֤��
			pStatement = connection.prepareStatement(DELETE_DOCUMENT_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setString(0, document.getDocID());
			/*
			 * ��Ҫʵ�ֵĲ��ֽ���
			 */
			
			/*
			 * �̶�����
			 * ���ø��·���    executeUpdate()
			 * �ر�����    pStatement.close()
			 */
			pStatement.executeUpdate();
			pStatement.close();
					
		}catch(Exception e) {
			throw new DAOException();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				throw new DAOException();
			}
		}
	}
	
	// ���ط���������docID����ɾ��
	public void deleteDocument(String docID) throws Exception{
		// SQL���
		String DELETE_DOCUMENT_SQL = "delete from document where docID=?";
		String QUERY_USERID_SQL = "select * from userdetail where docID=?";

		Connection connection = null;
		PreparedStatement pStatement = null;
		PreparedStatement pStatement0 = null;
		try {
			connection = getConnection();
			
			// ɾ���û���ϸ��Ϣ�Լ���½��Ϣ
			pStatement0 = connection.prepareStatement(QUERY_USERID_SQL);
			pStatement0.setString(0, docID);
			Userdetail userdetail = (Userdetail) pStatement0.executeQuery();
			
			UserdetailDAO ud = new UserdetailDAO();
			ud.deleteUserdetail(userdetail);
			pStatement0.close();
		
			// ɾ��֤��
			pStatement = connection.prepareStatement(DELETE_DOCUMENT_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setString(0, docID);
			/*
			 * ��Ҫʵ�ֵĲ��ֽ���
			 */
			
			/*
			 * �̶�����
			 * ���ø��·���    executeUpdate()
			 * �ر�����    pStatement.close()
			 */
			pStatement.executeUpdate();
			pStatement.close();
					
		}catch(Exception e) {
			throw new DAOException();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				throw new DAOException();
			}
		}
	}	
	
	
		
	// ��
	public void updateDocument(Document document) throws Exception{
		// SQL���
		String UPDATE_DOCUMENT_SQL = "update document set owed=?,violations=?,credits=?,counts=? where docID=?";

		Connection connection = null;
		PreparedStatement pStatement = null;
		try {
			connection = getConnection();
			pStatement = connection.prepareStatement(UPDATE_DOCUMENT_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setFloat(0, document.getOwed());
			pStatement.setInt(1, document.getViolations());
			pStatement.setInt(2, document.getCredits());
			pStatement.setInt(3, document.getCounts());
			pStatement.setString(4, document.getDocID());
			/*
			 * ��Ҫʵ�ֵĲ��ֽ���
			 */
			
			/*
			 * �̶�����
			 * ���ø��·���    executeUpdate()
			 * �ر�����    pStatement.close()
			 */
			pStatement.executeUpdate();
			pStatement.close();
					
		}catch(Exception e) {
			throw new DAOException();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				throw new DAOException();
			}
		}
	}	

	// ���ط���
	public void updateDocument(String docID,float owed,Integer violations,Integer credits,Integer counts) throws Exception{
		// SQL���
		String UPDATE_DOCUMENT_SQL = "update document set owed=?,violations=?,credits=?,counts=? where docID=?";

		Connection connection = null;
		PreparedStatement pStatement = null;
		try {
			connection = getConnection();
			pStatement = connection.prepareStatement(UPDATE_DOCUMENT_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setFloat(0, owed);
			pStatement.setInt(1, violations);
			pStatement.setInt(2, credits);
			pStatement.setInt(3, counts);
			pStatement.setString(4, docID);
			/*
			 * ��Ҫʵ�ֵĲ��ֽ���
			 */
			
			/*
			 * �̶�����
			 * ���ø��·���    executeUpdate()
			 * �ر�����    pStatement.close()
			 */
			pStatement.executeUpdate();
			pStatement.close();
					
		}catch(Exception e) {
			throw new DAOException();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				throw new DAOException();
			}
		}
	}		
	
	// ��
	public Document queryDocument(String docID) throws Exception{
		// SQL���
		String QUERY_DOCUMENT_SQL = "select * from document where docID=?";

		Connection connection = null;
		PreparedStatement pStatement = null;
		try {
			connection = getConnection();
			pStatement = connection.prepareStatement(QUERY_DOCUMENT_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setString(0, docID);
			/*
			 * ��Ҫʵ�ֵĲ��ֽ���
			 */
			
			/*
			 * �̶�����
			 * ���ø��·���    executeUpdate()
			 * �ر�����    pStatement.close()
			 */
			Document document = (Document)pStatement.executeQuery();		
			pStatement.close();
			
			return document;
					
		}catch(Exception e) {
			throw new DAOException();
		}finally {
			try {
				connection.close();
			}catch(SQLException e) {
				throw new DAOException();
			}
		}
	}		

}
