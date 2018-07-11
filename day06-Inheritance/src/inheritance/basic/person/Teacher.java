package inheritance.basic.person;

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
		return "강사 정보 [" + super.toString() + teacherStr + "]";
	}
	
	
}
