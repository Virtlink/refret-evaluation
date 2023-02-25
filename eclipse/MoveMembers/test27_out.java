test;
[r] {
[B]
    package r;
  public class B{
  
  	public static void n(){
  	}
  }
}
[p] {
[A]
    package p;
  
  import r.B;
  
  public class A{
  	public static void m() {
  		B.n();
  	}
  }
}
