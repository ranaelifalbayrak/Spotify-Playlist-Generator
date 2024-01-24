
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
// Rana Elif Albayrak 280201037
//Osman Çelik 280201053

public class Main<T> extends ArrayBag<T> {
	public static void main(String[] args) throws FileNotFoundException{
		
     // creating genres
	ArrayBag<String> Acoustic = new ArrayBag<String>();
	ArrayBag<String> Instrumental = new ArrayBag<String>();
	ArrayBag<String> Rock = new ArrayBag<String>();
	ArrayBag<String> Rap = new ArrayBag<String>();
	ArrayBag<String> Jazz = new ArrayBag<String>();
	ArrayBag<String> Pop = new ArrayBag<String>();
	
	//creating playlists
	ArrayBag<String> Sleeping = new ArrayBag<String>();
	ArrayBag<String> Workout = new ArrayBag<String>();
	ArrayBag<String> Dining = new ArrayBag<String>();
	ArrayBag<String> Meditation = new ArrayBag<String>();
	ArrayBag<String> RoadTrip = new ArrayBag<String>();
	
	Scanner user = new Scanner(System.in);
	System.out.println(" 1: Sleeping \n 2:Workout \n 3: Dining \n 4: Meditation \n 5: Road Trip \n Press 0 to quit.");
	System.out.println("Choose a type: ");
	String choice = user.next();
	
	File trackFile = new File("tracks.txt");  
	Scanner trackReader = new Scanner(trackFile);
	String delims =",";

	int acousticTime = 0;
	int instrumentalTime = 0;
	int rockTime = 0;
	int rapTime = 0;
	int jazzTime = 0;
	int popTime = 0;
	
	while(trackReader.hasNextLine()) {
		String tracks = trackReader.nextLine();
		String [] splitArray = tracks.split(delims);
		for(String s: splitArray) {
			int num = Integer.parseInt(s);

			//sorting the tracks by genre
			if(num == 1) {
				Acoustic.add(splitArray[1]);
				int time = Integer.parseInt(splitArray[2]);
				acousticTime += time;
				Dining.add(splitArray[1]);
				Meditation.add(splitArray[2]);
				RoadTrip.add(splitArray[1]);
			}
			if(num == 2) {
				Instrumental.add(splitArray[1]);
				int time = Integer.parseInt(splitArray[2]);
				instrumentalTime += time;
				Sleeping.add(splitArray[1]);
				Meditation.add(splitArray[2]);
			}
			if(num == 3) {
				Rock.add(splitArray[1]);
				int time = Integer.parseInt(splitArray[2]);
				rockTime += time;
				RoadTrip.add(splitArray[1]);
			}
			if(num == 4) {
				Rap.add(splitArray[1]);
				int time = Integer.parseInt(splitArray[2]);
				rapTime += time;
				Workout.add(splitArray[1]);
			}
			if(num == 5) {
				Jazz.add(splitArray[1]);
				int time = Integer.parseInt(splitArray[2]);
				jazzTime += time;
				Dining.add(splitArray[1]);
			}
			if(num == 6) {
				Pop.add(splitArray[1]);
				int time = Integer.parseInt(splitArray[2]);
				popTime += time;
				RoadTrip.add(splitArray[1]);
			}
			
			
		}
		
	
	}
	
	System.out.println("There are "+Acoustic.getCurrentSize()+" tracks in acoustic genre.Total duration of acoustic genre is "+acousticTime +" seconds.");
	System.out.println("There are "+Instrumental.getCurrentSize()+" tracks in instrumental genre.Total duration of instrumental genre is "+instrumentalTime+" seconds.");
	System.out.println("There are "+Rock.getCurrentSize()+" tracks in rock genre.Total duration of rock genre is "+rockTime+" seconds.");
	System.out.println("There are "+Rap.getCurrentSize()+" tracks in rap genre.Total duration of rap genre is "+rapTime+" seconds.");
	System.out.println("There are "+Jazz.getCurrentSize()+" tracks in jazz genre.Total duration of jazz genre is "+jazzTime+" seconds.");
	System.out.println("There are "+Pop.getCurrentSize()+" tracks in pop genre.Total duration of pop genre is "+popTime+" seconds");
	
	while(!(choice.equals("0"))) {
		if(choice.equals("1")) {
			System.out.println("There are "+Sleeping.getCurrentSize()+" tracks in sleeping playlist.");
		}
		if(choice.equals("2")) {
			System.out.println("There are "+Workout.getCurrentSize()+" tracks in workout playlist.");
		}
		if(choice.equals("3")) {
			System.out.println("There are "+Dining.getCurrentSize()+" tracks in dining playlist.");
		}
		if(choice.equals("4")) {
			System.out.println("There are "+Meditation.getCurrentSize()+" tracks in meditation playlist.");
		}
		if(choice.equals("5")) {
			System.out.println("There are "+RoadTrip.getCurrentSize()+" tracks in road trip playlist.");
		}
		System.out.println(" 1: Sleeping \n 2:Workout \n 3: Dining \n 4: Meditation \n 5: Road Trip \n Press 0 to quit.");
		System.out.println("Choose a type: ");
		choice = user.next();
		
		}

	}

		

	
	}




