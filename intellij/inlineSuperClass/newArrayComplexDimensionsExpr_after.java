test;
[Test]
    class Test {
      static int bar(){return 1;}
  
      void foo() {
        Test s = new Test();
        s.bar();
      }
  }
[Usage]
    class Usage {
    void ba() {
      Test[][] s = new Test[Test.bar()][];
    }
  }
