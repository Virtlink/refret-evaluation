test;
[p] {
[B]
    package p;
  interface B{
  }
[A]
    package p;
  public interface A{
  	static int m(){ return 1;};
  	int i= m();
  }
}
