test;
[SingleReturnComplexQualifier]
    class Bar {
  
      int methodTrue() {
      return 3;
    }
  
    int methodFalse() {
      return 5;
    }
  }
  
  class Foo {
    // IDEA-229317
    void method() {
        Bar bar2 = new Bar();
  
        System.out.println(bar2.methodTrue());
        Bar bar1 = new Bar();
  
        System.out.println(bar1.methodFalse());
        int result;
        Bar bar = new Bar();
        if (Math.random() > 0.5) {
            result = bar.methodTrue();
        } else {
            result = bar.methodFalse();
        }
  
        System.out.println(result);
    }
  }
