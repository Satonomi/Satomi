public class SparrowDecorator extends Decorator{
	public final int DISTANCE=20;
	SparrowDecorator(Bird bird){
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