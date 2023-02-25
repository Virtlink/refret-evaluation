test;
[test] {
[MyList]
    package test;
  
  import java.util.ArrayList;
  
  public class MyList<T> extends ArrayList<T> {}
  
}
[Use]
    import java.util.*;
  import test.*;
  
  @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE) @interface AssertTrue {}
  
  class Use
  {
      interface MyList123{}
  
      final List<?> list = new @AssertTrue MyList<>();
  }
  
