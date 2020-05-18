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
public class InterfaceDisplay
{
	public static void main(String arg[])
	{
		// ��ü ������ �̿��� ��� 
		StarDisplay2 si = new StarDisplay2();
		si.display("���� �μ� ���� 1");

		BarDisplay2 bi = new BarDisplay2();
		bi.display("���� �μ� ���� 2");

		// �������̽� ������ �̿��� ���
		DisplayInterface di1 = new StarDisplay2();
		di1.display("���� �μ� ���� 3");

		DisplayInterface di2 = new BarDisplay2();
		di2.display("���� �μ� ���� 4");
	}
};
