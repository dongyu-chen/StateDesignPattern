import java.util.ArrayList;

public class NetflixState implements State{
	private TV tv;
	private ArrayList<String> movies;
	private ArrayList<String> tvs;
	public NetflixState(TV tv) {
		this.tv = tv;
		this.movies = new ArrayList<String>();
		this.tvs = new ArrayList<String>();
		movies.add("m1");
		movies.add("m2");
		movies.add("m3");
		movies.add("m4");
		movies.add("m5");
		tvs.add("tv1");
		tvs.add("tv2");
		tvs.add("tv3");
		tvs.add("tv4");
		tvs.add("tv5");

	}
	
	@Override
	public void pressHomeButton() {
		System.out.println("Loading the Home Screen...");
		tv.setState(tv.getHomeState());
	}
	
	@Override
	public void pressNetflixButton() {
		System.out.println("We are already in Netflix");
	}
	
	@Override
	public void pressHuluButton() {
		System.out.println("Loading Hulu...");
		tv.setState(tv.getHuluState());
	}
	
	@Override
	public void pressMovieButton() {
		System.out.println("Netflix Movies:");		
		for(int i = 0; i < movies.size(); i++) {
			System.out.print(movies.get(i) + " ");
		}
		System.out.println();
	}
	
	@Override
	public void pressTVButton() {
		System.out.println("Netflix TV Shows:");		
		for(int i = 0; i < tvs.size(); i++) {
			System.out.print(tvs.get(i) + " ");
		}
		System.out.println();		
	}

}
