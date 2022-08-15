// 클래스 선언과 객체 생성

class Phone {
	// 3개의 필드와 1개의 메소드로 구성 
	String model;
	int value;
	String phone_number;

	void print() {
		System.out.println(value +  " 만원 " + model + " 폰 : " + phone_number );
	}
}

public class PhoneDemo {
	public static void main(String[] args) {
		
		// 객체 생성과 참조변수
		Phone myPhone = new Phone();
		
		myPhone.model = "Galaxy S8";
		myPhone.value = 100;
		myPhone.print();

		Phone yourPhone = new Phone();
		yourPhone.model = "Galaxy G6";
		yourPhone.value = 85;
		yourPhone.print();
		
		Phone friendPhone = new Phone();
		friendPhone.model = "iphone 11";
		friendPhone.value = 120;
		friendPhone.phone_number ="010-1234-5678";
		friendPhone.print();
		
	}
}