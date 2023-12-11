package pack;

public class printer_queue {

	import java.util.LinkedList;

	class PrintTask {
	    String documentName;

	    public PrintTask(String documentName) {
	        this.documentName = documentName;
	    }

	    public String getDocumentName() {
	        return documentName;
	    }
	}

	class PrintQueue {
	    LinkedList<PrintTask > queue;

	    public PrintQueue() {
	        queue = new LinkedList<>();
	    }

	    // Method to add a task to the queue
	    public void enqueue(PrintTask task) {
	        queue.addLast(task);
	    }

	    // Method to remove a task from the queue
	    public PrintTask dequeue() {
	        return queue.pollFirst();
	    }

	    // Method to check if the queue is empty
	    public boolean isEmpty() {
	        return queue.isEmpty();
	    }	

}
    PrintQueue printQueue = new PrintQueue();
    printQueue.enqueue(new PrintTask("Document1"));
    printQueue.enqueue(new PrintTask("Document2"));

    while (!printQueue.isEmpty()) {
        PrintTask task = printQueue.dequeue();
        System.out.println("Printing " + task.getDocumentName());
    }
}