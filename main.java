public static void main(String[] args) {
    Thread thread = new Thread(new MyRunnable());
    thread.start();
}

private static class MyRunnable implements Runnable {
    @Override
    public void run() {
        // ...
    }
}
