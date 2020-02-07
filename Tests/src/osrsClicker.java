import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class osrsClicker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Ready to start? [Y/N]");
		String input = scan.nextLine().trim().toLowerCase();
		
		if (input.equals("y")) {
			System.out.println("Starting in 6 seconds!");	
			try {
				int countDown = 5;
				while (countDown > 0) {
				Thread.sleep(1000);
				System.out.println("Starting in " + (countDown) + " seconds! ");
				countDown--;
				}
				int count = 0;
				Robot bot = new Robot();
				
				while (true) {
					
					Random r = new Random();
					int random = r.nextInt(13-2) + 2;
					System.out.println(random);
					Thread.sleep(random * 1000);

				bot.keyPress(KeyEvent.VK_1);
				Thread.sleep((r.nextInt(3-2) + 2) * r.nextInt(255-220)+220);
				bot.keyRelease(KeyEvent.VK_1);
				
				Thread.sleep((r.nextInt(5-2) + 2) * r.nextInt(800-723)+723);

				bot.keyPress(KeyEvent.VK_2);
				Thread.sleep((r.nextInt(4-2) + 2) * r.nextInt(255-220)+220);
				bot.keyRelease(KeyEvent.VK_2);

				count++;
				System.out.println(count);
				}
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		} else if (input.equals("n")) {
			System.out.println("Okay, quitting!");
			System.exit(0);
		} else {
			System.out.println("It seems you didn't type y or n. Please try again.");
		}
		
		
	}

}
