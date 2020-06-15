import java.util.Scanner;

public class Myclock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int hour, min, sec;			 //시,분,초를 입력받는 변수
		int running = 1;			 //프로그램을 종료시킬 변수
		  
		Scanner s = new Scanner(System.in);
		  
		Clock clock = new Clock();
		clock.start();				//thread 동작
		while(running != 0)
		{
			try
			{
				System.out.print("Hour : ");
				hour = s.nextInt();		//시 입력
				
				System.out.print("Minute : ");
				min = s.nextInt();		//분 입력
				
				System.out.print("Second : ");
				sec = s.nextInt();		//초 입력
				clock.setTime(hour, min, sec);
				
			} catch(RuntimeException e) {
				System.out.println("잘못된 값이 입력되었습니다.");
				running = 0;
			} finally {
				System.out.println("프로그램을 종료시키려면 0을 다른 시간을 입력하시려면 0이외의 숫자를 입력하세요");
			}	
		}
	}
}
class Clock extends Thread
{
	int hour = 0, min = 0, sec = 0;
	
	void setTime(int hour, int min, int sec){
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	public void run()
	{
		while(true)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(hour == 0)
				continue;
			sec++;
			if(sec >= 60)
			{
				min++;
				sec = 0;
				if(min >= 60)
				{
					hour++;
					min = 0;
				}
			}
			System.out.println(hour+":"+min+":"+sec);
		}
	}
}