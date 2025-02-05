public class Main {
    public static class ExecOne implements Runnable {
        public void run(){
            for (int x = 1; x <= 50; x++){
                System.out.println("thread #1: " + x);
                try {
                    Thread.sleep((int)(Math.random() * 500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ExecTwo implements Runnable {
        public void run(){
            for (int x = 1; x <= 50; x++){
                System.out.println("thread #2: " + x);
                try {
                    Thread.sleep((int)(Math.random() * 500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class ExecThree implements Runnable {
        public void run(){
            for (int x = 1; x <= 50; x++){
                System.out.println("thread #3: " + x);
                try {
                    Thread.sleep((int)(Math.random() * 500));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new ExecOne());
        Thread t2 = new Thread(new ExecTwo());
        Thread t3 = new Thread(new ExecThree());
        t1.start();
        t2.start();
        t3.start();
    }
}
//ก่อนThread.sleep() แบบสุ่ม การทำงานเร็วกว่าแบบหลังใส่ sleep เธรดจะทำงานใกล้ๆกัน และจะจบในเวลาใกล้เคียงกัน
//หลังThread.sleep() แบบสุ่ม ช้ากว่าแบบก่อนใส่ sleep เธรดแต่ละตัวทำงานแบบคาดเดาไม่ได้ บางเธรดอาจช้ากว่าเธรดอื่น
