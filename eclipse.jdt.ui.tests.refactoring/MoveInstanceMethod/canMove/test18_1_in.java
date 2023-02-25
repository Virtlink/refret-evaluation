test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  public interface A{
  	default String getDefaultName(B b) {
  		return "Something";
  	}
  }
}
