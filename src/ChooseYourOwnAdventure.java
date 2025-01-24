/*
 * Written by Landon Rishe
 */
import java.util.Scanner;
public class ChooseYourOwnAdventure {

	public static void main(String[] args) {
		boolean pelt = false;
		boolean inv = false;
		int Gold = 10;
		boolean knight = false;
		boolean havemap = false;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("The sun rises in the vast and mystical world of Belias, calling you to adventure.\nYou awaken feeling well-rested in your temporary camp just off the main road. There is light snow on the ground, but the Spring thaw has just begun.\nYou are on the way to a nearby city, but you spot the tracks of a large animal near your camp. Do you try to hunt the animal, or proceed to the road?\nEnter \"hunt\" or \"road\".");
		int a = 0;
		while(a < 1) { //HUNT LOOP
			String hunt = keyboard.nextLine();
			if(hunt.equalsIgnoreCase("hunt")){
			System.out.println("You follow the tracks through the snow and come to a large clearing. A great bear emerges from some bushes ahead. It has ended its hibernation early.\nThe bear has not seen you yet. Will you use your bow to bring the bear down from a distance, or charge it with your sword?\nEnter \"bow\" or \"sword\".");
			String bear = keyboard.nextLine();
			if(bear.equalsIgnoreCase("bow")) {
				System.out.println("You carefully draw your bow, and load it with a single arrow from your quiver.\nAs you take aim, the great bear turns its head and looks directly at you. It lets out a great roar as you loose your single arrow.\nThe arrow hits the bear directly in its open maw, yet it still stands.\nIt charges towards you as you frantically draw three more arrows from your quiver, firing them at the bear in quick succession. All three land in the torso of the creature.\nThe great beast recoils, and finally falls, mere feet away from you.\nYou acquire the bear's pelt and make your way back towards the road. Enter \"c\" to continue.");
				pelt = true;
			}
			else if (bear.equalsIgnoreCase("sword")) {
				System.out.println("You draw your heavy sword from its scabbard. The sharp resonance of iron in motion catches the attention of the bear.\nImmediately threatened, the bear charges at you, simultaneously unleashing a ferocious roar. Taken aback, you courageously rush the bear as well.\nAs the two of you meet, the bear pounces on you and begins clawing. You hopelessly try to escape from under the massive animal, but to no avail. The bear rips you to pieces. You are dead.\nGAME OVER.");
				System.exit(0); //END STATE 1
			}
			else{
				System.out.println("That is not a valid answer. Please enter \"bow\" or \"sword\".");
				System.exit(0);
			}
			String continuebear = keyboard.nextLine();
			if(continuebear.equalsIgnoreCase("c")) {
				a++;
			}
			}
			else if(hunt.equalsIgnoreCase("road")) {
				System.out.println("You decide not to follow the tracks, and instead return to the road. You travel towards the nearby city of Krolbanner. Enter \"c\" to continue.");
				String continueroad = keyboard.nextLine();
				if(continueroad.equalsIgnoreCase("c")) {
				a++;
				}
			}
				else
				{
					System.out.println("That is not a valid answer. Please enter \"hunt\" or \"road\".");
					System.exit(0);
				}
			} //END OF HUNT LOOP
		
		
		System.out.println("Hours later, as the sun starts to set, you approach the city of Krolbanner. A host of guards stands watch outside the city gates. The tallest among them, who appears to be their leader, approaches you.\n\"Oi traveler, I don't know where you come from, but you've gotta pay the visitor's tax to get in to our beautiful city. Just 5 gold is what you gotta pay.\"\nAs the lead guard says the words \"visitor's tax\", his fellow guards seem to chuckle to themselves.\nYou have exactly 10 gold. Do you pay the tax, refuse to pay the tax and intimidate the guards, or attack the guards?\nEnter \"pay\", \"intimidate\", or \"attack\".");
		int b = 0;
		int tax = 5;
		while(b < 1) { //GUARD LOOP
			String guard = keyboard.nextLine();
			if(guard.equalsIgnoreCase("pay")) {
				Gold -= tax;
				System.out.println("The guard looks pleasantly surprised and pipes up: \"Aye. Thank you very much. The city of Krolbanner is open to you. There's good ale and warm beds in the tavern. Don't be causin' any trouble now, or we'll have to get involved.\"\nEnter \"c\" to continue.");
			}
			else if(guard.equalsIgnoreCase("intimidate")) {
				System.out.println("You take a single menacing step toward the lead guard and make direct eye contact.\n\"This is obviously a shakedown.\" You say threateningly. \"Trust me, I'm not the one you want to be targetting with your schemes. I won't be a part of your extortion.\"\nThe guard becomes visibly nervous as his fellow guards slowly back away from him.\n\"All right, all right, keep yer voice down. No need to make a big deal out of it. We could of course arrange a one-time exemption from the visitor's tax.\nWe'll open the gates for you, no charge. Just don't go around causin' no trouble now.\"\nEnter \"c\" to continue");
			}
			else if(guard.equalsIgnoreCase("attack")) {
				System.out.println("You rashly draw your sword and swing at the lead guard. He instinctively dodges as his men draw their various weapons.\nYou failed to count how many guards there were, but there are certainly more than you first thought. Dozens of armed men and women now surround you.\nAs the guards attack, you defend yourself well, but are hopelessly outnumbered. You are eventually disarmed and tackled to the ground.\nYou are shackled and brought to a dank dungeon to await judgement by the Lord of Krolbanner.\nGAME OVER.");
				System.exit(0); //END STATE 2
				}
			else {
				System.out.println("That is not a valid answer. Please enter \"pay\", \"intimidate\" or \"attack\".");
				System.exit(0);
			}
			String continueguard = keyboard.nextLine();
			if(continueguard.equalsIgnoreCase("c")) {
				b++;
			}	
		} //END OF GUARD LOOP	
		System.out.println("You enter the city of Krolbanner. It is not a pretty sight. Recent rain has left the dirt roads muddy, and shoddily-constructed, weather-beaten buildings appear to be the only real sights.\nYou see the sign for a tavern and a sign for a shop. Which one would you like to go to?\nEnter \"tavern\" or \"shop\".");
		int c = 0;
		while(c < 1) { //TOWN LOOP
		String town = keyboard.nextLine();
		if(town.equalsIgnoreCase("tavern")) {
			System.out.println("You enter the dimly lit tavern. The sounds of merriment and companionship are a welcome greeting. Though it is only dusk, there are already several patrons.\nMost of the patrons seem to be enjoying each other's company, though a lone knight sits at a table in the corner of the tavern.\nThe barkeep calls out to you, welcoming you in and asking what you'd like to drink. Would you like to buy a drink, or ask the bartender about any local rumors?\nEnter \"drink\" or \"rumor\".");
			String tavern = keyboard.nextLine();
			if(tavern.equalsIgnoreCase("rumor")) {
				System.out.println("\"What's the word around town?\" You ask the barkeep as you take a seat at the counter.\n\"You must be one o' them adventuring types eh? I should have realized when you walked in. Well everyone's been talkin' about the dragon that's woken up at ol' Krolstone Mountain.\nThey say the dragon sleeps atop a mountain of treasure, if you believe such nonsense. A bunch of foolish young lads have gone up there in search of fortune, and only a single one's returned, and he's gone totally mad mind you.\nIf you ask me, it's all a bunch of hooey. There ain't no dragon up there, but there's no doubt something evil in that mountain. And we'd all do well to stay away from it\".\nEnter \"c\" to continue.");
			String continuetavern = keyboard.nextLine();
			if(continuetavern.equalsIgnoreCase("c")) {
				System.out.println("\"I think I'd be interested in checking out this mountain. What else can you tell me?\" You ask.\n\"Aye. I knew it. You have that look about you. I don't know much meself, but the one chap that came back from the mountain came to the tavern one day. He gave me this map he drew of the mountain passages before he fled the town, quick as he came.\nIf you're interested, I'd be happy to give you the map for 5 gold.\nDo you buy the map for 5 gold?\nEnter \"yes\" or \"no\".");
				String map = keyboard.nextLine();
			int d = 0;
			while(d < 1) { //BARKEEP LOOP
				int mapcost = 5;
				if(map.equalsIgnoreCase("yes")) {
					if(Gold < mapcost) {
						System.out.println("You fumble around in your pockets and come up with nothing.\n\"I'm sorry. I can't pay for that.\" You say.\n\"Well. That's a shame. All the same, I wish you luck.\" The barkeep responds.");
						d++;
					}
					if(Gold >= mapcost) {
						System.out.println("\"Excellent!\" I have no use for this map anyhow. Here you go. I hope it can aid you in your quest. Fare thee well!\"\nAdventurer's map acquired. Enter \"c\" to continue.");
						havemap = true;
						Gold -= mapcost;
						String continuepurchasemap = keyboard.nextLine();
						if(continuepurchasemap.equalsIgnoreCase("c")) {
							d++;
						}
					}
			}
				else if(map.equalsIgnoreCase("no")) {
					System.out.println("\"Ah! A shame. I was hoping another might get some use out of it, but it is probably just junk. Perhaps I'll just toss it. I wish you luck all the same.\"");
					d++;
				}
				else {
					System.out.println("That is not a valid answer. Please enter \"yes\" or \"no\".");
					System.exit(0);
				}
			} //END OF BARKEEP LOOP	
			System.out.println("As you leave the counter, a hulking figure stands in your path. You recognize the lone knight from the corner of the tavern.\n\"Greetings, traveler. Forgive my interruption. I am Ser Gottfried, and I couldn't help but overhear that you seek the dragon under Krolstone Mountain. Is this true?\"\nEnter \"yes\" or \"no\".");
			String knighttruth = keyboard.nextLine();
			int e = 0;
			while(e < 1) { //KNIGHT LOOP
				if(knighttruth.equalsIgnoreCase("no")) {
					knight = false;
					System.out.println("\"Ah! Forgive me. I have the ears of an old man. Have a pleasant evening.\"\nSer Gottfried walks away.\nEnter \"c\" to continue.");
					String continueknight3 = keyboard.nextLine();
					if(continueknight3.equalsIgnoreCase("c")) {
						c++;
						e++;
					}
				}
					else if(knighttruth.equalsIgnoreCase("yes")) {
					System.out.println("\"Ah! Glorious! Fate smiles upon me. I have been trying to convince the leader of my order to send an excursion to acquire the fortune at Kolstone Mountain, but he has rejected my pleas, claiming it is too dangerous.\nI am still committed, and I would be honored to join you on this quest, if you would have me. My arm is strong and my faith stronger.\"\nWill you let Ser Gottfried join you on your journey?\nEnter \"yes\" or \"no\".");
					String knightcome = keyboard.nextLine();
					if(knightcome.equalsIgnoreCase("yes")) {
						System.out.println("\"Excellent! My sword is yours. let us make for the mountain.\"\nSer Gottfried has joined you.\n\"Enter \"c\" to continue.");
						String continueknight = keyboard.nextLine();
						knight = true;
						if(continueknight.equalsIgnoreCase("c")){
							c++;
							e++;
						}
					}
					else if(knightcome.equalsIgnoreCase("no")){
						knight = false;
						System.out.println("\"A disappointment to be sure. No doubt you could use my skills. So be it. I wish you well in your travels, friend.\"\nSer Gottfriend does not join you.\nEnter \"c\" to continue.");
						String continueknight2 = keyboard.nextLine();
						if(continueknight2.equalsIgnoreCase("c")) {
							c++;
							e++;
						}
					}
					else {
						System.out.println("That is not a valid answer. Please enter \"yes\" or \"no\".");
						System.exit(0);
					}
				}
					else {
						System.out.println("That is not a valid answer. Please enter \"yes\" or \"no\".");
						System.exit(0);
					}
			} //END OF KNIGHT LOOP
			}
			}
			else if(tavern.equalsIgnoreCase("drink")) {
				System.out.println("You order a drink. As you take your first sip, the first thing you think is that this is a very strong brew. You finish your first and order another, enjoying the energy of the tavern and losing track of time.\nThe next morning, you wake up in a small jail cell with a guard explaining to you that stealing a carriage and driving it into a farm house is frowned upon.\nYou settle into your cell, trying to remember the previous night.\nGAME OVER.");
				System.exit(0); //END STATE 3
			}
			else {
				System.out.println("That is not a valid answer. Please enter \"rumor\" or \"drink\".");
				System.exit(0);
			}
			}
		else if(town.equalsIgnoreCase("shop") && pelt == false) {
			System.out.println("You make your way towards the small shop. The wooden door creaks as you push it open. A fat bearded man stands behind the counter reading a thick book. As you walk in, he looks right up at you.\n\"Aye, a customer! Welcome to Tobias' Trinkets! By the looks of you, you don't look like you're no ordinary townsfolk. I'd wager you might be looking for some more \"selective\" stock.\nThe man reaches below the counter and pulls out a large potion.\n\"There! It'll make you vanish from sight! Guaranteed! Bought it off some weird fellow yesterday. You look like just the person who'd be needin' this in their travels. Whaddya say?\"\nDo you buy the invisiblity potion(5 gold) or no?\nEnter \"invis\" or \"no\".");
			String invis1 = keyboard.nextLine();
			if(invis1.equalsIgnoreCase("invis")) {
				inv = true;
				Gold -=5;
				System.out.println("\"Fantastic! here you go. A pleasure doing business with you, and may you have good fortune on your travels.\".\nYou have acquired an invisiblity potion.\nEnter \"c\" to continue.");
				String continueinvis1 = keyboard.nextLine();
				if(continueinvis1.equalsIgnoreCase("c")) {
					c++;
				}
			}
			else if(invis1.equalsIgnoreCase("no")) {
				System.out.println("I understand. Good travels to you then. I'm afraid there isn't much else in my shop that would be of interest to you.\nEnter \"c\" to continue.");
				String continueinvis2 = keyboard.nextLine();
				if(continueinvis2.equalsIgnoreCase("c")) {
					c++;
		}
			}
			else {
				System.out.println("That is not a valid answer. Please enter \"invis\" or \"no\".");
				System.exit(0);
			}
		}
		else if(town.equalsIgnoreCase("shop") && pelt == true) {
			System.out.println("You make your way towards the small shop. The wooden door creaks as you push it open. A fat bearded man stands behind the counter reading a thick book. As you walk in, his eyes are drawn to the bear pelt you have draped across your shoulders and back.\n\"Aye, that pelt there's a beauty\". He reaches down underneath the counter and produces a single large potion.\n\"I'll tell you what. Some weird chap came through here yesterday and I bought this invisibility potion off him. I'll trade you this potion for that pelt. Deal?\nEnter \"deal\" or \"no\".");
			String invis2 = keyboard.nextLine();
			if(invis2.equalsIgnoreCase("deal")) {
				inv = true;
				System.out.println("\"Fantastic! here you go. A pleasure doing business with you, and may you have good fortune on your travels.\".\nYou have acquired an invisiblity potion.\nEnter \"c\" to continue.");
				String continueinvis3 = keyboard.nextLine();
				if(continueinvis3.equalsIgnoreCase("c")) {
					c++;
				}
			}
			else if(invis2.equalsIgnoreCase("no")) {
				System.out.println("I understand. Good travels to you then. I'm afraid there isn't much else in my shop that would be of interest to you.\nEnter \"c\" to continue.");
				String continueinvis4 = keyboard.nextLine();
				if(continueinvis4.equalsIgnoreCase("c")) {
					c++;
				}
			}
			else {
				System.out.println("That is not a valid answer. Please enter \"deal\" or \"no\".");
				System.exit(0);
			}
		}
		else {
			System.out.println("That is not a valid answer. Please enter \"tavern\" or \"shop\".");
		}
		} //END OF TOWN LOOP
		System.out.println("You return to the center of town and immediately set out on your journey to Krolstone Mountain.\nAfter traveling for hours, you are ambushed by bandits on the road.\n\"All right! Hand over everything ya got or taste steel!\" One of them shouts.\nDo you attempt to bribe the bandits(5 gold), intimidate them, or fight?\nEnter \"bribe\", \"intimidate\", or \"fight\".");
		String bandit = keyboard.nextLine();
		int f = 0;
		while(f < 1 ) { //BANDIT LOOP
			if(bandit.equalsIgnoreCase("bribe") && Gold >= 5) {
				Gold -= 5;
				System.out.println("You quickly produce some glimmering gold coins and toss them to the bandits.\n\"Take this gold and let us pass. I do not wish to fight you.\" You say.\nThe bandits happily oblige. You are free to pass.\nEnter \"c\" to continue.");
				String continuebandit1 = keyboard.nextLine();
				if(continuebandit1.equalsIgnoreCase("c")) {
					f++;
				}
			}
			else if(bandit.equalsIgnoreCase("bribe") && Gold < 5) {
				if(knight == false) {
					System.out.println("You fumble around in your pockets and come up empty-handed.\nOffended by your lack of gold, the bandits rush you and knock you out before you have time to react. They make off with all of your equipment and possessions. You now have no chance of completing your quest.\nGAME OVER.");
					System.exit(0); //END STATE 4
				}
				else if(knight == true) {
					System.out.println("You fumble around in your pockets and come up empty-handed.\nOffended by your lack of gold, the bandits rush you and attempt to catch you off guard.\nSer Gottfried dashes in front of you and blocks an axe blow meant for your head. The two of you together make quick work of the bandits.\n\"Enter \"c\" to continue.");
					String continuebribe = keyboard.nextLine();
					if(continuebribe.equalsIgnoreCase("c")) {
						f++;
					}
				}
			}
			else if(bandit.equalsIgnoreCase("intimidate")) {
				if(knight == false) {
					System.out.println("You stand taller and assure the bandits that they are messing with the wrong person.\nThey do not seem convinced, or even frightened in the least bit. The bandits rush you and knock you out before you have tinme to react.\nThey make off with all of your equipment and possessions. You now have no chance of completing your quest.\nGAME OVER.");
					System.exit(0); //END STATE 5
				}
				else if(knight == true) {
					System.out.println("You stand taller and assure the bandits that they are messing with the wrong person.\nThey do not seem convinced, or even frightened in the least bit. The bandits rush you and attempt to catch you off guard.\nSer Gottfried dashes in front of you and blocks an axe blow meant for your head. The two of you together make quick work of the bandits. The path is clear.\nEnter \"c\" to continue.");
					String continueintim = keyboard.nextLine();
					if(continueintim.equalsIgnoreCase("c")) {
						f++;
					}
				}
			}
			else if(bandit.equalsIgnoreCase("fight")) {
				if(knight == false) {
					System.out.println("You hastily draw your sword and charge the bandits, taking two out immediately.\nThe remaining bandits try to break your guard, but eventually become frightened and flee one by one. The path is clear.\nEnter \"c\" to continue.");
					String continuefight1 = keyboard.nextLine();
					if (continuefight1.equalsIgnoreCase("c")) {
						f++;
					}
				}
				else if(knight == true) {
					System.out.println("Both you and Ser Gottfried draw your swords and take up defensive stances. One by one, the bandits charge and are countered by the two of you.\nAfter a few minutes, the remaining few bandits begin to flee. The path is clear.\nEnter \"c\" to continue.");
					String continuefight2 = keyboard.nextLine();
					if(continuefight2.equalsIgnoreCase("c")) {
						f++;
					}
				}
			}
			else {
				System.out.println("That is not a valid answer. Please enter \"bribe\", \"intimidate\" or \"fight\".");
				System.exit(0);
			}
		} //END OF BANDIT LOOP
		System.out.println("You arrive at Krolstone Mountain. Its high peak sits alone in the clouds.\nThere is a clear natural entrance at the foot of the mountain. The trail into the passages looks as though it has been used many times before.\nYou follow the trail into the tunnels.\n\"Enter \"c\" to continue.");
		String continuemountain = keyboard.nextLine();
		if(continuemountain.equalsIgnoreCase("c")) {
			
		}
		int g = 0;
		while(g < 1) { //CROSSROADS LOOP
			if (havemap == true) {
				System.out.println("After a few minutes of walking through the tunnels, you come to a crossroads. You decide to check the map you acquired from the barkeep earlier.\nThe author of the map has drawn a skull and crossbones on the right-side passageway, and has drawn nothing on the left passageway.\nWhich way do you go?\nEnter \"right\" or \"left\".");
				String crossroads1 = keyboard.nextLine();
				if(crossroads1.equalsIgnoreCase("right") && knight == true) {
				System.out.println("Ignoring the map's warning, you decide to take the passage on the right.\nYou should have listened to the map. Seconds after you enter the passage, Ser Gottfried yells: \"CAVE IN!\"\nYou manage to escape the falling rocks, but Ser Gottfried is not so lucky. He is lost in the mess of boulders.\nEnter \"c\" to continue.");
				String continuecrossroads1 = keyboard.nextLine();
				if(continuecrossroads1.equalsIgnoreCase("c")) {
					g++;
				}
				}
				else if(crossroads1.equalsIgnoreCase("right") && knight == false) {
					System.out.println("Ignoring the map's warning, you decide to take the passage on the right.\nYou should have listened to the map. Seconds after you enter the passage, the sound of rumbling stone fills your ears. The ceiling collapses right above you and you are unable to make it out in time.\nGAME OVER.");
					System.exit(0); //END STATE 6
				}
				else if(crossroads1.equalsIgnoreCase("left")) {
					System.out.println("You decide to follow the map's warning and take the left passage. Thankfully, nothing threatens you on this path.\nWhat awaited on the other path is left only to your imagination. You are safe for now.\n\"Enter \"c\" to continue.");
					String continuecrossroads2 = keyboard.nextLine();
					if(continuecrossroads2.equalsIgnoreCase("c")) {
						g++;
					}
				}
				else {
					System.out.println("That is not a valid answer. Please enter \"right\" or \"left\".");
					System.exit(0);
				}
			}
			if (havemap == false && knight == true) {
				System.out.println("After a few minutes of walking through the tunnels, you come to a crossroads. You do not know whether to go left or right.\nWhich path do you take?\nEnter \"left\" or \"right\"");
				String crossroads2 = keyboard.nextLine();
				if(crossroads2.equalsIgnoreCase("right")) {
					System.out.println("You decide to take the right passageway. For a few seconds, all seems calm.\nThen, the sound of rumbling stone fills your ears. Ser Gottfried yells: \"CAVE IN!\"\nYou manage to escape the falling rocks, but Ser Gottfried is not so lucky. He is lost in the mess of boulders.\nEnter \"c\" to continue.");
					String continuecrossroads3 = keyboard.nextLine();
					if(continuecrossroads3.equalsIgnoreCase("c")) {
						g++;
					}
				}
				else if(crossroads2.equalsIgnoreCase("right") && knight == false) {
					System.out.println("You decide to take the right passageway. For a few seconds, all seems calm.\nThen, the sound of rumbling stone fills your ears. The ceiling collapses right above you and you are unable to make it out in time.\nGAME OVER.");
					System.exit(0); //END STATE 7
				}
				else if(crossroads2.equalsIgnoreCase("left")) {
					System.out.println("You decide to take the left path. Thankfully, nothing threatens you on this path.\nWhat awaited on the other path is left only to your imagination. You are safe for now.\nEnter \"c\" to continue.");
					String continuecrossroads4 = keyboard.nextLine();
					if(continuecrossroads4.equalsIgnoreCase("c")) {
						g++;
					}
				}
				else {
					System.out.println("That is not a valid answer. Please enter \"right\" or \"left\".");
					System.exit(0);
				}
			}
			else if (havemap == false && knight == false) {
				System.out.println("After a few minutes of walking through the tunnels, you come to a crossroads. You do not know whether to go left or right.\nWhich path do you take?\nEnter \"left\" or \"right\"");
				String crossroads3 = keyboard.nextLine();
				if(crossroads3.equalsIgnoreCase("left")) {
					System.out.println("You decide to take the left path. Thankfully, nothing threatens you on this path.\nWhat awaited on the other path is left only to your imagination. You are safe for now.\nEnter \"c\" to continue.");
					String continuecrossroads5 = keyboard.nextLine();
					if(continuecrossroads5.equalsIgnoreCase("c")) {
						g++;
				}

					}
				else if(crossroads3.equalsIgnoreCase("right")) {
					System.out.println("You decide to take the right passageway. For a few seconds, all seems calm.\nThen, the sound of rumbling stone fills your ears. The ceiling collapses right above you and you are unable to make it out in time.\nGAME OVER.");
					System.exit(0); //END STATE 8
				}
			} 
		}//END OF CROSSROADS LOOP
		System.out.println("After a while, you come to a large, naturally hollowed-out chamber. Thin holes in the dense stone bring in an ounce of natural light.\nAs you move in to the chamber, your vision is drawn to a massive, majestic beast lying down in the center:\nThe dragon. As big as a city block, lies atop a mountain of gold, its scaled skin adorning a more sizable fortune than most men will ever see.\nThe beast is fast asleep. Do you want to attempt to sneak past the dragon and carry out as much treasure as possible, or wake the dragon and fight it?\nEnter \"sneak\" or \"fight\"");
		String dragon = keyboard.nextLine();
		if(dragon.equalsIgnoreCase("sneak") && inv == true) {
			System.out.println("You use your invisiblity potion and quietly sneak up on the dragon.\nAs you get close, the dragon stirs, but returns to sleep immediately. You carry as much treasure as you can and escape successfully.\nYOU WIN!");
			System.exit(0); //END STATE 9
		}
		else if(dragon.equalsIgnoreCase("sneak") && inv == false) {
			System.out.println("You quietly make your way towards the dragon. As you get close, it begins to stir.\nThe dragon looks right at you as it begins to wake up. Alarmed, it immediately lets out a ball of flame and roasts you alive.\nGAME OVER.");
			System.exit(0); //END STATE 10
		}
		else if(dragon.equalsIgnoreCase("fight")) {
			System.out.println("You decide to fight the dragon and take all of the treasure.\nDo you want to use your bow to shoot the dragon from a distance, use your sword to hit the dragon's legs, or charge the dragon and attempt to attack from its back?\nEnter \"bow\", \"legs\", or \"back\".");
			String dragonfight = keyboard.nextLine();
			if(dragonfight.equalsIgnoreCase("bow")) {
				System.out.println("You use your bow to fire a single arrow directly into the dragon's forehead. It wakes, furious.\nYou fire off several more arrows into its torso, carefully dodging its advances.\nAfter a while the dragon falls, and you secure the treasure.\nYOU WIN!");
				System.exit(0); //END STATE 11
			}
			else if(dragonfight.equalsIgnoreCase("legs")) {
				System.out.println("You draw your sword and make your way up to the dragon. As the beast stirs, you begin hacking at its legs.\nGreatly weakened and slowed, the dragon begins frantically breathing fire upwards in the chamber.\nAfter a few more strong hits, you plunge your sword into the dragon's chest, and it collapses. The treasure is yours.\nYOU WIN!");
				System.exit(0); //END STATE 12
			}
			else if(dragonfight.equalsIgnoreCase("back") && knight == false) {
				System.out.println("You decide to charge directly at the dragon and attempt to leap on its back before it wakes up.\nUnfortunately, the beast hears your heavy footsteps growing closer, and roasts you alive before you have a chance to leap on to its back.\nGAME OVER.");
				System.exit(0); //END STATE 13
			}
			else if(dragonfight.equalsIgnoreCase("back") && knight == true) {
				System.out.println("You decided to charge directly at the dragon and attempt to leap on its back before it wakes up.\nAs you run towards the dragon, it begins to wake up to the sound of your heavy footsteps.\nFortunately, Ser Gottfried rushes in and distracts the dragon, giving you time to leap on to the dragon's back.\nSer Gottfried hacks at the dragon's torso while it angrily spits fire into the air. You finally plunge your sword into its back, and the great beast falls. The treasure is yours.\nYOU WIN.");
				System.exit(0); //END STATE 14
			}
			else {
				System.out.println("That is not a valid answer. Please enter \"bow\", \"legs\", or \"back\".");
				System.exit(0);
			}
		}
		else {
			System.out.println("That is not a valid answer. Please enter \"sneak\" or \"fight\".");
			System.exit(0);
		}
	}
}
