package com.itwill.shop.jumun;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JumunDao {
	private DataSource dataSource;
	public JumunDao() throws Exception{
		InitialContext ic=new InitialContext();
		dataSource=(DataSource)ic.lookup("java:/comp/env/jdbc/OracleDB");
	}
	/*
	 * 주문생성
	 */
	public void create() {
		/*
		 	INSERT INTO jumun1 (jumun_no, jumun_desc, jumun_date, jumun_price, user_id) 
			VALUES (3001, '아이폰외 4종', sysdate , 345100, 'guard1');
			
			INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
			VALUES (5001, 3001, 1001,2);
			INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
			VALUES (5002, 3001, 1002,2);
			INSERT INTO jumun_detail1 (jumun_detail_no, jumun_no, product_no,jumun_detail_count) 
			VALUES (5003, 3001, 1003,1);
		 */
		
	}
	/*
	 * 주문리스트
	 */
	public ArrayList<Jumun> getjumunlist()  throws Exception{
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ArrayList<Jumun> jumunList = null;
		
		con = dataSource.getConnection();
		String sql = "select * from jumun2";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		jumunList = new ArrayList<Jumun>();
		Jumun jumun = null;
		while (rs.next()) {
			jumun = new Jumun();
			jumun.setJ_no(rs.getInt("j_no"));
			jumun.setJ_desc(rs.getString("j_desc"));
			jumun.setJ_date(rs.getDate("j_date"));
			jumun.setJ_price(rs.getInt("j_price"));
			jumun.setUserId(rs.getString("p_useriD"));
			jumunList.add(jumun);
			
		}
		
		System.out.println(jumunList);
		
		return jumunList;
	}
	/*
	 * 주문한개보기
	 */
	public Jumun findJumun(int j_no) throws Exception {
		Jumun jumun = new Jumun();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		con = dataSource.getConnection();
		String sql = "select * from jumun2 where j_no=?";
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, j_no);
		rs = pstmt.executeQuery();
		if (rs.next()) {
			jumun = new Jumun();
			jumun.setJ_no(rs.getInt("j_no"));
			jumun.setJ_desc(rs.getString("j_desc"));
			jumun.setJ_date(rs.getDate("j_date"));
			jumun.setJ_price(rs.getInt("j_price"));
			jumun.setUserId(rs.getString("p_useriD"));
		}

		return jumun;
	}
	/*
	 * 주문삭제
	 */
	public void delete() {
		
	}
		
}
	
