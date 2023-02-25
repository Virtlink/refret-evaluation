test;
[p] {
[Foo]
    package p;
  
  import java.lang.management.ManagementFactory;
  import java.lang.reflect.Field;
  
  public class Foo implements IFoo {
  	@Override
  	public int log(Field field, String message) {
  		ManagementFactory factory = null;
  		return -1;
  	}
  }
  
[IFoo]
    package p;
  
  import java.lang.reflect.Field;
  
  public interface IFoo {
  
  	int log(Field field, String message);
  
  }
  
[FooImpl]
    package p;
  
  import java.lang.reflect.Field;
  
  public class FooImpl implements IFoo {
  
  	@Override
  	public int log(Field field, String message) {
  		// TODO Auto-generated method stub
  		return 0;
  	}
  
  }
  
}
