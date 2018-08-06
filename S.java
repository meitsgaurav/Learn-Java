class S
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(10,20);
		System.out.println("Main end");
	}
	public static void test(int i,int j)
	{
		System.out.println("From Test"+i +','+j);
		i=20;
		//return i;
	}
}
