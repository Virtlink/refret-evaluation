test;
[Test]
    class Test {
      enum Foo {
          BAR(new Object() {
              int evaluate() {
                  IntSupplier fn = () -> {
                      return getNum();
                  };
                  int x = fn.getAsInt();
                  int y = fn.getAsInt();
                  return x + y;
              }
          }.evaluate());
  
          Foo(int val) {
  
          }
      }
  
      static int getNum() {
          return 4;
      }
  
  }
  
