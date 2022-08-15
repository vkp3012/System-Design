package CodeForObservor;

public class test {
	
	public static void main(String[] args) {
		CricketData cd = new CricketData();
		
		cd.setData(50, 1, 10);
		
		ScoreCardDisplay scd = new ScoreCardDisplay();
		NetRunRateDisplay nrrd = new NetRunRateDisplay();
		FinalScorePredictionDisplay fsd = new FinalScorePredictionDisplay();
		
		cd.register(scd);
		cd.register(nrrd);
		cd.register(fsd);
		
		cd.setData(100, 2, 20);
		
		cd.unregister(fsd);
		cd.setData(110, 3, 24);
	}
}
