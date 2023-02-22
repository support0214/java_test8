package student07;

public class StudentTest {

	public static void main(String[] args) {
		Student1 stu1 = new Student1(202301, "강지원", "010-0000-1111");
		System.out.println("학번 : " + stu1.number);
		System.out.println("이름 : " + stu1.name);
		System.out.println("전화번호 : " + stu1.tel);
		System.out.println("-----------------------");
		
		Student1 stu2 = new Student1(202302, "홍길동", "010-0000-1234");
		System.out.println("학번 : " + stu2.number);
		System.out.println("이름 : " + stu2.name);
		System.out.println("전화번호 : " + stu2.tel);
		System.out.println("-----------------------");
		
		Student1 stu3 = new Student1(202303, "아무개", "010-0000-7777");
		System.out.println("학번 : " + stu3.number);
		System.out.println("이름 : " + stu3.name);
		System.out.println("전화번호 : " + stu3.tel);
		
		Car car1 = new Car(5);
		Car car2 = new Car("yellow");
		Car car3 = new Car("green", "K7");
		System.out.println("-----------------------");
		
		Car car4 = new Car();
		
	}

}