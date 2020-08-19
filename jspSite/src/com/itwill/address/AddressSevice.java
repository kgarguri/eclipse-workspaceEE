package com.itwill.address;

import java.util.ArrayList;

public class AddressSevice {
	private AddressDao addressDao;
	public AddressSevice() {
		addressDao=new AddressDaoImpl();
	}
	public int create(Address insertAddress) throws Exception{
		return addressDao.create(insertAddress);
	}

	public int delete(int no) throws Exception{
		return addressDao.delete(no);
	}

	public int update(Address updateAddress) throws Exception{
		return addressDao.update(updateAddress);
	}

	public Address selectByNo(int fno) throws Exception{
		return addressDao.selectByNo(fno);
	}

	public ArrayList<Address> selectAll() throws Exception{
		return addressDao.selectAll();
	}
}
