test;
[Test]
    class X {
      enum E {A}
  
      void print(E e) {
          switch (e) {
              case A -> System.out.println(e);
          }
      }
  
  }
