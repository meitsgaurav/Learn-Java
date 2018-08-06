class Z3
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x=10;
		int y=test(x++);
		System.out.println("Main end"+x+','+y);
	}
	public static int test(int i)
	{
		//int i=20;
		System.out.println("From Test"+i);
		return i++;
		//return i;
	}
}

/*main begin
From Test10
Main end11,10
*/
