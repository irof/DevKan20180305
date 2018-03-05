package application;

import domain.Task;
import domain.Tasks;

public class TodoService {
    public Tasks tasks() {
        return new Tasks();
    }

    public void add(Task task) {
    }
}
