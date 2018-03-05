package application;

import domain.Task;
import domain.Tasks;

public class TodoService {

    private Tasks tasks = new Tasks();

    public Tasks tasks() {
        return tasks;
    }

    public void add(Task task) {
        tasks.add(task);
    }
}
