test;
[Test]
    class A {
  
      public void g() {
      }
    }
  
    class B extends A {
      public void g() {
  
      }
      public void h() {
        new Runnable() {
  
          @Override
          public void run() {
              g();
          }
        }.run();
      }
    }
  
