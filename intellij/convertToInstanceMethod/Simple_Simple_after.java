test;
[Simple]
    public class Y {
      void method() {
          System.out.println(this);
          foo();
      }
  
      public void foo() {
      }
  }
  public class X {
  
      {
        Y y = new Y();
        y.method();
        new Y().method();
      }
  }
