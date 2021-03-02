package collectionsqueue.collectionsdequeue;

import collectionsqueue.job.Job;
import collectionsqueue.job.NoJobException;

import java.util.*;

public class JobQueue {


    public Deque<Job> addJobByUrgency(Job... jobs) {
        Deque<Job> d = new ArrayDeque<>();
        for (Job j: jobs) {
            if (j.isUrgent()) {
                d.offerFirst(j);
            } else {
                d.offerLast(j);
            }
        }
        return d;
    }

    public Job dispatchUrgentJob(Deque<Job> jobs) {
        if (jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.pollFirst();
    }

    public Job dispatchNotUrgentJob(Deque<Job> jobs) {
        if (jobs.isEmpty()) {
            throw new NoJobException("No job available, get a rest!");
        }
        return jobs.pollLast();
    }
}
