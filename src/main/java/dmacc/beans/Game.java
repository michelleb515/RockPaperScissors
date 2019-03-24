package dmacc.beans;

import java.util.Random; 

public class Game {
	private String player1;
	private String computerPlayer;
	private String winner;

	public Game() {
		super();
	}

	public Game(String player1) {
		super();
		this.player1 = player1;
		this.setComputerPlayer();
		this.determineWinner();
	}

	public String getPlayer1() {
		return player1;
	}

	public void setPlayer1(String player1) {
		this.player1 = player1;
	}

	public String getComputerPlayer() {
		return computerPlayer;
	}
	
	public void setComputerPlayer(String computerPlayer) {
		this.computerPlayer = computerPlayer;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Game [player1=" + player1 + ", computerPlayer=" + computerPlayer + ", winner=" + winner + "]";
	}

	public void setComputerPlayer() {
		Random num = new Random(); 
		int answer = num.nextInt(5) + 1; 
		String player; 
		if (answer == 1) { 
			player = "rock"; 
		} else if (answer == 2) {
			player = "paper";
		} else if (answer == 3 ){
			player = "scissors"; 
		} else if (answer == 4) {
			player = "lizard"; 
		} else {
			player = "spock"; 
		}
		this.setComputerPlayer(player); 
	}
	
	public void determineWinner( ) {
		String result = ""; 
		if (player1.equals(computerPlayer)) {
			result = "It's a tie";
		} else if (player1.equals("rock")) {
			if (computerPlayer.equals("scissors") || computerPlayer.equals("lizard") ) {
				result = "Player 1 wins";
				}
			else if (computerPlayer.equals("paper")  || computerPlayer.equals("spock") ) {
				result = "Computer wins" ; 
				}				
			else {
				result = "Please enter valid values.";
			}
			}
		else if (player1.equals("paper") ) {
			if (computerPlayer.equals("rock")  || computerPlayer.equals("spock") ) {
				result = "Player 1 wins"; 
				}
			else if (computerPlayer.equals("lizard")  || computerPlayer.equals("scissors") ) {
				result = "Computer wins"; 
				}
			else {
				result = "Please enter valid values.";
			}
			}
		else if (player1.equals("scissors") ) {
			if (computerPlayer.equals("paper")  || computerPlayer.equals("lizard") ) {
				result = "Player 1 wins"; 
				}
			else if (computerPlayer.equals("rock")  || computerPlayer.equals("spock") ) {
				result = "Computer wins";					
				}
			else {
				result = "Please enter valid values.";
			}
			}
		else if (player1.equals("lizard") ) {
			if (computerPlayer.equals("paper")  || computerPlayer.equals("spock") ) {
				result = "Player 1 wins"; 
				}
			else if (computerPlayer.equals("rock")  || computerPlayer.equals("scissors") ) {
				result = "Computer wins"; 
				}
			else {
				result = "Please enter valid values.";
			}
		}
		else if (player1.equals("spock") ) {
			if (computerPlayer.equals("rock") || computerPlayer.equals("scissors") ) {
				result = "Player 1 wins"; 
				}
			else if (computerPlayer.equals("paper") || computerPlayer.equals("lizard") ) {
				result = "Computer wins"; 
				}
			else {
				result = "Please enter valid values.";
			}
			}
		else {
			result = "Please enter valid values.";
		}
		
		this.setWinner(result);
	}
	
}