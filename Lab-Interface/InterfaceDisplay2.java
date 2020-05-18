// InterfaceDisplay.java ���α׷�

interface DisplayInterface
{	// �߻�޼ҵ� ����
	public void display(String s);
}

class StarDisplay2 implements DisplayInterface
{	// �߻�޼ҵ� ����
	public void display(String s)
	{	// ���ڿ� �¿쿡 ��ǥ ���
		System.out.print("*** ");
		System.out.print(s);
		System.out.println(" ***");
	}
};
class BarDisplay2 implements DisplayInterface
{	// �߻�޼ҵ� ����
	public void display(String s)
	{	// ���ڿ� �¿쿡 bar ǥ�� ���
		System.out.print("||| ");
		System.out.print(s);
		System.out.println(" |||");
	}
};
class CallAgent	
{	// �������̽� ���� Ŭ������ ���� ȣ�� ������ 
	DisplayInterface displayInterface;

	public void setDisplay(DisplayInterface displayInterface)
	{			// �������̽� ����Ŭ������ ���
		this.displayInterface = displayInterface;
	}
	// �������̽� ����Ŭ������ ring() �޼ҵ� ȣ��
	public void call(String s){
		displayInterface.display(s);
	}
};
public class InterfaceDisplay2
{
	public static void main(String arg[])
	{
		// ��ü ������ �̿��� ��� 

		CallAgent ca = new CallAgent();

		// RingTone ��ü�� �����ڿ� ���
		StarDisplay2 si = new StarDisplay2();
		ca.setDisplay(si);	
		ca.call("���� �μ� ���� 1");

		BarDisplay2 bi = new BarDisplay2();
		ca.setDisplay(si);
		ca.call("���� �μ� ���� 2");
	}
};
