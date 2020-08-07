package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddressDao2 {
	
	String driverClass="oracle.jdbc.OracleDriver";
	String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
	String user="javapython7";
	String password="javapython7";
	
	public void create(String id, String name, String phone, String address) throws Exception{
		String insertSql=
				"insert into address values(address_no_seq.nextval,'"+id+"','"+name+"','"+phone+"','"+address+"')";

		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();

		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(rowCount+" 행 insert");

		stmt.close();
		con.close();
	}
	
	public void delete(int no) throws Exception{
		String deleteSql=
				"delete address where no = "+no;
	
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();

		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(rowCount+" 행 delete");

		stmt.close();
		con.close();		
	}
	public void update(String id, String name, String phone, String address, int no) throws Exception{
		String updateSql=
				"update address set id = '"+id+"', name = '"+name+"', phone = '"+phone+"' , address = '"+address+"' where no = "+no;

		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();

		int rowCount = stmt.executeUpdate(updateSql);
		System.out.println(rowCount+" 행 update");

		stmt.close();
		con.close();		
	}
	public void selectByNo(int no) throws Exception{
		
		String selectSql = "select no, id, name, phone, address from address where no="+no;
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		
		boolean isExist = rs.next();
		if (isExist) {
			int No = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(No+"\t"+id+"\t"+name+"\t"+phone+"\t"+address);
		}
		rs.close();
		stmt.close();
		con.close();		
	}
	public void selectAll() throws Exception{
		String selectSql = "select no, id, name, phone, address from address order by 1";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		
		while (rs.next()) {
			int no = rs.getInt("no");
			String id = rs.getString("id");
			String name = rs.getString("name");
			String phone = rs.getString("phone");
			String address = rs.getString("address");
			System.out.println(no+"\t"+id+"\t"+name+"\t"+phone+"\t"+address);
		}
		rs.close();
		stmt.close();
		con.close();
	}


}
