test;
[Test]
    class Test {
      private final String field;
  
      Test(){
          this.field = "text";
      }
  }
[p1] {
[Usage]
    package p1;
  class Usage {
    {
      System.out.println(Super.FOO);
    }
  }
}
