test;
[Foo]
    public class Foo {

      public static void [[@1|bar]](final Runnable runnable) {
      runnable.run();
    }
  }

  class Bar {
    public static void main(String[] args) {
        [[->1|bar|Foo.bar]](new Runnable() {
          @Override
          public void run() {
            doRun();
          }

          private void doRun() {
            // Woo-hoo
          }
        });
    }
  }
