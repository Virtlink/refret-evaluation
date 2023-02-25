test;
[p] {
[B]
    package p;
  
  import java.util.Set;
  
  class B extends A{
  
  	public Set m() {
  		return null;
  	}
  }
[C]
    package p;
  
  abstract class C extends A{
  }
[A]
    package p;
  
  import static java.lang.Math.PI;
  import java.util.Collection;
  import java.util.List;
  import java.util.Set;
  
  abstract class A{
  
  	public Collection i;
  
  	public List f() {
  		double d= PI;
  		return null;
  	}
  
  	public abstract Set m();
  }
}
