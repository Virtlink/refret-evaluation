test;
[e] {
[B]
    package e;
  
  import p.A;
  
  public class B {
  
  	private static void foo() {
  		System.out.println(A.NAME);
  	}
  
  }
  
}
[p] {
[A]
    package p;
  
  public class A {
  
  	public static String NAME= "N";
  
      private static String getNAME() { 
          return NAME;
      }
    
      private static void setNAME(String name) {
      	NAME= name;
      }
  
  }
  
}
