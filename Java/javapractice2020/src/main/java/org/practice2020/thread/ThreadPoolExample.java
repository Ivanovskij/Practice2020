package org.practice2020.thread;

import com.sun.istack.internal.logging.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolExample {

    private static Logger logger = Logger.getLogger(SingleThread.ThreadExample.class);

    private ExecutorService threadPool = Executors.newFixedThreadPool(2);
    private List<Future> futureList = new ArrayList<>();

    static class Task implements Callable<Integer> {
        private int number;

        public Task(int number) {
            this.number = number;
        }

        @Override
        public Integer call() throws Exception {
            int result = 0;
            for(int i = 1; i <= number; i++) {
                result += i;
            }
            return result;
        }
    }

    public void exampleOfFuture() throws Exception {
        for (int i = 0; i < 5; i++) {
            Future future = threadPool.submit(new Task(i));
            futureList.add(future);
        }

        for (Future future : futureList) {
            logger.info("Result: " + future.get());
        }

        threadPool.shutdown();
    }

    public static void  main(String[] args) throws Exception {
        ThreadPoolExample t = new ThreadPoolExample();
        t.exampleOfFuture();
    }

}
