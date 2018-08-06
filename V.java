class V
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("Main end");
	}
	public static void test(int i)
	{
		int i=20;
		System.out.println("From Test"+i);
		
		//return i;
	}
}

//variable i is already defined in method test(int)