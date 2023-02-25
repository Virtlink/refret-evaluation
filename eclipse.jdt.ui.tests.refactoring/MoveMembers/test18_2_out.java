test;
[p] {
[B]
    package p;
  interface B{
  
  	static int m(){ return 1;}
  }
[A]
    package p;
  public interface A{
  	int i= B.m();
  }
}
