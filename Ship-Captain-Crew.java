/*
  Name: Murf
  Date: 06 / 18 /2025
  Project name: Ship Captain Crew
  Descriptiion: An interactive, text-based terminal implementation of the classic marine dice game "Ship, Captain, and Crew" built in Java. 
  The application features a fully automated game loop where a human player competes against a computer opponent over multiple rounds,
  placing bets from a virtual currency pool until one player goes bankrupt.
  
*/
public class Main {
	public static void main(String[] args) {
		System.out.println("Final Project\n");
       // intro the program
		intro();
      // start the game
        playgame();
     // final message
        outro();
    }

   public static void playgame()
        {
		int playerMoney = 100; // starting money for player
		int computerMoney = 100; // starting money for computer
		int pot = 0; // total money in the pot

    // loop until  runs out of money
		while (playerMoney >= 10 && computerMoney >= 10) {
        //  bet $10 each
			playerMoney -= 10;
			computerMoney -= 10;
			pot += 20;

			System.out.println("\nBoth players pay $10 to the pot.");
			System.out.println("Pot is now: $" + pot);

            // each takes a turn
			int playerScore = playerTurn();
			int computerScore = computerTurn();


			System.out.println("\nYour score: " + playerScore);
			System.out.println("\nComputer score: " + computerScore);

          // determine winner and give pot
			if (playerScore > computerScore) {
				System.out.println("\nYou win this round and the pot of " + pot + "!");
				playerMoney += pot;
				pot = 0;
			} else if (playerScore < computerScore) {
				System.out.println("\nComputer wins this round and the pot of " + pot + ".");
				computerMoney += pot;
				pot = 0;
			} else {
				System.out.println("\nIt's a tie! The pot carries over to the next round.");
			}

			System.out.println("\nMoney : You: " + playerMoney + " | Computer: " + computerMoney);
		}

      // check who ran out of money
		if (playerMoney <= 0) {
			System.out.println("\nYou ran out of money. Game over.");
		} else if (computerMoney <= 0) {
			System.out.println("\nComputer ran out of money. You win the game!");
		}

		outro();
	}
    


	public static void intro() 
   {
		System.out.println("\nWelcome to Ship Captain Crew.");
		System.out.println("You have up to 3 chances to roll 5 dice.");
		System.out.println("You must get a 6 (Ship), then a 5 (Captain), then a 4 (Crew)  in that order.");
		System.out.println("After getting Ship, Captain, and Crew, you can choose which cargo dice to reroll.");
		System.out.println("Each player starts with $100 and pays $10 into the pot each round. Winner takes the pot!\n");
	}

    // exit message
	public static void outro() 
    {
		System.out.println("\nThanks for playing Ship Captain Crew!");
	}

// handles the player's turn
	public static int playerTurn() 
    {
		int[] dice = new int[5];
		boolean hasShip = false, hasCaptain = false, hasCrew = false;
		int rolls = 0;

        // 3 rolls
		while (rolls < 3) {
			System.out.println("\nRoll #" + (rolls + 1));
			for (int i = 0; i < 5; i++) {
				if (dice[i] != -1) {
					dice[i] = rollDie();
				}
			}

			printArray(dice);

             // lock  Ship, Captain, and Crew
			if (!hasShip) hasShip = lockValue(dice, 6);
			if (hasShip && !hasCaptain) hasCaptain = lockValue(dice, 5);
			if (hasShip && hasCaptain && !hasCrew) hasCrew = lockValue(dice, 4);

             // if all three are locked, ask player for cargo reroll
			if (hasShip && hasCaptain && hasCrew)
            {
				if (rolls < 2) {
					System.out.print("You got Ship, Captain, and Crew! Reroll cargo? (Y/N): ");
					try {
						String choice = In.getString();


						if (choice.equals("Y") || choice.equals("y")) {
							System.out.print("Which cargo? Left(3), Right(4), Both(B): ");
							String which =  In.getString();
				

							if (which.equals("3"))
                            {
								dice[3] = 0;
							} 
                            else if (which.equals("4")) 
                            {
								dice[4] = 0;
							} 
                            else if (which.equals("B") || which.equals("b"))
                            {
								dice[3] = 0;
								dice[4] = 0;
							}
                            else 
                            {
								System.out.println("\nInvalid input. Keeping both dice.");
							}
						}
                        else 
                        {
							break;
						}
					} catch (Exception e) {
						System.out.println("\nInvalid input. Keeping current cargo.");
						break;
					}
				} 
                else
                {
					break;
				}
			}
			rolls++;
		}

          // score  if all three are locked
		if (hasShip && hasCaptain && hasCrew) 
        {
			return sumCargo(dice);
		}
        else
        {
			System.out.println("\nYou did not get Ship, Captain, and Crew.");
			return 0;
		}
	}

     // computer's turn
 	public static int computerTurn() {
		int[] dice = new int[5];
		boolean hasShip = false, hasCaptain = false, hasCrew = false;
		int rolls = 0;

		while (rolls < 3) {
			for (int i = 0; i < 5; i++) {
				if (dice[i] == 0) {
					dice[i] = rollDie();
				}
			}

			if (!hasShip) hasShip = lockValue(dice, 6);
			if (hasShip && !hasCaptain) hasCaptain = lockValue(dice, 5);
			if (hasShip && hasCaptain && !hasCrew) hasCrew = lockValue(dice, 4);

             // Smart logic if cargo < 8 reroll
			if (hasShip && hasCaptain && hasCrew && rolls < 2 && sumCargo(dice) < 8) {
				dice[3] = 0;
				dice[4] = 0;
			} else if (hasShip && hasCaptain && hasCrew) {
				break;
			}
			rolls++;
		}

		if (hasShip && hasCaptain && hasCrew) {
			System.out.print("Computer final roll: ");
			printArray(dice);
			return sumCargo(dice);
		} else {
			System.out.println("\nComputer failed to get Ship, Captain, and Crew.");
			return 0;
		}
	}
//------------------------------------------------------------------------------HELPING METHOD-------------------------------------------------------------------------\\
     
    // roll
	public static int rollDie() {
		return (int)(Math.random() * 6) + 1;
	}

    // print dice
	public static void printArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i < arr.length - 1) System.out.print(", ");
		}
		System.out.println("]");
	}

    // lock value
	public static boolean lockValue(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == value) {
				arr[i] = -1;
				return true;
			}
		}
		return false;
	}

// total cargo
	public static int sumCargo(int[] arr) {
		int sum = 0;
		for (int val : arr) {
			if (val > 0) sum += val;
		}
		return sum;
	}
}

