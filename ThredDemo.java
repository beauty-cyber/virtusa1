package virtusa.com;

public class ThredDemo{
		public static void main(String[] args)
	{
		MyThread t=new MyThread();
		t.start();
		Thread.currentThread().setPriority(6);
		System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setName("Beauty");
		System.out.println(Thread.currentThread().getName());
	}

}
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<=4;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				
			}
		}
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());

	}

}
