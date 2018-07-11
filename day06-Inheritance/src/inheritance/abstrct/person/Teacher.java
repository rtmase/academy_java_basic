package inheritance.abstrct.person;

public class Teacher extends Person {
	String subject;
	
	Teacher() {}
	
	Teacher(String id, String name, int age, String subject) {
		/*
		this.id = id;
		this.name = name;
		this.age = age;
		*/
		super(id, name, age);
		this.subject = subject;
	}

	
	@Override
	public String toString() {
		String teacherStr = String.format(" , 과목 : %s", subject);
		return "교사 정보 [" + super.toString() + teacherStr + "]";
	}

	@Override
	public void print() {
		System.out.println("== 교사 ==");
		System.out.println(this);
	}
	
	
}
