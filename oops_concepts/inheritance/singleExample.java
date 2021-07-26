
import java.io.*;
import java.lang.*;
import java.util.*;

class H {
	public void print_geek()
	{
		System.out.println("hi");
	}
}

class S extends H
{
	public void print_for() 
	{ 
		System.out.println("hello"); 
	}
}

public class singleExample {
	public static void main(String[] args)
	{
		S g = new S();
		g.print_geek();
		g.print_for();
		
	}
}
