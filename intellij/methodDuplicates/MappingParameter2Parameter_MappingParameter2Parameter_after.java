test;
[MappingParameter2Parameter]
    class Mapping {
    public void <caret>method(Mapping methodMapping) {
      methodMapping.hashCode();
    }
  
    public void context(Mapping contextMapping) {
        method(contextMapping);
    }
  }
  
