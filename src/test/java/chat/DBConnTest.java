package chat;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Test;



public class DBConnTest {
	DBConn db = new DBConn();
	
	@Test
	public void DBConnTest() throws ClassNotFoundException, SQLException
	{
		Connection con = db.getConnection();
		Assert.assertNotNull(con);
	}

	
	/*@Test
	 public void DBInsertData() throws ClassNotFoundException, SQLException
	 {
		 Connection con = db.getConnection();
		 boolean st = db.InsertData();
		 Assert.assertEquals(false, st);
	 }*/
}
