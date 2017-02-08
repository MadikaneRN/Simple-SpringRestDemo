package za.ac.cput.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import za.ac.cput.domain.task.Task;
import za.ac.cput.domain.task.TaskRepository;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by RichardM on 2017/02/07.
 */

@RestController
public class TaskController {


    private TaskRepository taskRepo;

    @Autowired
    public TaskController(TaskRepository taskRepo) {
        super();
        this.setTaskRepo(taskRepo);
    }

    @PostConstruct
    public void initData(){
        taskRepo.deleteAll();
        taskRepo.save(new Task("1","task num 1"));
        taskRepo.save(new Task("2","task num 2"));
        taskRepo.save(new Task("3","task num 3"));
    }

    @RequestMapping("/tasks")
    public List<Task> getAllTasks(){
        return taskRepo.findAll();
    }

    @RequestMapping(value = "/task/{taskId}")
    public Task getTask(@PathVariable("taskId") String taskId) {
        return taskRepo.findByTaskId(taskId);
    }

    public TaskRepository getTaskRepo() {
        return taskRepo;
    }

    public void setTaskRepo(TaskRepository taskRepo) {
        this.taskRepo = taskRepo;
    }

}
