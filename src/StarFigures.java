
public class StarFigures {
	public static void five()
	{
		System.out.println("*****\n");
		System.out.println("*****\n");
	}
	public static void two()
	{
		System.out.println(" * *\n");
		one();
		System.out.println(" * *\n");
	}
	public static void one()
	{
		System.out.println("  *\n");
	}
	public static void space()
	{
		System.out.println("");
	}
	public static void main(String[] args)
	{
		five();
		two();
		space();
		five();
		two();
		five();
		space();
		one();
		one();
		one();
		five();
		two();
	}

}
