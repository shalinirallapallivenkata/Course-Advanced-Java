class P extends Thread {// Thread has the method run and should have run()
    public void run() {
        for(int i = 0; i<=100; i++) {
            System.out.println("Thread One");
            try {// gives InterruptedException
                // using try catch
                Thread.sleep(10);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
                // still might come not one after other might be scheduler
                // can be optimized by adding more time 
                //or how the threads reach out to scheduler to execute
            }
        }
    }
}
class R extends Thread {
    public void run() {
        for(int i = 0; i<=100; i++) {
            System.out.println("Thread Two");
            try {// gives InterruptedException
                // using try catch
                Thread.sleep(10);
            }
            catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class ThreadExample {
    public static void main(String args[]) {
        P objectOne = new P();
        R objectTwo = new R();
        objectOne.start();
        objectTwo.start();
        System.out.println(objectOne.getPriority()); // 5


        // both threads trun parallely
        //Done by scheduler by the OS
        // Thread priority 1 to 10
        // default is 5
        // giving MAX priority wil not make the scheduler to execute that scheduler first
        objectTwo.setPriority(Thread.MAX_PRIORITY );

    }

}