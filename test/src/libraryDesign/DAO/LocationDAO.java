package library.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import library.PO.Location;

public class LocationDAO extends DAOBase {

	// �������һ��λ��
	public void createLocation(Location location) throws Exception{
		// SQL���
		String CREATE_LOCATION_SQL = "insert into location(findID,room,shelf,level) values(?,?,?,?)";

		Connection connection = null;
		PreparedStatement pStatement = null;
		try {
			connection = getConnection();
			pStatement = connection.prepareStatement(CREATE_LOCATION_SQL);
			/*
			 * ��Ҫʵ�ֵĲ���
			 * prepare a statement to insert a record
			 * ��ղ�׼����ģ��SQL����в���������γ�������SQL����
			 */	
			pStatement.setString(0, location.getFindID());
			pStatement.setString(1, location.getRoom());
			pStatement.setInt(2, location.getShelf());
			pStatement.setInt(3, location.getLevel());
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
	
	// ɾ��ɾ��һ��λ��
	
	// �飬��������Ų�ѯһ��λ��
	
}
