test;
[Test]
    class Test {
      static int [[@1|bar]](){return 1;}

      void foo() {
        Test s = new Test();
        s.bar();
      }
  }
[Usage]
    class Usage {
    void ba() {
      Test[][] s = new Test[ [[->1|bar|Test.bar]]()][];
    }
  }
