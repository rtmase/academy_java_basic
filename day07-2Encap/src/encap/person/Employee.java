package encap.person;

public class Employee extends Person {
	private String dept;
	
	Employee () {}
	
	Employee (String id, String name, int age, String dept){
		super(id, name, age);
		this.dept = dept;
	}

	// 접근자 수정자 생성
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		String employeeStr = String.format(" , 부서 : %s",dept);
		return "직원 정보 [" + super.toString() + employeeStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 직원 ==");
		System.out.println(this);
	}
	
	
}
