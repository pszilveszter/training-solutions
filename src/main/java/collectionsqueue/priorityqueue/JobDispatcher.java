package collectionsqueue.priorityqueue;

import collectionsqueue.job.*;

import java.util.*;

public class JobDispatcher {


    public Job dispatchNextJob(Queue<Job> jobs) {
        if (jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.poll();
    }


    public PriorityQueue<Job> addJob(Job... jobs) {
        return new PriorityQueue<>(Arrays.asList(jobs));
    }
}
