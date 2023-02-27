test;
[Test]
    class Temp {
    class Set {
      native Object [[@1|size]]();
    }

    public Object foo(Set [[@2|bar]]) {
      if ([[->1|&2|size|bar.size]]() < 2) {// Inline this
          [[->1|&2|size|bar.size]](); // or inline this
          return null;
      }

      return bar;
    }

  }
