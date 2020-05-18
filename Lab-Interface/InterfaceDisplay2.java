// InterfaceDisplay.java 프로그램

interface DisplayInterface
{	// 추상메소드 선언
	public void display(String s);
}

class StarDisplay2 implements DisplayInterface
{	// 추상메소드 구현
	public void display(String s)
	{	// 문자열 좌우에 별표 출력
		System.out.print("*** ");
		System.out.print(s);
		System.out.println(" ***");
	}
};
class BarDisplay2 implements DisplayInterface
{	// 추상메소드 구현
	public void display(String s)
	{	// 문자열 좌우에 bar 표시 출력
		System.out.print("||| ");
		System.out.print(s);
		System.out.println(" |||");
	}
};
class CallAgent	
{	// 인터페이스 구현 클래스에 대한 호출 중재자 
	DisplayInterface displayInterface;

	public void setDisplay(DisplayInterface displayInterface)
	{			// 인터페이스 구현클래스를 등록
		this.displayInterface = displayInterface;
	}
	// 인터페이스 구현클래스의 ring() 메소드 호출
	public void call(String s){
		displayInterface.display(s);
	}
};
public class InterfaceDisplay2
{
	public static void main(String arg[])
	{
		// 객체 변수를 이용한 출력 

		CallAgent ca = new CallAgent();

		// RingTone 객체를 중재자에 등록
		StarDisplay2 si = new StarDisplay2();
		ca.setDisplay(si);	
		ca.call("글자 인쇄 시험 1");

		BarDisplay2 bi = new BarDisplay2();
		ca.setDisplay(si);
		ca.call("글자 인쇄 시험 2");
	}
};
