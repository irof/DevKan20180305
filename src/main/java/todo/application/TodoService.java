package todo.application;

import domain.Task;
import domain.Tasks;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private Tasks tasks = new Tasks();

    public Tasks tasks() {
        return tasks;
    }

    public void add(Task task) {
        tasks.add(task);
    }
}
