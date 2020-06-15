package org.practice2020.thread;


import com.sun.istack.internal.logging.Logger;

public class SingleThread {

    private static Logger logger = Logger.getLogger(ThreadExample.class);

    static class ThreadExample implements Runnable {

        @Override
        public void run() {
            logger.info("runnable");
            for (int i = 0; i < 100000; i++) {
                for (int j = 0; j < 50000; j++) {
                    for (int k = 0; k < 50000; k++) {
                        // some code
                    }
                }
            }
            logger.info("runnable is finished");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread te1 = new Thread(new ThreadExample());
        Thread te2 = new Thread(new ThreadExample());
        te1.start();
        // will wait for the end of thread te1 and will start the main thread and thread te2 to start
        te1.join();
        logger.info("Main thread!");
        te2.start();
    }

}
