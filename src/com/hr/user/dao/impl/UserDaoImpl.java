package com.hr.user.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.hr.user.domain.User;
import com.hr.user.dao.UserDao;
import com.hr.user.utils.ConnectionFactory;

public class UserDaoImpl implements UserDao<User> {
	
	public List<User> QueryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public User QueryByName(String name) {
		// TODO Auto-generated method stub
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		User user = null;
		try {
			conn = ConnectionFactory.getConnection();
			String sql = "select * from EMP where ename = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				user = new User(rs.getString("ename"),rs.getString("epasswd"));
			} else {
				user = null;
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if(rs!=null) rs.close();
				if(pstmt!=null) pstmt.close();
				if(conn!=null) conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return user;
	}
	
}
