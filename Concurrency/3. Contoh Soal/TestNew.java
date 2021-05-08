public class TestNew {

   public static void main(String args[]) throws Exception {
      
      Thread t1 = new Thread(new MyThread("T1", true));
      Thread t2 = new Thread(new MyThread("T2", false));

      /**
       * 
       * 
       */

      t1.start();
      t2.start();
      

      
      try {
         t1.join();
         t2.join();
      } 
      catch (InterruptedException e) {
         e.printStackTrace();
      }

      //System.out.println("THIS IS MAIN THREAD!");
   }
}