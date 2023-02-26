test;
[Test]
    class Test {
     public void contextChild() {
        [[->1t|StInner]] inner1 = new StInner();
        [[->2t|InstInner|Test.InstInner]] inner2 = this.new InstInner();
     }

      void foo() {
         StInner inner1 = new StInner();
         Test.InstInner inner2 = this.new InstInner();
      }

      public static class [[1t|StInner]] {}

      public class [[2t|InstInner]] {}
  }
