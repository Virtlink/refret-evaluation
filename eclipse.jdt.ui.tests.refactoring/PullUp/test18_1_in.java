test;
[p] {
[B]
    package p;
  
  import org.eclipse.jdt.annotation.NonNull;
  
  public class B implements A {
  
  	public Integer getArea(@NonNull Integer length) {
  		return Integer.valueOf(length * length);
  	}
  }
[A]
    package p;
  
  public interface A {
  
  }
}
