class P
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(false);
		System.out.println("Main end");
	}
	public static void test(int i)
	{
		System.out.println("From Test"+i);
		i=20;
		//return i;
	}
}

// boolean cannot be converted to int