test;
[r] {
[B]
    package r;
  public class B{
  
  	public static int someVar = 0;
  }
}
[p] {
[A]
    package p;
  
  import r.B;
  
  public class A {
  
  	private static int anotherVar = B.someVar;
  
  }
  
}
