test;
[Test]
    import java.util.*;
  
  class A {
    void foo(List<String> l) {
        Object[] a = l.toArray();
        Arrays.sort(a);
        ListIterator<String> i = l.listIterator();
        for (int j=0; j<a.length; j++) {
            i.next();
            i.set((String)a[j]);
        }
    }
  }
