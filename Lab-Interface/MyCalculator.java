interface BasicCalculatorInterface 
{
	public int add(int x, int y);
	public int sub(int x, int y);
	public int mul(int x, int y);
	public int div (int x, int y);
}
interface AdvanceCalculatorInterface 
{
	public int fac(int x);
	public int power(int x, int y);
	 
}
interface CalculatorInterface extends BasicCalculatorInterface, AdvanceCalculatorInterface 
{	 
	public String dec2bin(int x);
	public String dec2hex(int x);
}

class CalculatorService implements CalculatorInterface
{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		return x/y;
	}

	@Override
	public int fac(int x) {
		// TODO Auto-generated method stub
		if (x == 0)
			return 1;
		else
			return x * fac(x-1);
	}

	@Override
	public int power(int x, int y) {
		// TODO Auto-generated method stub
		if (y<=0) {
			return 1;
		}
		else
			return x *power(x, y-1);
	}

	@Override
	public String dec2bin(int x) {
		// TODO Auto-generated method stub
		
		String bin = Integer.toBinaryString(x);
		return bin;
	}

	@Override
	public String dec2hex(int x) {
		// TODO Auto-generated method stub
		String hex = Integer.toHexString(x);
		return hex;
		 
	}
}
public class MyCalculator  
{
	public static void main(String arg[])
	{
		 
		CalculatorService calService = new CalculatorService();
		int x = 10, y =5;
		
		System.out.println("dec2hex(" + x +") = " +calService.dec2hex(x));
		if (calService.fac(x) >0)
		   System.out.println("fac(" + x +") = " +calService.fac(x));
		else
			 System.out.println("fac(" + x +") = " +"NaN");
		
		System.out.println("power(" + x + "," + y +") = " +calService.power(x,y));
	}
	
}