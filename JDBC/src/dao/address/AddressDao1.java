package dao.address;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
Dao(Data Access Object)
 - Address들의 데이터를 저장하고있는 Address 테이블에
   CRUD(Create, Read, Update, Delete) 작업을 할수있는
   단위메쏘드를 가지고있는 클래스
 - AddressService객체의 요청(메쏘드호출)을 받아서 
   Data Access(DB)에 관련된 단위기능(CRUD)을
   수행하는 객체
 */
public class AddressDao1 {
	
	private String driverClass="oracle.jdbc.OracleDriver";
	private String url="jdbc:oracle:thin:@182.237.126.19:1521:XE";
	private String user="javapython7";
	private String password="javapython7";
	
	public void create() throws Exception {

		String insertSql=
				"insert into address values(address_no_seq.nextval,'bbbbb','광화문','222-2222','서울시 노원구')";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();

		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(rowCount+" 행 insert");

		stmt.close();
		con.close();
	}
	public void delete() throws Exception {

		String deleteSql=
				"delete from address where no=30";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();

		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(rowCount+" 행 delete");

		stmt.close();
		con.close();
		
	}
	public void update() throws Exception {
		
		String insertSql=
				"update address set id='zzzzz',name='강남구',phone='888-8888',address='서울시 강남구' where no=30";
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		Statement stmt=con.createStatement();

		int rowCount = stmt.executeUpdate(insertSql);
		System.out.println(rowCount+" 행 update");

		stmt.close();
		con.close();
		
	}
	public void selectByNo() throws Exception {

		String selectSql = "select no, id, name, phone, address from address where no=29";
		
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url,user,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(selectSql);
		
		boolean isExist = rs.next();
		if (isExist) {
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
	public void selectAll() throws Exception {

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
