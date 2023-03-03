// CREATING A SINGLE THREAD USING RUNNABLE INTERFACE 
//NOTE RUNNABLE CREATES A TASK,CAN BE ASSIGNED TO A THREAD 
class Task implements Runnable {
	public void run() {
		System.out.println(Thread.currentThread() + "running");
		System.out.println("welcome");
	}
	
}
public class Test8 {
public static void main(String[] args) throws Exception {
	System.out.println("HI");
	Task task = new Task();
	Thread t1 = new Thread(task);
	t1.setName("firstchild");
	t1.start();
	Thread.sleep(2000);
	System.out.println("bye");
	


}
}