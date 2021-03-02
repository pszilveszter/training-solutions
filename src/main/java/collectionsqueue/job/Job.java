package collectionsqueue.job;

public class Job implements Comparable<Job> {

    private int priority;
    private String jobDescription;
    private boolean urgent;

    public Job(int priority, String jobDesciption) {
        if (priority < 0 || priority > 10) {
            throw new IllegalArgumentException(String.format("Invalid priority %d! Expected range between 1 - 10", priority));
        }
        this.priority = priority;
        this.jobDescription = jobDesciption;
        this.urgent = priority < 5;
    }


    public int getPriority() {
        return priority;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public boolean isUrgent() {
        return urgent;
    }



    @Override
    public int compareTo(Job j) {
        return Integer.valueOf(priority).compareTo((j).getPriority());
    }

}
