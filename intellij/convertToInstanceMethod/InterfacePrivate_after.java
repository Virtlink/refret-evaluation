test;
[Test]
    interface I {
      void method(int i);
  }
  
  interface J extends I {
  }
  
  class IImpl implements I {
      public void method(int i) {
          System.out.println("i = " + i + ", intf = " + this);
      }
  }
  
  class JImpl implements J {
      public void method(int i) {
          System.out.println("i = " + i + ", intf = " + this);
      }
  }
  
  class X {
  
      {
          J j = new JImpl();
          j.method(0);
      }
  }
