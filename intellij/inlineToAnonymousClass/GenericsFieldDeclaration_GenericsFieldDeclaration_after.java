test;
[GenericsFieldDeclaration]
    class Client {
    private Object myGen = new Object() {
        private String myT;
  
        public String getT() {
             return myT;
        }
  
        public void setT(String t) {
            myT = t;
        }
    };
  }
  
