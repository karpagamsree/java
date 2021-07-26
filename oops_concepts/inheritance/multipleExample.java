
import java.io.*;
import java.lang.*;
import java.util.*;

class one {
	public void print_geek()
	{
		System.out.println("hi");
	}
}

class two extends one 
{
	public void print_for() 
	{ 
		System.out.println("hello");
	}
}

class three extends two 
{
	public void print_geek()
	{
		System.out.println("what");
	}
}


public class multipleExample
{
	public static void main(String[] args)
	{
		three g = new three();
		g.print_geek();
		g.print_for();
	}
}

