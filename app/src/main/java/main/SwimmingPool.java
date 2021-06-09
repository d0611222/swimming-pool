package SwimmingPool;

public class SwimmingPool {
	public int getPrice(boolean isWeekend, int age, int time, boolean isGroup, boolean isMember) {
		int price = 200;
		if(time<5 || 22<time || age<3 || 75<age) {
			price = -1;
		}
		else {
			if(isWeekend) {
				price = 250;
				if(isMember)
					price *= 0.5; 
			}
			else {
				if(isMember)
					price *= 0.5;
				else if(isGroup)
					price *= 0.7;
				else if(time < 7)
					price *= 0.8;
				else if(age <=12 || 60 <= age)
					price *= 0.8;
			}
		}						
		return price;
	}
}