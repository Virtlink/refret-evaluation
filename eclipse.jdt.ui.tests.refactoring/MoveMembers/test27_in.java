test;
[r] {
[B]
    package r;
  public class B{
  }
}
[p] {
[A]
    package p;
  
  public class A{
  	public static void n(){
  	}
  	public static void m() {
  		n();
  	}
  }
}
