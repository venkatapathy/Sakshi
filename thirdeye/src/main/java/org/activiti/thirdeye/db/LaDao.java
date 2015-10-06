package org.activiti.thirdeye.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.sql.DataSource;

/**
 * @author Venkatapathy Subramanian
 */

public class LaDao implements LearningActivityDAO{
 private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public ArrayList<String[]> getLearningActivities(){
		String sql = "SELECT * FROM TD_LA_MASTER";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			Statement ps = conn.createStatement();
			ResultSet rs = ps.executeQuery(sql);
			ArrayList<String[]> learningActivities = new ArrayList<String[]>();
			
			if (rs.next()) {
				String[] row={rs.getString("laName"),rs.getString("actID")};
				learningActivities.add(row);
			}
			rs.close();
			ps.close();
			return learningActivities;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}
		
	}
}
