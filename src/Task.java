import java.time.LocalDateTime;

public class Task {
    private static int LastId = 0;
    private int id;
    private String description;
    private Status status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Task(String description){
        this.id = ++LastId;
        this.description = description;
        this.status =Status.TODO;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

    public Task(int id, String description){
        this.id = id;
    }

public int getId(){
        return id;
}

public String getDescription(){
        return this.description;
}

public Status getStatus(){
        return this.status;
}

public void markInProgress(){
    this.status = Status.IN_PROGRESS;
    this.updatedAt = LocalDateTime.now();
}

public void markDone(){
    this.status = Status.DONE;
    this.updatedAt = LocalDateTime.now();
}

public void markTodo(){
    this.status = Status.TODO;
    this.updatedAt = LocalDateTime.now();
}

@Override
public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
    Task objeto = (Task) obj;
        return id == objeto.id;
    }

}
