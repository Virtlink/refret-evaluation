test;
[SCR20655]
    class Super {
  }
  
  class Sub extends Super {
    public void message() {
        // <-- Inline this method call.
        System.out.println(this);
    }
  }
