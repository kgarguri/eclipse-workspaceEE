package com.itwill.guest;


public class GuestDaoTestMain {

	public static void main(String[] args)throws Exception {
		GuestDao guestDao=new GuestDaoImpl();
		//System.out.println(guestDao.selectAll());
		//System.out.println(guestDao.selectByNo(5));
		int in_cnt = guestDao.insertGuest(new Guest("김남일", "kim@korea.com", "aaa@korea.com", "대한민국", "나는 국가대표 축구선수입니다"));
		System.out.println(in_cnt);
		
	}

}
