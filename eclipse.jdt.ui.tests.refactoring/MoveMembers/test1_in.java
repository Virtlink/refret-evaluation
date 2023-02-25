test;
[p] {
[B]
    package p;
  class B{
  }
[A]
    package p;
  import java.util.ArrayList;
  import java.util.List;
  import java.util.Set;
  public class A {
  	public static Set set;
  	public static List m() {
  		return new ArrayList(set);
  	}
  }
  
}
