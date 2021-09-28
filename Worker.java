public class Worker { // класс Б. необходимо реализовать класс Worker, который будет выполнять некоторые задачи и возвращать результат в родительский класс Main.
  
  private OnTaskDoneListener callback; // Добавьте в класс Worker переменную callback типа OnTaskDoneListener. Может нужен <String>?
  
  private OnTaskErrorListener errorCallback;
      
  public Worker(OnTaskDoneListener callback) { // Передайте в класс Worker ее значение через конструктор
    this.callback = callback;
  }  

  public Worker(OnTaskErrorListener errorCallback) { // Передайте в класс Worker ее значение через конструктор
    this.errorCallback = errorCallback;
  } 

  public void start() { // Смоделируйте выполнение классом Worker какой либо работы
    for (int i = 0; i < 100; i++) {
      if (i == 33) {
        System.out.println("Ошибка");
        System.out.println();
        continue;
      }  
      callback.onDone("Task " + i + " is done");
    }
  }

  public void error() { 
    errorCallback.onError("Ошибка");
  }  

}