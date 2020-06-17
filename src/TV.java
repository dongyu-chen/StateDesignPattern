/**
 * creates a tv object
 * @author Dongyu
 *
 */
public class TV {
	private State homeState;
	private State netflixState;
	private State huluState;
	private State state;
	public TV() {
		this.homeState = new HomeState(this);
		this.netflixState = new NetflixState(this);
		this.huluState = new HuluState(this);
		this.state = this.homeState;
	}
	
	/**
	 * change the state accordingly
	 * @param state
	 */
	public void setState(State state) {
		if(state == homeState) {
			this.state = homeState;
		}else if(state == netflixState) {
			this.state = netflixState;
		}else if(state == huluState) {
			this.state = huluState;
		}
	}
	
	public State getHomeState() {
		return this.homeState;
	}
	
	public State getNetflixState() {
		return this.netflixState;
	}
	
	public State getHuluState() {
		return this.huluState;
	}
	
	public void pressHomeButton() {
		state.pressHomeButton();
	}
	
	public void pressNetflixButton() {
		state.pressNetflixButton();
	}
	
	public void pressHuluButton() {
		state.pressHuluButton();
	}
	
	public void pressMovieButton() {
		state.pressMovieButton();
	}
	
	public void pressTVButton() {
		state.pressTVButton();
	}
}
