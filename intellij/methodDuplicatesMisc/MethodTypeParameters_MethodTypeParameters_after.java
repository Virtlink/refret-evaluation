test;
[MethodTypeParameters]
    import java.util.*;
  
  class Test {
       <E extends A> List<E> method() {
          return new ArrayList<E>();
      }
  
      void duplicated() {
          List<B> l = method();
      }
  
      class A {}
      class B extends A {}
  }
