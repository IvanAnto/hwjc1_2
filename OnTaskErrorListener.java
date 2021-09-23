@FunctionalInterface
public interface OnTaskErrorListener { // создайте новый функциональный интерфейс OnTaskErrorListener

  void onError(String error);
}