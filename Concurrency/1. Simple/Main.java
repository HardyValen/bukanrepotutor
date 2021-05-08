public class Main {

    public static void main(String[] args) throws Exception {

        Thread thread1 = new Thread1("T1");
        Thread thread2 = new Thread(new Thread2("T2"));
        thread1.start(); // non-blocking
        thread2.start(); // non-blocking

        try {
            thread1.join(); // code blocking di thread yang memanggil
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("ini setelah thread 1 & 2 dijalankan");
    }
}