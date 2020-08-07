package dao.address;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class AddressDao3 {
	/************** DB접속정보 **************/
	String driverClass = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@182.237.126.19:1521:XE";
	String user = "javapython7";
	String password = "javapython7";
	
	public int create(Address insertAddress) throws Exception {
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		
		String insertSql=
				"insert into address values(address_no_seq.nextval,?,?,?,?)";
		PreparedStatement pstmt=con.prepareStatement(insertSql);
		pstmt = con.prepareStatement(insertSql);
		/*
		이름      널?       유형            
		------- -------- ------------- 
		NO      NOT NULL NUMBER(4)     
		ID               VARCHAR2(20)  
		NAME             VARCHAR2(50)  
		PHONE            VARCHAR2(50)  
		ADDRESS          VARCHAR2(100) 
		 */		

		pstmt.setString(1, insertAddress.getId());
		pstmt.setString(2, insertAddress.getName());
		pstmt.setString(3, insertAddress.getPhone());
		pstmt.setString(4, insertAddress.getAddress());
		int insertRowCount = pstmt.executeUpdate();
		
		return insertRowCount;

	}
	public int delete(int no) throws Exception {
		String deleteSql = "delete address where no =" + no;
		System.out.println("deleteSql:" + deleteSql);
		Class.forName(driverClass);
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stmt = con.createStatement();
		int rowCount = stmt.executeUpdate(deleteSql);
		System.out.println(rowCount + " 행 delete..");

		stmt.close();
		con.close();
		return rowCount;
	}
	public int update(Address updateAddress)  throws Exception{
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		String updateSql=
				"update address set id = ?, name = ?, phone = ?, address = ? where no = ?";
		PreparedStatement pstmt=con.prepareStatement(updateSql);
		pstmt = con.prepareStatement(updateSql);

		pstmt.setString(1, updateAddress.getId());
		pstmt.setString(2, updateAddress.getName());
		pstmt.setString(3, updateAddress.getPhone());
		pstmt.setString(4, updateAddress.getAddress());
		pstmt.setInt(5, updateAddress.getNo());
		
		int updateRowCount = pstmt.executeUpdate();

		return updateRowCount;
	}
	
	public Address selectByNo(int fno) throws Exception {
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		String selectSql=
				"select * from address where no = ?";
		PreparedStatement pstmt=con.prepareStatement(selectSql);
		pstmt = con.prepareStatement(selectSql);
		pstmt.setInt(1, fno);
		ResultSet rs=pstmt.executeQuery();
		
		Address findAddress = null;
		while(rs.next()) {
			int no = rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");
			
			findAddress = new Address(no, id, name, phone, address);
		}
		return findAddress;
	}
	public ArrayList<Address> selectAll() throws Exception {
		
		Class.forName(driverClass);
		Connection con=DriverManager.getConnection(url,user,password);
		String selectSql=
				"select * from address order by 1";
		PreparedStatement pstmt=con.prepareStatement(selectSql);
		pstmt = con.prepareStatement(selectSql);
		ResultSet rs=pstmt.executeQuery();
		
		ArrayList<Address> findAddressList = new ArrayList<Address>();
		while(rs.next()) {
			int no = rs.getInt("no");
			String id=rs.getString("id");
			String name=rs.getString("name");
			String phone=rs.getString("phone");
			String address=rs.getString("address");			
			
			findAddressList.add(new Address(no, id, name, phone, address));
		}
		return findAddressList;		
	}
}
