test;
[Test]
    class Test {
     class A {
       String foo(){
         return null;
       }
     }
  
     class B extends A {
       String foo(){
           return new InnerClass().invoke();
       }
  
         private class InnerClass {
             public String invoke() {
                 return null;
             }
         }
     }
  
     String bar(B b) {
       return b.foo();
     }
  }
