class Z
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=10;
		test(i);
		System.out.println("Main end"+i);
	}
	public static void test(int i)
	{
		//int i=20;
		System.out.println("From Test"+i);
		i=20;
		//return i;
	}
}

//Modification of i will not reflect to main method