package m05_uf1_ac01;

import java.util.Scanner;

public class ej_01 {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ej_01 ejerciciopiedra = new ej_01();
		ejerciciopiedra.init();
		ejerciciopiedra.menu();
		byte player1 = ejerciciopiedra.selectoption();
		byte player2 = ejerciciopiedra.getRPSLS();
		ejerciciopiedra.getText(player1);
		ejerciciopiedra.getText(player2);
        ejerciciopiedra.winner(player1, player2);
       
	}

	private void init() {
		System.out.println("**********************************************************************\r\n"
				+ "* ROCK PAPER SCISSORS LIZARD SPOCK                    © Kevin Nahuel  *\r\n"
				+ "*                                                                    *\r\n"
				+ "* An extension of the children's game of rock paper scissors,        *\r\n"
				+ "* with two additional handshapes: lizard and Spock.                  *\r\n"
				+ "* Rules: Scissors cuts paper                                         *\r\n"
				+ "*        Paper covers rock                                           *\r\n"
				+ "*        Rock crushes lizard                                         *\r\n"
				+ "*        Lizard poisons Spock                                        *\r\n"
				+ "*        Spock smashes scissors                                      *\r\n"
				+ "*        Scissors decapitates lizard                                 *\r\n"
				+ "*        Lizard eats paper                                           *\r\n"
				+ "*        Paper disproves Spock                                       *\r\n"
				+ "*        Spock vaporizes rock                                        *\r\n"
				+ "*        and as it always has, rock crushes scissors.                *");
	}

	private void menu() {
		System.out.println("1: ROCK    2:PAPER    3:SCISSORS    4:LIZARD    5:SPOCK");
	}

	private byte selectoption() {
		System.out.println("CHOOSE YOUR OPTION: ");
		return sc.nextByte();
	}

	public byte getRPSLS() {
		return (byte) (Math.random() * 1 + 5);
	}

	public String getText(byte option) {
		switch (option) {
		case 1:
			return "ROCK";
		case 2:
			return "PAPER";
		case 3:
			return "SCISSORS";
		case 4:
			return "LIZARD";
		case 5:
			return "SPOCK";
		default:
			return "ERROR";
		}
	}

	public String winner(byte player1, byte player2) {
		if (player1 == player2) {
			return "draw";
		}
		switch (player1) {
		case 1: // Rock
			if (player2 == 3 || player2 == 4) {
				return "player1";
			} else {
				return "player2";
			}
		case 2: // Paper
			// (player2==1 || player2==4) ? "player1" : "player2";
			if (player2 == 1 || player2 == 5) {
				return "player1";
			} else {
				return "player2";
			}
		case 3: // Scissors
			if (player2 == 4 || player2 == 3) {
				return "player1";
			} else {
				return "player2";
			}
		case 4: // Lizard
			if (player2 == 2 || player2 == 5) {
				return "player1";
			} else {
				return "player2";
			}
		case 5: // Spock
			if (player2 == 1 || player2 == 3) {
				return "player1";
			} else {
				return "player2";
			}
		}
		return null;
	}
	
}
