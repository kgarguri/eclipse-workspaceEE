package dao.address;

public class AddressDao2TestMain {

	public static void main(String[] args) throws Exception{
		AddressDao2 addressDao2=new AddressDao2();
		
		System.out.println("1.create");
		addressDao2.create("ccccc","노량진","444-4444","서울시 동작구 상도동");
		
		
		System.out.println("2.update");
		addressDao2.update("ddddd","동작동","555-5555","서울시 동작구 동작동", 29);
		
		System.out.println("3.delete");
		addressDao2.delete(28);
	
		System.out.println("4.selectByNo");
		addressDao2.selectByNo(29);

		System.out.println("5.selectAll");
		addressDao2.selectAll();
		
	}

}
