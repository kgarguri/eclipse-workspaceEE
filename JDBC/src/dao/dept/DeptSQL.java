package dao.dept;

public class DeptSQL {
	public static final String INSERT = "insert into dept values (?, ?, ?)";
	public static final String SELECTByNo = "select * from dept where no = ?";
	public static final String SELECTAll = "select * from dept";
}
