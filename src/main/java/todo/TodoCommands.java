package todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import todo.application.TodoService;
import domain.Task;
import domain.TaskName;

@ShellComponent
public class TodoCommands {

    @Autowired
    TodoService service;

    @ShellMethod("hogeする")
    public String hoge() {
        return  "fuga";
    }

    @ShellMethod("たすくをとうろくする")
    public void add(String name) {
        service.add(new Task(new TaskName(name)));
    }

    @ShellMethod("たすくいちらん")
    public String list() {
        return service.tasks().asText();
    }
}
