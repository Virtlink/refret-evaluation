test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  public interface A{
  	static int m(){ return 1;};
  	int i= m();
  }
}
