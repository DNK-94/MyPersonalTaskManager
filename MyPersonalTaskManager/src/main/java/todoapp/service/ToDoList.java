package todoapp.service;

import todoapp.model.Task;

import java.util.ArrayList;
import java.util.List;

public class ToDoList {
    private List <Task> tasks;

    public ToDoList() {
        tasks = new ArrayList<>();
    }

    public void addTask (String description){
        tasks.add(new Task(description));
        System.out.println("Задача добавлена: " + description);
    }

    public void markTaskAsCompleted(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).markAsCompleted();
            System.out.println("Задача выполнена: " + tasks.get(index).getDescription());
        } else {
            System.out.println("Неверный индекс задачи.");
        }
    }
    public void removeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            System.out.println("Задача удалена: " + tasks.get(index).getDescription());
            tasks.remove(index);
        } else {
            System.out.println("Неверный индекс задачи.");
        }
    }

    public void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("Список задач:");
            for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
                }
            }
        }
    }

