/**child of State.
 * one choice of the status of TV
 * @author Dongyu
 */
public class HomeState implements State {
	private TV tv;
	public HomeState(TV tv) {
		this.tv = tv;
	}

	@Override
	public void pressHomeButton() {
		System.out.println("TV is already on the home screen");
	}

	@Override
	public void pressNetflixButton() {
		System.out.println("Loading Netflix..., and change state");
		tv.setState(tv.getNetflixState());
	}

	@Override
	public void pressHuluButton() {
		System.out.println("Loading Hulu..., and change state");
		System.out.println(tv);
		tv.setState(tv.getHuluState());
	}

	@Override
	public void pressMovieButton() {
		System.out.println("Home: You must pick an app to show movies.");
	}

	@Override
	public void pressTVButton() {
		System.out.println("Home: You mut pick an app to show tv shows.");
	}

}
