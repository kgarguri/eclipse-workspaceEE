package com.itwill.shop.jumun;

import java.util.ArrayList;

public class JumunService {
	private JumunDao jumunDao;
	
	public ArrayList<Jumun> getJumunList() throws Exception {
		ArrayList<Jumun> jumunList = jumunDao.getjumunlist();
		return jumunList;
	
	}
	
	public Jumun findjumun(int j_no) throws Exception {
		
		Jumun jumun = new Jumun();
		jumunDao.findJumun(j_no);
		return jumun;
	}
	

}