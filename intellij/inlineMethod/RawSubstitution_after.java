test;
[NotRaw]
    public class NotRaw<T> {
  
  }
  
  class Raw extends NotRaw {
      void foo() {
          Object o;
          Object tt = null;
          if ( null == null) {
              o = null;
          }           else
              o = null;
      }
  }
