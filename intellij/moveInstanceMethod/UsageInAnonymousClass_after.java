test;
[Test]
    
  class A<T>  {
      void moo(B b) {
        System.out.println(b.foo);
      }
  
      class B {
      private String foo;
  
      public void run() {
        new B() {
          @Override
          public void run() {
            A.this.moo(this);
          }
        };
      }
  
      }
  
  }
