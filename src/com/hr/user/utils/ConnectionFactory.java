package com.hr.user.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 使用这个工厂的时候所以需要使用静态块，保证连接的唯一性
 * @author 杨谦
 * @date 2015-11-2 上午11:24:22
 *
 */
public class ConnectionFactory {
	 
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		Connection conn = null;// 创建一个数据库连接
	    Class.forName("oracle.jdbc.driver.OracleDriver");// 加载Oracle驱动程序
        String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";// 127.0.0.1是本机地址
        String user = "scott";// 用户名,系统默认的账户名
        String password = "tiger";// 安装时选设置的密码
        conn = DriverManager.getConnection(url, user, password);// 获取连接
        return conn;
	} 
}
