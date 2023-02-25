test;
[p] {
[B]
    package p;
  interface B{
  
  	default String getDefaultName() {
  		return "Something";
  	}
  }
[A]
    package p;
  public interface A{
  }
}
