class Main { // класс А
  public static void main(String[] args) {
    
    OnTaskDoneListener listener = System.out::println; // В классе Main в методе main() определите переменную listener типа OnTaskDoneListener через лямбда-выражение:
    
    OnTaskErrorListener error = System.out::println; // В классе Main в методе main() определите переменную error типа OnTaskErrorListener через лямбда-выражение:

    Worker worker = new Worker(listener, error); // создайте экземпляр класса Worker и передайте в конструктор класса listener и error.

    worker.start();
    
  }
}