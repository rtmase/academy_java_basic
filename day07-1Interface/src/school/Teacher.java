package school;

public class Teacher extends Person implements Lesson {
	private String subject;
	
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

	// 접근자 수정자 생성
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
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

	@Override
	public String attend() {
		String teaStr = String.format("교사 [%s](이)가 출근하였습니다.", getId());
		return teaStr;
	}

	@Override
	public String lesson() {
		return String.format("교사 [%s](이)가 과목 [%s] 수업을 하고 있습니다.",this.getId(),this.getSubject());
	}
	
	
}
