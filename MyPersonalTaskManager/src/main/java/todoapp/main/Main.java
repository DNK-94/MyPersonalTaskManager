package todoapp.main;


import todoapp.service.ToDoList;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nВыберите действие:");
            System.out.println("1. Показать задачи");
            System.out.println("2. Добавить задачу");
            System.out.println("3. Отметить задачу как выполненную");
            System.out.println("4. Удалить задачу");
            System.out.println("5. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    toDoList.showTasks();
                    break;
                case 2:
                    System.out.println("Введите описание задачи:");
                    String description = scanner.nextLine();
                    toDoList.addTask(description);
                    break;
                case 3:
                    System.out.println("Введите номер задачи для отметки как выполненной:");
                    int completeIndex = scanner.nextInt() - 1;
                    toDoList.markTaskAsCompleted(completeIndex);
                    break;
                case 4:
                    System.out.println("Введите номер задачи для удаления:");
                    int removeIndex = scanner.nextInt() - 1;
                    toDoList.removeTask(removeIndex);
                    break;
                case 5:
                    System.out.println("Выход из программы.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
        }
    }
}
