test;
[e] {
[B]
    package e;
  
  import p.A;
  
  public class B {
  
  	private static String getNAME() { 
  	    return A.NAME;
  	}
  
  }
  
}
[p] {
[A]
    package p;
  
  public class A {
  
  	public static String NAME= "N";
  
  }
  
}
