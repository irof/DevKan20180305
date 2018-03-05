package domain;

public class Task {

    private final TaskName taskName;

    Status status;

    public Task(TaskName taskName) {

        this.taskName = taskName;
    }

    @Override
    public String toString() {
        return taskName.value;
    }
}
