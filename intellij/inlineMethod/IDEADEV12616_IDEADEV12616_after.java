test;
[IDEADEV12616]
    class Test {
    public void foo() {
        String result = null;
        assert result != null;
        String s = result;
    }
  
  }
