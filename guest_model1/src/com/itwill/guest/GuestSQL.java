package com.itwill.guest;


public class GuestSQL {
	public static final String GUEST_INSERT="insert into guest values(guest_no_seq.nextval,?,sysdate,?,?,?,?)";
	public static final String GUEST_DELETE="";
	public static final String GUEST_UPDATE="";
	public static final String GUEST_SELECT_NO="select * from guest where guest_no = ?";
	public static final String GUEST_SELECT_ALL="select * from guest";
}