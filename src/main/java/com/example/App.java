package com.example;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        System.out.println( "Hello , mavem" );
        int a=5;
        int b=20;
        System.out.println( "Sum of" +a+ "and" +b+ "is" +sum(a,b));
    }
    public static int sum(int x,int y){
      return x+y;
     }
}
