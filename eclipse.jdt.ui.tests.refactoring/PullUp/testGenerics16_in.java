test;
[p] {
[IGeneric]
    package p;
  
  public interface IGeneric {
  }
[OtherImpl]
    package p;
  
  import java.io.IOException;
  
  public class OtherImpl implements IGeneric {
  }
  
[MainImpl]
    package p;
  
  import java.io.IOException;
  
  public class MainImpl implements IGeneric {
  	public <D> D genericMethod(String text) throws IOException {
  		return null;
  	}
  }
  
}
