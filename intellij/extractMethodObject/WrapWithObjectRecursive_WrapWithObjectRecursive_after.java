test;
[WrapWithObjectRecursive]
    class Test {
    int foo(int i) {
        return new Object() {
            private int InnerClass(int i) {
                if (i == 0) return -1;
                return foo(i - 1);
            }
        }.InnerClass(i);
    }
  }
