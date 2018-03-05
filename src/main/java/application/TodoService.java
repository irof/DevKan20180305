package application;

import domain.Tasks;

public class TodoService {
    public Tasks tasks() {
        return new Tasks();
    }
}
