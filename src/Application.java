public class Application {
	public void needBird(Bird bird){
		int flyDistance=bird.fly();
		System.out.println("��ֻ���ܷ���"+flyDistance+"��");
	}
	public static void main(String args[]){
		Application client=new Application();
		Bird sparrow=new Sparrow();
		Bird sparrowDecorator1=new SparrowDecorator(sparrow);
		Bird sparrowDecorator2=new SparrowDecorator(sparrowDecorator1);
		client.needBird(sparrowDecorator1);
		client.needBird(sparrowDecorator2);
	}

}