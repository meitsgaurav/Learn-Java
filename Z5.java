class Z5
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int x=10;
		int y=test(++x)+x+test1(x++)+x+test2(x--)+x+test3(--x)+x;
		System.out.println("Main end"+x+','+y);
	}
	public static int test(int i)
	{
		
		System.out.println("From Test"+i);
		return i++;
		
	}
	public static int test1(int i)
	{
		//int i=20;
		System.out.println("From Test1 "+i);
		return --i;
		//return i;
	}
	public static int test2(int i)
	{
		//int i=20;
		System.out.println("From Test2 "+i);
		return ++i;
		//return i;
	}
	public static int test3(int i)
	{
		//int i=20;
		System.out.println("From Test3 "+i);
		return i--;
		//return i;
	}
}

/*
main begin
From Test11
From Test1 11
From Test2 12
From Test3 10
Main end10,88
*/