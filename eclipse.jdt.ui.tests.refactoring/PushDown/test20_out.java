test;
[p] {
[B]
    package p;
  
  import java.util.Collection;
  import java.util.List;
  import java.util.Set;
  
  class B extends A{
  
  	public Collection i;
  
  	public List f() { 
  		return null;
  	}
  
  	@Override
  	public Set m() {
  		return null;
  	}
  }
[A]
    package p;
  
  import java.util.Set;
  
  abstract class A{
  
  	public abstract Set m();
  }
}
