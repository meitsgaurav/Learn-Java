class Q
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10);
		System.out.println("Main end");
	}
	public static void test(int i,int j)
	{
		System.out.println("From Test"+i);
		i=20;
		//return i;
	}
}

//method test in class Q cannot be applied to given types