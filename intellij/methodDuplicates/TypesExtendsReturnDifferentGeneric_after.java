test;
[Test]
    import java.util.Collection;
  import java.util.List;
  
  class Types {
  	public List<String> genericMethod() {
  		return new ArrayList<String>();
  	}
  	public void genericContext() {
  		List<String> sl = genericMethod();
  		Collection<String> sc = genericMethod();
  	}
  }
  
