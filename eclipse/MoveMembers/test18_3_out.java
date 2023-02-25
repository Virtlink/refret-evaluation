test;
[p] {
[B]
    package p;
  class B{
  
  	public static int m(){ return 1;}
  }
[A]
    package p;
  public interface A{
  	int i= B.m();
  }
}
