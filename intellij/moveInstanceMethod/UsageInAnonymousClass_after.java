test;
[Test]

  class A<T>  {
      void [[@1|moo]](B b) {
        System.out.println(b.foo);
      }

      class B {
      private String foo;

      public void run() {
        new B() {
          @Override
          public void run() {
            [[->1|moo(this)|moo(this)]]; // was A.this.moo(this), but our alternative is better
          }
        };
      }

      }

  }
