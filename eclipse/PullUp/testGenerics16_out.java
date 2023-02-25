test;
[p] {
[IGeneric]
    package p;
  
  import java.io.IOException;
  
  public interface IGeneric {
  
  	<D> D genericMethod(String text) throws IOException;
  }
[OtherImpl]
    package p;
  
  import java.io.IOException;
  
  public class OtherImpl implements IGeneric {
  
  	@Override
  	public <D> D genericMethod(String text) throws IOException {
  		// TODO Auto-generated method stub
  		return null;
  	}
  }
  
[MainImpl]
    package p;
  
  import java.io.IOException;
  
  public class MainImpl implements IGeneric {
  	@Override
  	public <D> D genericMethod(String text) throws IOException {
  		return null;
  	}
  }
  
}
