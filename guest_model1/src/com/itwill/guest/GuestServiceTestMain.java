package com.itwill.guest;
public class GuestServiceTestMain {
	public static void main(String[] args) throws Exception{
		GuestService guestService=new GuestService();
		
		//System.out.println(guestService.selectAll());
		//System.out.println(guestService.selectByNo(5));
		int in_cnt = guestService.insertGuest(new Guest("김남이", "kim22@korea.com", "aaa22@korea.com", "대한민국 오필승 코리아", "나도 국가대표 축구선수입니다. 앞으로 은퇴할때 까지 계속..."));
		System.out.println(in_cnt);
		
		
	}
}