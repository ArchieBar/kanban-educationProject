public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = Manager.getDefault();

        Task task1 = new Task("Задача 1", "Описание 1", Status.NEW);
        taskManager.createTask(task1);
        Task task2 = new Task("Задача 2", "Описание 2", Status.NEW);
        taskManager.createTask(task2);

        EpicTask epicTask1 = new EpicTask("Эпик 1", "Описание 1", Status.NEW);
        taskManager.createEpicTask(epicTask1);
        SubTask subTask1_1 = new SubTask("Подзадача 1-1", "Описание 1-1", Status.NEW,  3);
        taskManager.createSubTask(subTask1_1);
        SubTask subTask2_1 = new SubTask("Подзадача 2-1", "Описание 2-1", Status.NEW,  3);
        taskManager.createSubTask(subTask2_1);

        EpicTask epicTask2 = new EpicTask("Эпик 2", "Описание 2", Status.NEW);
        taskManager.createEpicTask(epicTask2);
        SubTask subTask1_2 = new SubTask("Подзадача 1_2", "Описание 1_2", Status.NEW,  6);
        taskManager.createSubTask(subTask1_2);

        System.out.println(taskManager.getTaskById(1));
        System.out.println(taskManager.getEpicTaskById(3));
        System.out.println(taskManager.getSubTaskById(4));

        System.out.println(taskManager.getHistory());

        System.out.println(taskManager.getTaskById(2));
        System.out.println(taskManager.getEpicTaskById(6));
        System.out.println(taskManager.getSubTaskById(7));

        System.out.println(taskManager.getHistory());
    }
}
