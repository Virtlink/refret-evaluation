test;
[Test]
    class [[@type|Test]] {
    public Test() {
    }

      public static [[->type|Test]][] getArray() {
        return new [[->type|Test]][0];
      }

      public static [[->type|Test]][] getArrayWithInitializer() {
        return new [[->type|Test]][]{};
      }
  }
