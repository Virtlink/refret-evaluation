test;
[Test]
    class Bar {

      int [[@t|methodTrue]]() {
      return 3;
    }

    int [[@f|methodFalse]]() {
      return 5;
    }
  }

  class Foo {
    // IDEA-229317
    void method() {
        Bar [[@2|bar2]] = new Bar();

        System.out.println([[->t|&2|methodTrue|bar2.methodTrue]]());
        Bar [[@1|bar1]] = new Bar();

        System.out.println([[->f|&1|methodFalse|bar1.methodFalse]]());
        int result;
        Bar [[@0|bar]] = new Bar();
        if (Math.random() > 0.5) {
            result = [[->t|&0|methodTrue|bar.methodTrue]]();
        } else {
            result = [[->f|&0|methodFalse|bar.methodFalse]]();
        }

        System.out.println(result);
    }
  }
