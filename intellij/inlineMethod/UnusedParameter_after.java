test;
[Test]
    class Temp {
    class Set {
      native Object [[1|size]]();
    }

    public Object foo(Set bar) {
      if ([[->1|size|bar.size]]() < 2) {// Inline this    // TODO: Context
          [[->1|size|bar.size]](); // or inline this    // TODO: Context
          return null;
      }

      return bar;
    }

  }
