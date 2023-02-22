package variable01;

public class Operator {
	int num1 = 1;
	int num2 = 1;
	
	int add(int num1, int num2) {
		this.num1 = num1;// 지역변수 우선순위가 더높음 this.현재 객체를 의미
		this.num2 = num2;
		return this.num1 + num2; 
	}
	int subtract(int num1, int num2) {
		this.num1 = num1; //변수 값 초기화
		this.num2 = num2;
		return num1 + num2;
	}
}
