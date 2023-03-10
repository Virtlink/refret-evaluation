test;
[Test]
    class Element {
      String id;
  
      String getID() {
          return id;
      }
  
      public String method(Element element) {
          return getID() + element.getID();
      }
  
      public String staticMethod(Element element) {
          StringBuffer buffer = new StringBuffer();
          buffer.append(element.getID());
          return buffer.toString();
      }
      static Element toXML(Element element){
          X el= new X("El")
          el.setAttribute("attr", element.getID());
          return el;
      }
  }
  
  class Usage {
      public String staticMethod(Element element) {
          StringBuffer buffer = new StringBuffer();
          buffer.append(element.getID());
          return buffer.toString();
      }
  }
