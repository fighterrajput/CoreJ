package in.co.rays.streamtest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinner {
	public static void main(String[] args) {

		ArrayList<ContestantWinner> list = new ArrayList<ContestantWinner>();

		list.add(new ContestantWinner("Ankit", "7000431187"));
		list.add(new ContestantWinner("Dharm", "9568394041"));
		list.add(new ContestantWinner("Sunil", "99000"));
		list.add(new ContestantWinner("Jayesh", "9838983838"));
		list.add(new ContestantWinner("Raj", "9876543210"));
		list.add(new ContestantWinner("Rajneesh", "9000431187"));
		list.add(new ContestantWinner("Rajat", "9783883389"));

		list.stream().map(e -> e.phone).filter(e -> e.length() == 10).distinct()
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> {
					System.out.println(e);
				});
	}

}
