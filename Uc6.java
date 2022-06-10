package snakeladder;

public class Uc6 {
	static int PLYER1_POINTS = 0;
	static int count = 0;


	static int random_value(int maxi) {
		int die_value = (int)(Math.floor(Math.random()*10) % (maxi)) + 1;

		return die_value;
	}

	static int snake(int die, int player){

		System.out.println("snake = " + die);
		int temp = player - die;
		if (temp <= 0){
			player -= 0;

		}

		else {
			player = temp;
		}
		return player;
	}

	static int ladder(int die, int player){
		System.out.println("ladder = " + die);
		int temp = player + die;

		if (temp <= 100){
			player = temp;
		}

		return player;
	}

	static int calculation(int player){
		System.out.println("current points of player = " + player);
		int die_number = random_value(6);
		System.out.println("dice number" + die_number);

		int option = random_value(3);
		System.out.println("option is" + option);

		if (option == 1){

			int result = ladder(die_number, player);

			return result;
		}

		else if(option == 2){


			int result = snake(die_number, player);
			return result;
		}

		else {

			System.out.println("no play=0");

			return player;
		}

	}

	public static void main(String[] args) {
		while (PLYER1_POINTS < 100){



			PLYER1_POINTS= calculation(PLYER1_POINTS);
			System.out.println("points of player 1 is " + PLYER1_POINTS);


			if (PLYER1_POINTS == 100){
				System.out.println("player 1 won the match");
			}
			count +=1;
		}
		System.out.println("total count of dies played = "+count);

	}

}
