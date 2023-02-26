test;
[Test]
    class Bar {

      int [[t|methodTrue]]() {
      return 3;
    }

    int [[f|methodFalse]]() {
      return 5;
    }
  }

  class Foo {
    // IDEA-229317
    void method() {
        Bar bar2 = new Bar();

        System.out.println([[->t|methodTrue|bar2.methodTrue]]());   // TODO: context
        Bar bar1 = new Bar();

        System.out.println([[->f|methodFalse|bar1.methodFalse]]());   // TODO: context
        int result;
        Bar bar = new Bar();
        if (Math.random() > 0.5) {
            result = [[->t|methodTrue|bar.methodTrue]]();   // TODO: context
        } else {
            result = [[->f|methodFalse|bar.methodFalse]]();   // TODO: context
        }

        System.out.println(result);
    }
  }
