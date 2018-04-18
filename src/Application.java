

public class Application {
	public void needBird(Bird bird){
		int flyDistance=bird.fly();
		System.out.println("这只鸟能飞行"+flyDistance+"米");
	}
	public static void main(String args[]){
		Application client=new Application();
		Bird bird1=new SparrowDecoratorTwo(new Sparrow());
		Bird bird2=new SparrowDecorator(bird1);
		client.needBird(bird1);
		client.needBird(bird2);
	}

}
