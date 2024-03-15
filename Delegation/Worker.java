public class Worker {
    private TaskDelegate taskDelegate;

    public Worker(TaskDelegate taskDelegate) {
        this.taskDelegate = taskDelegate;
    }

    public void performTask() {
        taskDelegate.doTask();
    }

    public void setTaskDelegate(TaskDelegate taskDelegate) {
        this.taskDelegate = taskDelegate;
    }
}
