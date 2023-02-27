test;
[Test]
    class [[@type|Test]] {
    public [[@cons|Test]]() {
    }

      public static [[->type|Test]][] getArray() {
        return new [[->cons|Test]][0];
      }

      public static [[->type|Test]][] getArrayWithInitializer() {
        return new [[->cons|Test]][]{};
      }
  }
