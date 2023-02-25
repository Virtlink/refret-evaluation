test;
[p] {
[B]
    package p;
  
  import static java.util.Arrays.asList;
  
  import java.util.List;
  
  public class B {
  
  	public List<String> abc() {
  		return asList("a", toString());
  	}
  
  }
[A]
    package p;
  
  public class A {
  }
}
