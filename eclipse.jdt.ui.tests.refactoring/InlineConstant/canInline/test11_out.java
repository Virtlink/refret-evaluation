test;
[p2] {
[B]
    package p2;
  
  import p3.C;
  
  public class B {
  	public static final int ZEMENT= 4*C.BEGRIFF + p3.C.BEGRIFF;	
  }
}
[p3] {
[C]
    package p3;
  
  public class C {
  	public static final int BEGRIFF= "Der Begriff";	
  }
}
[p1] {
[A]
    // 8, 25 -> 8, 25  replaceAll == false 
  package p1;
  
  import p3.C;
  
  public class A {
  	void f() {
  		int j= 4 * (4*C.BEGRIFF + p3.C.BEGRIFF) + 1;	
  	}	
  }
}
