test;
[Test]
    interface I {
      default void method(int i) {
          System.out.println("i = " + i + ", intf = " + this);
      }
  }
  
  interface J extends I {
  }
  
  class IImpl implements I {
  }
  
  class JImpl implements J {
  }
  
  class X {
  
      {
          J j = new JImpl();
          j.method(0);
      }
  }
