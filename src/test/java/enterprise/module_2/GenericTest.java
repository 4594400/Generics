package enterprise.module_2;

import static org.junit.Assert.*;


public class GenericTest {

    @org.junit.Test
    public void ValidResultListSizeTest() throws Exception {
        Executor<Number> numberExecutor = new ExecutorImpl();
        numberExecutor.addTask(new IntegerTask(5));

        numberExecutor.addTask(new IntegerTask(150));
        numberExecutor.addTask(new IntegerTask(10));
        numberExecutor.addTask(new IntegerTask(200));

        numberExecutor.addTask(new LongTask(-500L), new NumberValidator());
        numberExecutor.addTask(new IntegerTask(-5), new NumberValidator());
        numberExecutor.addTask(new IntegerTask(7), new NumberValidator());
        numberExecutor.execute();
        assertEquals(5, numberExecutor.getValidResults().size());


    }
}