test;
[Test]
    class A {
    private Object b = new Runnable() {
        {
            System.out.println(new String[]{"w"}[0]);
        }
  
        public void run(){}
    };
  
  }
