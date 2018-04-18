public class Application {
	public void needBird(Bird bird){
		int flyDistance=bird.fly();
		System.out.println("这只鸟能飞行"+flyDistance+"米");
	}
	public static void main(String args[]){
		Application client=new Application();
		Bird bird1=new SparrowDecoratorTwo(new Sparrow());
		Bird bird2=new SparrowDecorator(bird1);
		Bird bird3=new SparrowDecorator(bird2);
		Bird bird4=new SparrowDecoratorTwo(bird3);
		client.needBird(bird1);
		client.needBird(bird2);
		client.needBird(bird3);
		client.needBird(bird4);
	}
	
}
