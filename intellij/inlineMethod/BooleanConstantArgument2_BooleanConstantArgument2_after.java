test;
[BooleanConstantArgument2]
    import java.util.*;
  
  class Test1 {
    private void foo() {
        for(int i=0; i<10; i++) {
          if (i % 2) {
            System.out.println("foo");
          }
            System.out.println("bar");
        }
        System.out.println(true);
        Set<String> set = new HashSet<>();
        if (set.add(foo)) {
          System.out.println("hello");
        } else {
          System.out.println("goodbye");
        }
    }
  
    private void bar() {
        for(int i=0; i<10; i++) {
          if (!(i % 2)) {
            System.out.println("foo");
          }
            System.out.println("baz");
        }
        System.out.println(false);
        Set<String> set = new HashSet<>();
        if (set.add(foo) && false) {
          System.out.println("hello");
        } else {
          System.out.println("goodbye");
        }
    }
  
  }
