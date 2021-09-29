public class Worker { // класс Б. необходимо реализовать класс Worker, который будет выполнять некоторые задачи и возвращать результат в родительский класс Main.
  
  private OnTaskDoneListener callback; // Добавьте в класс Worker переменную callback типа OnTaskDoneListener. 
  
  private OnTaskErrorListener errorCallback;
      
  public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) { // Передайте в класс Worker значения через конструктор
    this.callback = callback;
    this.errorCallback = errorCallback;
  }  
  
  public void start() { // Смоделируйте выполнение классом Worker какой либо работы
    for (int i = 0; i < 100; i++) {
      if (i == 33) {
        System.out.println();
        errorCallback.onError("Ошибка");
        System.out.println();
        continue;
      }  
      callback.onDone("Task " + i + " is done");
    }
  }
}