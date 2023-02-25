test;
[Client]
    public class Client {
      {
          AClass b = new AClass();
          b.sayFoo();
      }
  }
[AClass]
    public class AClass extends ASuper {
  
    public void sayBar()
        {
            System.out.println("Bar");
        }
  }
  
[ASuper]
    public class ASuper {
    public void sayFoo()
    {
        System.out.println("Foo");
    }
  }
