test;
[Client]
    public class Client {
      I[] array;
  
      {
          array = new I[0];
          for(int i = 0; i < array.length; i++){
            array[i] = new C();
          }
      }
  }
  
[C]
    public class C implements I{
  }
  
[I]
    public interface I {
  }
  
