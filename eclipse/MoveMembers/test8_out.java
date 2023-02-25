test;
[r] {
[B]
    package r;
  public class B{
  
  	public static int f;
  }
}
[p] {
[A]
    package p;
  
  import r.B;
  
  public class A{
  	public void n(){
  		B.f= 0;
  	}
  }
}
