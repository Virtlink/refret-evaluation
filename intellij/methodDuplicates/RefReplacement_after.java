test;
[Test]
    class Test {
    static void main(Test t){
      if (true) t.foo();
    }
  
    void foo(){}
  }
  
  class Test1 {
    void bar(Test t) {
        Test.main(t);
    }
  }
