package sem_1;

import sem_1.task.Task_1;
import sem_1.task.Task_2;
import sem_1.task.Task_3;

public class Main {

    public static void main(String[] args) {
//        Task_1 task_1 = new Task_1();
//        Task_1.hello();
//        Task_2.hello();
        int[] array = new int[] {1,1,1,0,1,1,1,1};
        System.out.println(Task_3.getMaxOneCount(array));
    }
}
