test;
[Test]
    class ReturnVariable {
    String bar(String s) {
      s = s + "";
      return s;
    }
  
    void foo() {
      String s1 = "";
        s1 = bar(s1);
        System.out.println(s1);
    }
  }
