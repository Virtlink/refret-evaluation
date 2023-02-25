test;
[test] {
[MyList123]
    package test;
  
  import java.util.ArrayList;
  
  public class MyList123<T> extends ArrayList<T> {}
  
}
[Use]
    import java.util.*;
  
  @java.lang.annotation.Target(java.lang.annotation.ElementType.TYPE_USE) @interface AssertTrue {}
  
  class Use
  {
      interface MyList123{}
  
      final List<?> list = new test.@AssertTrue MyList123<>();
  }
  
