package student07;

public class Car {
	String color = "black";
	String model = "SM7";
	int door = 5;
	
	// Car(){	} 생성자가 없으면 자동생성되어 컴파일됨
	Car(){ // 기본 값 
		this("black", "SM7", 5);
		System.out.println("매개변수가 없는 생성자");
	}
	Car(String color){ // ↓오버로딩
		this(color, "SM7", 5);
	}
	
	Car(int door){
		this("black", "SM7", door);
	}
	
	Car(String color, String model){
		this(color, model, 5);
	}
	
	Car(String color, int door){
		this(color, "SM7", door);
	}
	
	Car(String color, String model, int door){
		this.color = color;
		this.model = model;
		this.door = door;
		System.out.println("매개변수가 3개인 생성자");
	}
}
