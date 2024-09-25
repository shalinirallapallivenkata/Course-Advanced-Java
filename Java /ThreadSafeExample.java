// class P implements Runnable {// Thread has the method run and should have run()
//     public void run() {
//         for(int i = 0; i<=5; i++) {
//             System.out.println("Thread One");
//             try {// gives InterruptedException
//                 // using try catch
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e) {
//                 e.printStackTrace();
//                 // still might come not one after other might be scheduler
//                 // can be optimized by adding more time 
//                 //or how the threads reach out to scheduler to execute
//             }
//         }
//     }
// }
// class R implements Runnable{
//     public void run() {
//         for(int i = 0; i<=5; i++) {
//             System.out.println("Thread Two");
//             try {// gives InterruptedException
//                 // using try catch
//                 Thread.sleep(10);
//             }
//             catch(InterruptedException e) {
//                 e.printStackTrace();
//             }
//         }
//     }
// }

class Counter {
    int count;
    public synchronized void increment() {
        count++;
    }

}

class ThreadSafeExample { // Only one thread can work with a method at one time
    // One execution at one time
    public static void main(String args[]) throws InterruptedException{
        Counter c = new Counter ();
        Runnable objectOne = () -> {
            for(int i = 1; i<=10000; i++) {
                c.increment();
            }
      
        };
        Runnable objectTwo = () ->
        {
            for(int i = 1; i<=10000; i++) {
                c.increment();
            }
        };
        Thread threadOne = new Thread(objectOne);
        // Constructor of Thread takes Runnable object
        Thread threadTwo = new Thread(objectTwo);

        threadOne.start();
        threadTwo.start();
        threadOne.join();
        threadTwo.join();
        //after start use join
        System.out.println(c.count);
        // joining the threads so they finish the task simultaneously
        // making thread safe only one execution for correct increment value
        // of count else there is different value
        // using synchronized for increment method
        // race condition


       //System.out.println(objectOne.getPriority()); // 5


        // both threads trun parallely
        //Done by scheduler by the OS
        // Thread priority 1 to 10
        // default is 5
        // giving MAX priority wil not make the scheduler to execute that scheduler first
        // objectTwo.setPriority(Thread.MAX_PRIORITY );
        // Thread states
        // --- New --- cretaing a new thread new Thread
        // ---Runnable -- when goes to start() then goes to Runnable state, notify()
        // ---- Running --when thread running on CPU its Running state run()
        // ----Waiting --- sleep() method wait() is holding the thread is waiting
        // --- When notify() after waiting goes back to Runnable not Running
        // --- Dead --- Stop()

    }

}