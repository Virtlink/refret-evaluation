test;
[p2] {
[B]
    package p2;
  
  import p1.A;
  
  public class B {
  
  	public void mA1(A a) {
  		System.out.println(A.fgHello);
  		A.talk(this);
  		System.out.println(a);
  	}
  }
}
[p1] {
[A]
    // Move mA1 to field fB, unqualified static member references are qualified
  package p1;
  
  import p2.B;
  
  public class A {
  	public static String fgHello= "Hello from A!";
  
  	public B fB;
  
  	public static void talk(B b) {
  		System.out.println("How are you?");
  	}
  
  	public void mA1() {
  		fB.mA1(this);
  	}
  }
}
