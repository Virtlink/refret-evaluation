test;
[Test]
    class Foo {
  
      public String bar;
      private String baz;
  
      public void setBar(String bar) {
          this.bar = bar;
          baz = bar;
          bar();
      }
  
      private void bar() {
  
      }
  }
