class Y
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x;
		test(x);
		System.out.println("Main end");
	}
	public static void test(int i)
	{
		//int i=20;
		System.out.println("From Test"+i);
		
		//return i;
	}
}

//variable x might not have been initialized