public class Main {

    public static void main(String[] args) throws Exception {

        Thread thread1 = new Thread(new Thread2("T1"));
        Thread thread2 = new Thread(new Thread2("T2"));
        thread2.start();
        thread1.start();
    }
}