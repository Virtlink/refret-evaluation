test;
[Test]
    class ThisReferenceTest {
    void foo(){}
  
    void bar(){this.foo();}
  
    static void main(ThisReferenceTest t){
        t.bar();
    }
  }
