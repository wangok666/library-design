package library.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import library.PO.Usertype;

public class UsertypeDAO extends DAOBase {
	
	// ��
	public void createUsertype(Usertype usertype) throws Exception{
		// SQL���
		String CREATE_USERTYPE_SQL = "insert into usertype(usertypeID,usertype,maxbooknum,maxorder,maxentrust) values(?,?,?,?,?)";

		Connection connection = null;
		PreparedStatement pStatement = null;
		try {
			connection = getConnection();
			pStatement = connection.prepareStatement(CREATE_USERTYPE_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setString(0, usertype.getUsertypeID());
			pStatement.setString(1, usertype.getUsertype());
			pStatement.setInt(2, usertype.getMaxbooknum());
			pStatement.setInt(3, usertype.getMaxorder());
			pStatement.setInt(4, usertype.getMaxentrust());
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
	public Usertype queryUsertype(String usertypeID) throws Exception{
		// SQL���
		String QUERY_USERTYPE_SQL = "select * from usertype where usertypeID=?";

		Connection connection = null;
		PreparedStatement pStatement = null;
		try {
			connection = getConnection();
			pStatement = connection.prepareStatement(QUERY_USERTYPE_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setString(0, usertypeID);

			/*
			 * ��Ҫʵ�ֵĲ��ֽ���
			 */
			
			/*
			 * �̶�����
			 * ���ø��·���    executeUpdate()
			 * �ر�����    pStatement.close()
			 */
			Usertype usertype = (Usertype) pStatement.executeQuery();
			pStatement.close();
			
			return usertype;
					
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
