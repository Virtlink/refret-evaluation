test;
[Test]
    class Usage {
    Runnable s = new Runnable() {
        void foo(Runnable s) {
          System.out.println(s.toString());
          s.run();
        }
  
        public void run(){
        }
    };
  }
