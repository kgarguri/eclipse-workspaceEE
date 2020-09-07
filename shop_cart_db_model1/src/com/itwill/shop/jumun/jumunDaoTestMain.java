package com.itwill.shop.jumun;

import java.util.ArrayList;

import com.itwill.shop.jumun.JumunDao;

public class jumunDaoTestMain {

	public static void main(String[] args)throws Exception {
		JumunDao jumunDao = new JumunDao();
		//Jumun jumun = new Jumun();
		
		ArrayList<Jumun> jumunList = jumunDao.getjumunlist();
		
		//System.out.println(jumunList);
	}

}
