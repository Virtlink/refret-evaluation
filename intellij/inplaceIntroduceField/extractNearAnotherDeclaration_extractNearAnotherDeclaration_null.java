test;
[extractNearAnotherDeclaration]
    class Test {
    {
      String <caret>a = null;
      String b = a.toString();
    }
  }
