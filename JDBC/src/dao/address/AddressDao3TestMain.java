package dao.address;

import java.util.ArrayList;

/*
이름      널?       유형            
------- -------- ------------- 
NO      NOT NULL NUMBER(4)     
ID               VARCHAR2(20)  
NAME             VARCHAR2(50)  
PHONE            VARCHAR2(50)  
ADDRESS          VARCHAR2(100) 
 */
public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception{
		AddressDao3 addressDao3=new AddressDao3();
	
		System.out.println("-----------1.create-----------");
		int insertRowCount=
				addressDao3.create(new Address("xxx", "김수미","234-9090", "CANADA"));

		System.out.println("create:"+insertRowCount);
	
		System.out.println("-----------2.update-----------------");
		Address updateAddress=new Address(31, "uuu", "변경이름", "900-0000", "주소변경");
		int updateRowCount= addressDao3.update(updateAddress);
		System.out.println("update:"+updateRowCount);
		
		System.out.println("------------3.delete---------------------");
		System.out.println("delete:"+addressDao3.delete(31));
	
		System.out.println("------------4.selectByNo----------------");
		Address findAddress=addressDao3.selectByNo(34);
		System.out.println(findAddress.getNo()+"\t"+findAddress.getId()+"\t"+findAddress.getName()+
				             "\t"+findAddress.getPhone()+"\t"+findAddress.getAddress());
		
		System.out.println("------------5.selectAll--------------------");
		
		ArrayList<Address> findAddressList=addressDao3.selectAll();
		
		for (int i = 0; i < findAddressList.size(); i++) {
			Address tmpAddress = findAddressList.get(i);
			int no = tmpAddress.getNo();
			String id = tmpAddress.getId();
			String name = tmpAddress.getName();
			String phone = tmpAddress.getPhone();
			String address = tmpAddress.getAddress();
			
			System.out.println(no +"\t"+id+"\t"+name+"\t"+phone+"\t"+address);
		
		}
			
	}

}
