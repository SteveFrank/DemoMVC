package test;

import java.sql.SQLException;

import org.junit.Test;

import com.hr.user.utils.ConnectionFactory;

public class DemoTest {
	@Test
	public void demoTest() throws ClassNotFoundException, SQLException {
		System.out.println(ConnectionFactory.getConnection());
	}
}
