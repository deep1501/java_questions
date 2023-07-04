package com.java.coding_Test;

import java.util.concurrent.CompletableFuture;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class EvenOddPrintThreadCompletable {
    private static Object object= new Object();
    private static IntPredicate evenCond = e->e%2==0;
    private static IntPredicate oddCond = o->o%2!=0;
    
    public static void printNumber(IntPredicate cond){
        IntStream.rangeClosed(1, 10).filter(cond).forEach(EvenOddPrintThreadCompletable::execute);
    }

    public static void execute(int num){
        synchronized (object){
            try{
                System.out.println(Thread.currentThread().getName()+": "+ num);
                object.notify();
                object.wait();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.runAsync(()->EvenOddPrintThreadCompletable.printNumber(oddCond));
        CompletableFuture.runAsync(()->EvenOddPrintThreadCompletable.printNumber(evenCond));
        Thread.sleep(1000);
    }
}
