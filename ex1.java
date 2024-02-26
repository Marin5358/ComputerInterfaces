public class ex1 {
        public static void main(String[] args) {
            for (int i = 1; i <= 5; i++) {
                MyThread thread = new MyThread("Thread-" + i, Thread.NORM_PRIORITY + i);
                thread.start();
            }
        }

        static class MyThread extends Thread {
            public MyThread(String name, int priority) {
                super(name);
                setPriority(priority);
            }


            public void run() {
                System.out.println("Thread Name: " + getName());
                System.out.println("Thread Priority: " + getPriority());
                System.out.println("Thread is alive: " + isAlive());
                System.out.println("Thread Declaration: " + this);


                int newPriority = getPriority() + 1;
                setPriority(newPriority);
                System.out.println("New Thread Priority: " + getPriority());
                System.out.println("-----------------------------------------");
            }
        }
    }


