package intromethods.todo;

public class TodoListMain {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTodo("Java tanulás 1. hét");
        todoList.addTodo("Java tanulás 2. hét");
        todoList.addTodo("Java tanulás 3. hét");
        todoList.addTodo("Vizsga");
        todoList.addTodo("Karácsonyi készülődés");

        System.out.println(todoList.todosToFinish().size() + todoList.numberOfFinishedTodos() + "/" + todoList.numberOfFinishedTodos() + ":"  + todoList);

        todoList.finishTodos("Java tanulás 1. hét");
        System.out.println(todoList.todosToFinish().size() + todoList.numberOfFinishedTodos() + "/" + todoList.numberOfFinishedTodos() + ":"  + todoList);

        todoList.finishAllTodos(todoList.todosToFinish());
        System.out.println(todoList.todosToFinish().size() + todoList.numberOfFinishedTodos() + "/" + todoList.numberOfFinishedTodos() + ":"  + todoList);
        }
}
