package domain;

import java.util.ArrayList;
import java.util.List;

public class Tasks {

    List<Task> list = new ArrayList<>();

    public String asText() {
        return list.toString();
    }

    public void add(Task task) {
        list.add(task);
    }
}
