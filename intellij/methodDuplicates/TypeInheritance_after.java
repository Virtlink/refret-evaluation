test;
[Test]
    class Test {
    class I {}
    class I1 extends I {}
  
    void foo(I i){
      System.out.println(i);
    }
  
    void bar(I1 i){
        foo(i);
    }
  
  }
