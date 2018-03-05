package application;

import domain.Tasks;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TodoServiceTest {

    @Test
    void やることがとれる() {
        TodoService sut = new TodoService();
        Tasks actual = sut.tasks();
        assertThat(actual).isNotNull();
    }
}