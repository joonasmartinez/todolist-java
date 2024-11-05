import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TaskManager {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(String description){
        Task new_task = new Task(description);
        tasks.add(new_task);
        System.out.println("Task '"+description+"' adicionada com sucesso! ID:"+new_task.getId());
    }

    public void updateTask(int id){
        int idTask = getPositionTaskById(id);
        System.out.println("Você atualizou a task: "+ tasks.get(idTask).getDescription());
        switch (tasks.get(idTask).getStatus()){
            case TODO:
                tasks.get(idTask).markInProgress();
                break;
            case IN_PROGRESS:
                tasks.get(idTask).markDone();
                break;
            case DONE:
                tasks.get(idTask).markTodo();
                break;
        }
    }

    public void removeTask(int id){
        int idTask = getPositionTaskById(id);
        if(idTask == -1){
            System.out.println("Task inexistente. Impossível remover.");
            return;
        }
        System.out.println("Você removeu a task: "+ tasks.get(idTask).getDescription() + " | ID: "+tasks.get(idTask).getId());
        tasks.remove(idTask);
    }

    public int getPositionTaskById(int id){
        Task searchTask = new Task(id, "");
        return tasks.indexOf(searchTask);
    }

    public void listTasks(){
        if(tasks.isEmpty()) System.out.println("Não há tasks a listar.");
        tasks.forEach(task -> System.out.println( "ID: "+task.getId() + " | Descrição: "+task.getDescription()+" | Status: "+task.getStatus().toString()));

        }
    }
