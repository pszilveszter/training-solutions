package intromethods.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<ToDo> todos = new ArrayList<>();

    public void addTodo(String caption) {
        todos.add(new ToDo(caption));
    }

    @Override
    public String toString() {
        return "Tennivalók{" + todos + "}";
    }

    public void finishTodos(String caption) {
        for (ToDo t : todos ) {
            if (t.getCaption().equals(caption)) {
                t.finish();
            }
        }
    }

    public void finishAllTodos(List<String> todosToFinish) {
        for (String t : todosToFinish) {
            finishTodos(t);
        }
    }

    public List<String> todosToFinish() {
        List<String> openTodos = new ArrayList<>();
        for (ToDo t : todos) {
            if (!t.isFinished()) {
                openTodos.add(t.getCaption());
            }
        }
        return openTodos;
    }

    public int numberOfFinishedTodos() {
        int i = 0;
        for (ToDo t : todos) {
            if (t.isFinished()) {
                i++;
            }
        }
        return i;
    }

}
