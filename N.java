class N
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int a=test(10);
		System.out.println("Main end"+a);
	}
	public static int test(int i)
	{
		System.out.println("From Test"+i);
		return i;
	}
}
