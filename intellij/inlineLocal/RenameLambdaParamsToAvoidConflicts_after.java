test;
[Test]
    class MyClass {
    void m() {
        Object o = null;
      Consumer cc = o1 -> {
        System.out.println(o1);
      };
    }
  }
  
  interface Consumer {
    void accept(Object o);
  }
  
