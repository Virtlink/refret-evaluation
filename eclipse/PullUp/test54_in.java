test;
[p] {
[Foo]
    package p;
  
  import java.lang.management.ManagementFactory;
  import java.lang.reflect.Field;
  
  public class Foo implements IFoo {
  	public int log(Field field, String message) {
  		ManagementFactory factory = null;
  		return -1;
  	}
  }
  
[IFoo]
    package p;
  
  public interface IFoo {
  
  }
  
[FooImpl]
    package p;
  
  public class FooImpl implements IFoo {
  
  }
  
}
