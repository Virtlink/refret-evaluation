test;
[GenericsInTypeParameter]
    import java.util.*;
  
  class A {
      private Object b = new Object() {
          private Collection myV;
  
          public <X extends Collection> void parMethA(X p) {
               myV = p;
          }
  
          private class Inner<Y extends Collection> {
      	    private Y myY;
          }
      };
  
  }
