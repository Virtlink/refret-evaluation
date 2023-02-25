test;
[p] {
[B]
    package p;
  class B{
  
  	public static int[] f;
  }
[A]
    package p;
  public class A{
  	public void n(){
  		B.f[0]= 0;
  		B.f[0]= 0;
  		p.B.f[0]= 0;
  	}
  }
}
