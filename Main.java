public class Main {
  
  // 01. Generic Type & Class;
  public static void genericTypeDemo() {
    Pair<Integer, Integer> tuple1 = new Pair<>();

    // Notasi biasa
    Pair<Integer, String> tuple2 = new Pair<Integer, String>();

    tuple1.set(Integer.valueOf(1), 2);
    tuple1.display();

    tuple2.set(2, "Hello World");
    tuple2.display();

    System.out.println(tuple2.toString());
  }

  public static void uas20192020Demo() throws Exception{
    Stack<Pair<Integer, Integer>> stack = new Stack<>();

    Pair<Integer, Integer> tuple1 = new Pair<>();
    Pair<Integer, Integer> tuple2 = new Pair<>();

    tuple1.set(1, 1);
    tuple2.set(2, 542339);
    
    stack.push(tuple1);
    stack.displayTop();
    System.out.println(stack.toString());

    stack.push(tuple2);
    stack.displayTop();
    System.out.println(stack.toString());

    System.out.println(stack.pop().toString());
    System.out.println(stack.toString());

    // Stack Overflow Exception
    // stack.setMaxCount(1);
    // stack.push(tuple2);

    // Stack Empty Exception;
    // Stack<Pair<Integer, Integer>> stack2 = new Stack<>();
    // stack2.displayTop();
  }

  public static void enumDemo() {
    for (ZombieEnum zombie : ZombieEnum.values()) {
      System.out.println("Zombie type: " + zombie.type + "; damage: " + zombie.damage + ", health: " + zombie.health + ", speed: " + zombie.speed);
    }
  }

  public static void innerClassDemo() {
    InnerClassDemo icd = new InnerClassDemo();
    InnerClassDemo.StaticNestedClass stc = new InnerClassDemo.StaticNestedClass();

    System.out.println(InnerClassDemo.staticOuterField);
    System.out.println(icd.outerField);
    
    InnerClassDemo.InnerClass ic = icd.new InnerClass();
    ic.accessMembers();

    stc.accessMembers(icd);
  }

  public static void main(String[] args) throws Exception{
    // 01. Generic
    // genericTypeDemo();

    // 02. soal UAS 2019/2020
    // uas20192020Demo();

    // 03. Enum
    // enumDemo();

    // 04. Nested Class
    innerClassDemo();
    
    // 05. Reflection

  }
}