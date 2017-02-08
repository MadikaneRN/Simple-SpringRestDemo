package za.ac.cput.domain.task;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by RichardM on 2017/02/07.
 */
public interface TaskRepository  extends MongoRepository<Task, String> {

    Task findByTaskId(String taskId);

}
