test;
[WrapWithObject]
    class Test {
    void foo(int i, int... j) {
        new Object() {
            private void InnerClass(int i, int[] j) {
                if (i == 0) {
                    for (int idx : j) {
  
                    }
                }
            }
        }.InnerClass(i, j);
    }
  }
