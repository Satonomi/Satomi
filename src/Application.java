

public class Application {
	public void needBird(Bird bird){
		int flyDistance=bird.fly();
		System.out.println("��ֻ���ܷ���"+flyDistance+"��");
	}
	public static void main(String args[]){
		Application client=new Application();
		Bird bird1=new SparrowDecorator(new Sparrow());
		Bird bird2=new SparrowDecorator(bird1);
		client.needBird(bird1);
		client.needBird(bird2);
	}

}
