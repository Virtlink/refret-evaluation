test;
[p] {
[B]
    package p;
  
  import p.A.F;
  
  class B{
  
  	public static void m(){
  		A.F[] y;
  		A.F[] ff;
  		A.F[ ] ff1;
  		A.F[][] fff;
  		A.F[][] fff1;
  		p.A.F[ ][ ] fff2;
  	}
  }
[A]
    package p;
  public class A{
  	public static class F{}
  }
}
