test;
[Client]
    public class Client {
      C[] array;
  
      {
          array = new C[0];
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
  
