test;
[p] {
[B]
    package p;
  
  import java.util.ArrayList;
  import java.util.List;
  
  class B{
  
  	public static List m() {
  		return new ArrayList(A.set);
  	}
  }
[A]
    package p;
  import java.util.Set;
  public class A {
  	public static Set set;
  }
  
}
