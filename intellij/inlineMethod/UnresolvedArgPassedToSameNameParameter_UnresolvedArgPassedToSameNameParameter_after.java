test;
[UnresolvedArgPassedToSameNameParameter]
    class Test {
    void foo(Object result) {
      long h = result.hashCode();
    }
  
    void bar() {
        long h = result.hashCode();
    }
  }
