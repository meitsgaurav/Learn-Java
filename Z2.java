class Z2
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x=10;
		int y=test(x);
		System.out.println("Main end"+y);
	}
	public static int test(int i)
	{
		//int i=20;
		System.out.println("From Test"+i);
		return ++i;
		//return i;
	}
}

////Modification of i will not reflect to main method