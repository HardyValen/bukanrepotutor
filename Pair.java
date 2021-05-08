public class Pair<K, V> implements Displayable {
  private K key;
  private V value;

  public K getKey() {
    return key;
  }

  public V getValue() {
    return value;
  }

  public void set(K key, V value) {
    this.key = key;
    this.value = value;
  }

  public void display() {
    System.out.println("Key: " + key.toString() + "; Value: " + value.toString());
  }

  @Override
  public String toString() {
    return "Key: " + key.toString() + "; Value: " + value.toString();
  }

  public static void main(String[] args) {
    // Notasi type inference
    Pair<Integer, Integer> tuple1 = new Pair<>();

    // Notasi biasa
    Pair<Integer, String> tuple2 = new Pair<Integer, String>();

    tuple1.set(Integer.valueOf(1), 2);
    tuple1.display();

    tuple2.set(2, "Hello World");
    tuple2.display();
  }
}
