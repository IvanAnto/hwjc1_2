class Main { // класс А
  public static void main(String[] args) {
    
    OnTaskDoneListener listener = System.out::println; // В классе Main в методе main() определите переменную listener типа OnTaskDoneListener через лямбда-выражение:

    Worker worker1 = new Worker(listener); // создайте экземпляр класса Worker и передайте в конструктор класса listener:
    
    OnTaskErrorListener error = System.out::println;
    
    Worker worker2 = new Worker(error);    
    
    worker1.start();

    worker2.error();
  }
}