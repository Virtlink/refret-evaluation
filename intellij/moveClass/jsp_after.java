test;
[pack1] {
[TestClass]
  package pack1;
  
}
[webinf] {
[TestTEI]
    
  import javax.servlet.jsp.tagext.TagExtraInfo;
  import javax.servlet.jsp.tagext.VariableInfo;
  import javax.servlet.jsp.tagext.TagData;
  
  public class TestTEI extends TagExtraInfo {
    public VariableInfo[] getVariableInfo(TagData tagData) {
      return new VariableInfo[] { new VariableInfo("testVar", tagData.getAttributeString("class"), true, VariableInfo.AT_BEGIN) };
    }
  }
  
}
[pack2] {
[TestClass]
  package pack2;
  
  public class TestClass {
  }
}
