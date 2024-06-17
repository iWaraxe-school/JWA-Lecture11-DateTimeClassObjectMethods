package com.coherentsolutions.java.webauto.section03.advanced;

/**
 * Demonstrates the wait() and notify() methods.
 */
public class Ex06WaitNotifyMethods {
    public static void main(String[] args) {
        Message message = new Message();
        Thread waiter = new Thread(new Waiter(message), "waiter");
        Thread notifier = new Thread(new Notifier(message), "notifier");

        waiter.start();
        notifier.start();
    }
}

class Message {
    private String message;

    public synchronized void waitForMessage() {
        try {
            wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void sendMessage(String message) {
        this.message = message;
        notify();
    }

    public String getMessage() {
        return message;
    }
}

class Waiter implements Runnable {
    private final Message message;

    public Waiter(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (message) {
            System.out.println(Thread.currentThread().getName() + " waiting to get notified at time: " + System.currentTimeMillis());
            message.waitForMessage();
            System.out.println(Thread.currentThread().getName() + " got notified at time: " + System.currentTimeMillis());
            System.out.println(Thread.currentThread().getName() + " processed: " + message.getMessage());
        }
    }
}

class Notifier implements Runnable {
    private final Message message;

    public Notifier(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        synchronized (message) {
            System.out.println(Thread.currentThread().getName() + " started at time: " + System.currentTimeMillis());
            try {
                Thread.sleep(2000);
                message.sendMessage("Hello, World!");
                System.out.println(Thread.currentThread().getName() + " sent message at time: " + System.currentTimeMillis());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
