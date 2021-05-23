package virtusa.com;

public class UsingRunnableInterface {

	public static void main(String[] args) {
		ThreadDemo r=new ThreadDemo();
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}

	}

}
class ThreadDemo implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}
}