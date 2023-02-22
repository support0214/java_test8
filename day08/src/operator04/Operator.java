package operator04;

public class Operator {
	int num1 = 1;
	int num2 = 1;
	
	int add() {
		return num1 + num2;
	}
	int add(int num1) { // 매개변수 1개
		return num1+num2;
	}
	int add(int num1, int num2) { // 매개변수 2개 오버로딩
		return num1 + num2;
	}
	double add(double num1) { 
		return num1+num2; // 자동형 변환으로 더블로 나옴
	}
	double add(double num1, double num2) {
		return num1+num2;
	}
	
	int mi () {
		return num1-num2;
	}
	int mi(int num1) {
		return num1-num2;
	}
	int mi(int num1, int num2) {
		return num1-num2;
	}
	int x () {
		return num1*num2;
	}
	int x (int num1) {
		return num1*num2;
	}
	int x (int num1, int num2) {
		return num1*num2;
	}
	double s () {
		return num1/num2;
	}
	double s (double num1) {
		return num1/num2;
	}
	double s (double num1, double num2) {
		return num1/num2;
	}
	
	int add(int[] arrInt) {
		int sum = 0;
		for(int i = 0; i <arrInt.length; i++) {
		sum += arrInt[i];
		}
		return sum;
	}
}












