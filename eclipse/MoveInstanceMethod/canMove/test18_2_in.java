test;
[p] {
[B]
    package p;
  interface B{
  }
[A]
    package p;
  public interface A{
  	default String getDefaultName(B b) {
  		return "Something";
  	}
  }
}
