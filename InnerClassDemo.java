public class InnerClassDemo {
  String outerField = "Outer Field";
  static String staticOuterField = "Static outer field";

  class InnerClass {
    void accessMembers() {
      System.out.println(outerField);
      System.out.println(staticOuterField);
    }
  }

  static class StaticNestedClass {
    void accessMembers (InnerClassDemo outer) {
      System.out.println(outer.outerField);
      System.out.println(staticOuterField);
    }
  }
}
