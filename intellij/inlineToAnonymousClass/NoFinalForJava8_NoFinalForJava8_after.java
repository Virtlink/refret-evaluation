test;
[NoFinalForJava8]
    class InlineClassFinal {
    void sdf(String vp) {
        String v1 = vp;
        Object s = new Object() {
            private final String v = v1;
        };
    }
  }
  
  class My {
    private final String v;
    public My(String v) {
      this.v = v;
    }
  }
