package com.pyknic.servicekit;

class ExampleServer extends HttpServer {
    private static boolean bExit = false;

    public ExampleServer() throws java.io.IOException {
        super (1234);
        start();
    }

    public static void main(String[] args) {
      Runtime.getRuntime().addShutdownHook(new Thread() {
        @Override
        public void run() {  
          System.out.println("Set exit");  
          bExit = true;  
        }  
      });

      try {
        ExampleServer es = new ExampleServer();
        System.out.println("server start");
        while (!bExit) {
          Thread.sleep(1000);
        }
        System.out.println("server exit");
      } catch (Exception ex) {
        System.out.println("server start fail");
      }
    }

    // @Service methods here...
    @Service
    public String hi() {
      return "Hello, world!";
    }
}
