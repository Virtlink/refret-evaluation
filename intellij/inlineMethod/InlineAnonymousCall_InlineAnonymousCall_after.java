test;
[InlineAnonymousCall]
    public class Test {
    static class X {
    }
  
    void test() {
      new X () {
        void bar() {
            System.out.println(this);
        }
      };
    }
  }
