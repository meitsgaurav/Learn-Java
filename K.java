class K
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		String s1= test();
		System.out.println("Main end"+s1);
	}
	public static String test()
	{
		System.out.println("From Test");
		return "abc";
	}
}
