package enterprise.module_2;

public interface Task <T> {

    // Метода запускает таск на выполнение
    void execute();

    // Возвращает результат выполнения
    T getResult();

    T getValue();

    Validator getValidator();
    void setValidator(Validator<Number> validator);

}
