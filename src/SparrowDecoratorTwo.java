public class SparrowDecoratorTwo extends Decorator{
	public final int DISTANCE=50;
	SparrowDecoratorTwo(Bird bird){
		super(bird);
	}
	public int fly(){
		int distance=0;
		distance=bird.fly()+eleFly();
		return distance;
	}
	private int eleFly(){
		return DISTANCE;
	}
}