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
public class InterfaceDisplay
{
	public static void main(String arg[])
	{
		// 객체 변수를 이용한 출력 
		StarDisplay2 si = new StarDisplay2();
		si.display("글자 인쇄 시험 1");

		BarDisplay2 bi = new BarDisplay2();
		bi.display("글자 인쇄 시험 2");

		// 인터페이스 변수를 이용한 출력
		DisplayInterface di1 = new StarDisplay2();
		di1.display("글자 인쇄 시험 3");

		DisplayInterface di2 = new BarDisplay2();
		di2.display("글자 인쇄 시험 4");
	}
};
