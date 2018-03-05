package application;

import domain.Task;
import domain.TaskName;
import domain.Tasks;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TodoServiceTest {

    @Test
    void やることがとれる() {
        TodoService sut = new TodoService();

        Task task = new Task(new TaskName("yarukoto"));
        sut.add(task);

        Tasks actual = sut.tasks();
        assertThat(actual.asText())
                .contains("yarukoto");
    }
}