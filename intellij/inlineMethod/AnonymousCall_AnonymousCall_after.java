test;
[AnonymousCall]
    class Foo {
    void test() {
        new Object() {
            void foo(String s) {
                System.out.println(s);
            }
        };
        System.out.println("hello");
    }
  }
