/*
Scavenger hunt
File Name: Scavenger Hunt assignment
Author: Murf
Date: 13/05/2025
Description: It a game for user to travel through Hogwarts and magical world such as Hogwarts wizardry school,Hagrid's hut,Shrieking Hut or even Forbidden Forest. User will need to find items to be able to go to some places. the objective for the user to find magical creatures including Mandrake, Sindet, Unicorn and Scabber.+

*/


public class MyProgram
{

  //objective
  static int creatures = 0; //mandrake, snidget, unicord, scabber
  //items
  static int maurauderMap = 0;
  static int Bloom = 0;
  static int InvisibleC = 0;
  static int wand  = 0;

  
 
  
    public static void main(String[] args) {
        System.out.println("Fantastic beast and where to find them\n");

      //start
       WizardingWorld();
    }
      //procedures for WW
	public static void WizardingWorld()
	{
		System.out.println("You have arrived Wizarding world");
        System.out.println("Hagrid: Welcome to Hogwarts witches and wizards");
        System.out.println("Hagrid: You will have to find magical creatures including Unicorn, Mandrake, Snidget");
          HogsmeadeTs();
	}
        //procedures for HMTS
	public static void HogsmeadeTs()
	{
        System.out.println("-----------------------------------------------");
	    System.out.println("\nYou have arrived the Hogsmeade Train Station");
        System.out.println("Hagrid gave you a magic creatures list.It says...");
        System.out.println("Oh almost forgot. Go get your wand at Olivander wand shop at Hogsmeade Village");
        System.out.println("The creatures you will be finding is\nUnicorn, it's a glowing horse with horn.\nMandrake is a magical and sentient plant which had a root that looked like a human.\nThe Golden Snidget was a small golden magical bird with fully rotational wings, the snidget is known as the fastest animal in the world. And the last oneScabber, It's just a fat rat.");
        System.out.println("\nYou must come meet Professor McGonagall at Hogwarts when you find all the creatures");
        System.out.println("Hagrid : Oh friendly reminder dont get close to the Whomping Willow if you don't want to die");

        System.out.println("\n-----------------------------------------------");
      

        //user choice
        System.out.println("\nWhere would you like to go");
        System.out.println("(a) GreatLake");
        System.out.println("(b) Hogsmeade");
        System.out.println("(c) Hagrid's Hut");

      //invalid input
        String choice;
      do{
       System.out.println("\nYour choice?");
        choice = In.getString().toLowerCase();

        if(!choice.equals("a") && !choice.equals("b") && !choice.equals("c"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c'.");
        }
        }while(!choice.equals("a") && !choice.equals("b") && !choice.equals("c"));
      //choices for users
      if(choice.equals("a"))
      {
        GreatLake();
      }
      if(choice.equals("b"))
      {
        Hogsmeade();
      }
      if(choice.equals("c"))
      {
        HagridH();
      }
	}
    //procedures for Gl
	public static void GreatLake()
	{ //facts
       System.out.println("\nYou arrived The GreatLake of Hogwarts, where the Giant Kraken hibernates");
       System.out.println("Looks like you do not have boat to go across the lake");
       System.out.println("You return to the Hogsmeade Train Station");
       HogsmeadeTs();  
	}
    //procedures for HH
	public static void HagridH()
	{//hints
	   System.out.println("\nYou Found Hagrid's Hut");
       System.out.println("You countinue to go ask Hagrid for a hint");
       System.out.println("Hagrid : you want a Hint!! Well the snidged is best known for early use in the wizarding game of Quidditch."); 

        //user choice
        System.out.println("\nWhere would you like to go");
        System.out.println("(a) Hogwarts");
         System.out.println("(b) WhompingWillow");
        System.out.println("(c) Go back to Hogsmeade train station");
         System.out.println("(d) Go back to Hagrid's Hut");
         String choice1;
      //invalid input
      do{
       System.out.println("\nYour choice?");
        choice1 = In.getString().toLowerCase();

        if(!choice1.equals("a") && !choice1.equals("b") && !choice1.equals("c") && !choice1.equals("d"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c','d'.");
        }
        }while(!choice1.equals("a") && !choice1.equals("b") && !choice1.equals("c") && !choice1.equals("d"));
      if(choice1.equals("a"))
      {
        Hogwarts();
      }
      else if(choice1.equals("c"))
      {
       HogsmeadeTs();
      }
       else if(choice1.equals("d"))
      {
       HagridH();
      }
       else if(choice1.equals("b"))
      {
       WhompingWillow();
      }
       
	}
	public static void Hogsmeade()
	{//if user pick this procedure wand++. user can now go to FBF
		 System.out.println("\nYou arrived Hogsmeade a wizarding village");
         System.out.println("You found Honeydukes sweetshop, Ollivanders wand shop, and the Three Broomsticks pub");
         System.out.println("You walk to Ollivanders wand shop to get a wand");
         wand ++;
         System.out.println("You acquired a Wand!");
         System.out.println("Olliwanders :You want a Hint! Well,the Unicorn, perhaps it too deep to be found");

        //user choice
        System.out.println("\nWhere would you like to go");
        System.out.println("(a) Shrieking Hut");
        System.out.println("(b) Go back to Hogsmead Train Station");
      String choice2;
 do{
       System.out.println("\nYour choice?");
        choice2 = In.getString().toLowerCase();

        if(!choice2.equals("a") && !choice2.equals("b"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c'.");
        }
        }while(!choice2.equals("a") && !choice2.equals("b"));

      if(choice2.equals("a"))
      {
        ShriekingHut();
      }
      else if(choice2.equals("b"))
      {
         HogsmeadeTs();
      }        
	}
	public static void ShriekingHut()
	{//User can find Maurauder map. Maueaudermap allow user to go to Whomping willow
		 System.out.println("\nShrieking Hut, the abandoned haunted house");
         System.out.println("You went into the Shrieking Hut");
          //choice challenge
         System.out.println("Do you want to explore downstair or upstair");
         System.out.println("(d) Downstair\n(u) Upstair");
         String updown;
       do{
        updown = In.getString().toLowerCase();

        if(!updown.equals("u") && !updown.equals("d"))
        {
           System.out.println("Invalid choice! Please  enter 'u','d'.");
        }
        }while(!updown.equals("u") && !updown.equals("d"));

        if(updown.equals("d"))
        {
         System.out.println("You found nothing but the old furnitures and rats");
        }
        else if(updown.equals("u"))
        {
         System.out.println("You found the Maurauder Map. You can see everyone and everywhere in Howarts now");
          maurauderMap ++;
        }

        System.out.println("\nWhere would you like to go");
        System.out.println("(a) Hogwarts");
        System.out.println("(b) Go back Hogsmeade");
       System.out.println("(c) Keep exploring");
       if(maurauderMap >= 1)
       {
         System.out.println("(d) Whomping Willow ");
       }
      String choice3;
       do{
       System.out.println("\nYour choice?");
        choice3 = In.getString().toLowerCase();

        if(!choice3.equals("a") && !choice3.equals("b") && !choice3.equals("c") && !choice3.equals("d"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c'.");
        }
        }while(!choice3.equals("a") && !choice3.equals("b") && !choice3.equals("c") && !choice3.equals("d"));
      if(choice3.equals("a"))

       
        if(choice3.equals("a"))
        {
        Hogwarts();
        }
        else if(choice3.equals("b"))
        {
          Hogsmeade();
        }
        else if(choice3.equals("c"))
        {
          ShriekingHut();
        }
        else if(choice3.equals("d"))
        {
          WhompingWillow();
        }
	}
  
	public static void Hogwarts()
	{//plenty places to go
		System.out.println("\nHogwarts Witchcraft and Wizardry school");
        System.out.println("Where would you like to explore");
         System.out.println("(a) Flying class");
         System.out.println("(b) Herbology class");
         System.out.println("(c) Dorm");
         System.out.println("(d) Forbidden Forest");
         System.out.println("(e) Quidditch Pitch");
          System.out.println("(f) Meet Professor McGonagall (Finish the game)");
      String choice4;
       do{
       System.out.println("\nYour choice?");
        choice4 = In.getString().toLowerCase();

        if(!choice4.equals("a") && !choice4.equals("b") && !choice4.equals("c") && !choice4.equals("d") && !choice4.equals("e") && !choice4.equals("f"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c','d,'e','f'.");
        }
        }while(!choice4.equals("a") && !choice4.equals("b") && !choice4.equals("c") && !choice4.equals("d") && !choice4.equals("e") && !choice4.equals("f"));

    
      if(choice4.equals("a"))
      {
        FlyingClass();
      }
      else if(choice4.equals("b"))
      {
        HerbologyClass();
      }
      else if(choice4.equals("c"))
      {
        Dorm();
      }
      else if(choice4.equals("d"))
      {
        ForbiddenF();
      }
      else if(choice4.equals("e"))
      {
        QuidditchP();
      }
      else if(choice4.equals("f"))
      {
        Finish();
      }

	}
    public static void FlyingClass()
	{//user get bloom. bloom allow user to fly ay QDP
    System.out.println("\nYou come to flying class.");
    System.out.println("Madam Rolanda Hooch gives you a bloom.");
    System.out.println("You acquired a bloom, you can now fly.");
	System.out.println("She teaches you how to fly with bloom.");
    Bloom ++;

       System.out.println("\nWhere would you like to explore");
         System.out.println("(a) Hogwarts");
         System.out.println("(b) Herbology class");
         System.out.println("(c) Dorm");

          String choice5;
      do{
       System.out.println("\nYour choice?");
        choice5 = In.getString().toLowerCase();

        if(!choice5.equals("a") && !choice5.equals("b") && !choice5.equals("c"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c'.");
        }
        }while(!choice5.equals("a") && !choice5.equals("b") && !choice5.equals("c"));
     

         if(choice5.equals("a"))
      {
        Hogwarts();
      }
      else if(choice5.equals("b"))
      {
        HerbologyClass();
      }
      else if(choice5.equals("c"))
      {
        Dorm();
      }
      
	}

  
    public static void HerbologyClass()
    {//usercan find mandrake
     System.out.println("You come to herbology class.");
     System.out.println("Professor Sprout teaches you about the Mandrake and instructions.");

     System.out.println("\nProfessor is about to pull the Mandrake up.");
     System.out.println("Will you put on the ear muff.");
     System.out.println("(y) yes");
     System.out.println("(n) no");

      System.out.println("\nYour choice?");
        String hb = In.getString();
      if (hb.equals("y"))
      {
        System.out.println("\nProfessor Sprout pull out the Mandrake");
        System.out.println("You found the Mandrake");
        System.out.println("It screams but you don't pass out because you have the earmuff on");
        creatures ++;//mandrake
        
      }
      else if (hb.equals("n"))
      {
        System.out.println("\nProfessor Sprout pull out the Mandrake");
        System.out.println("It screams but you pass out because you don't have the earmuff on");
      }

         System.out.println("Where would you like to explore next");
         System.out.println("(a) Hogwarts");
         System.out.println("(b) Flying class");
         System.out.println("(c) Dorm");
        String choice6;
      do{
       System.out.println("\nYour choice?");
        choice6 = In.getString().toLowerCase();

        if(!choice6.equals("a") && !choice6.equals("b") && !choice6.equals("c"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c'.");
        }
        }while(!choice6.equals("a") && !choice6.equals("b") && !choice6.equals("c"));
     


      if(choice6.equals("a"))
      {
        Hogwarts();
      }
      else if(choice6.equals("b"))
      {
        FlyingClass();
      }
      else if(choice6.equals("c"))
      {
        Dorm();
      }
       
    }

  
    public static void Dorm()
	{
	   System.out.println("\nAt the dorm you found The magic portrait of a fat lady");
       System.out.println("Fat lady : oh hello, young wizard. Be careful with those instruction, Behave well and you would not be in trouble.");
       System.out.println("'What is she talking about? That might mean something'");
         System.out.println("Where would you like to explore next");
         System.out.println("(a) Hogwarts");
         System.out.println("(b) Flying class");
         System.out.println("(c) Herbology class");

        String choice7;
      do{
       System.out.println("\nYour choice?");
        choice7 = In.getString().toLowerCase();

        if(!choice7.equals("a") && !choice7.equals("b") && !choice7.equals("c"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c'.");
        }
        }while(!choice7.equals("a") && !choice7.equals("b") && !choice7.equals("c"));
     

      if(choice7.equals("a"))
      {
        Hogwarts();
      }
      else if(choice7.equals("b"))
      {
        FlyingClass();
      }
      else if(choice7.equals("c"))
      {
        HerbologyClass();
      }
      
	}
	public static void QuidditchP()
	{
		System.out.println("Quidditch pitch. You see oval shaped field with three hooped goal posts at either end and surrounded by stands.");

      if(Bloom >= 1)
      {
        System.out.println("You have a bloom. Let's go flying");
        System.out.println("Do you want to fly fast or slow?");
        System.out.println("(a) Fly fast");
        System.out.println("(b) Fly slow");
        System.out.println("\nYour choice: ");
        String fs = In.getString();

        if(fs.equals("a"))
        {
          System.out.println("You go fast and suddenly you hear the shirping of something. You countinue to go fast you see golden ball flying so fast.");
          System.out.println("You chase it and finally catch it.");
          System.out.println("It's the snidget! You have found the Snidget.");
          creatures ++;//snidget
        }
        else if(fs.equals("b"))
        {
          System.out.println("You go slow and chill.");
          System.out.println("When the win hit your face it feels nice.");
        }

      }
      else if(Bloom ==0)
      {
        System.out.println("Unfortunatly you do not have a bloom. you can not fly");
      }

        System.out.println("\nWhere would you like to explore next");
         System.out.println("(a) Hogwarts");
         System.out.println("(b) Dorm");
         System.out.println("(c) Herbology class");
        String choice8;
      do{
       System.out.println("\nYour choice?");
        choice8 = In.getString().toLowerCase();

        if(!choice8.equals("a") && !choice8.equals("b") && !choice8.equals("c"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c'.");
        }
        }while(!choice8.equals("a") && !choice8.equals("b") && !choice8.equals("c"));
     

  
      if(choice8.equals("a"))
      {
        Hogwarts();
      }
      else if(choice8.equals("b"))
      {
        Dorm();
      }
      else if(choice8.equals("c"))
      {
        HerbologyClass();
      }
      
      
      
	}
	public static void WhompingWillow()
	{
      System.out.println("\nWhompingWillow a furious magical tree that will whom everything that get close to it ");
      if(maurauderMap  == 0)
      {
        System.out.println("You can't get inside the WhompingWillow. It's looks furios. 'Maybe there's another way.'");
      }
      else if(maurauderMap >=1)
      {
        System.out.println("Luckily you have the Maurauder Map, you know every way to go to everywhere");
        System.out.println("You get inside the WhompingWillow through the Shrieking Hut");
        System.out.println("You see a fat rat eating cheese");
        System.out.println("It's Scabber, a lazy fat rat. You have found Scabber");
        creatures ++;//scabber
      }
      
         System.out.println("\nWhere would you like to explore next");
         System.out.println("(a) Hogwarts");
         System.out.println("(b) Quidditch pitch");
         System.out.println("(c) Go back Hagrid's hut");
         System.out.println("(d) Go back to Shrieking Hut");

        String choice9;
      do{
       System.out.println("\nYour choice?");
        choice9 = In.getString().toLowerCase();

        if(!choice9.equals("a") && !choice9.equals("b") && !choice9.equals("c")  && !choice9.equals("d"))
        {
           System.out.println("Invalid choice! Please  enter 'a','b','c','d'.");
        }
        }while(!choice9.equals("a") && !choice9.equals("b") && !choice9.equals("c")  && !choice9.equals("d"));
       
      if(choice9.equals("a"))
      {
        Hogwarts();
      }
      else if(choice9.equals("b"))
      {
        QuidditchP();
      }
      else if(choice9.equals("c"))
      {
        HagridH();
      }
       else if(choice9.equals("d"))
      {
        ShriekingHut();
      }
        
	}
    public static void ForbiddenF()
	{
		System.out.println("Forbidden Forest. The alarge, dense, and dangerous forest that borders Hogwarts School of Witchcraft and Wizardry. It is off-limits to students. ");
        System.out.println("A nighttime, It's filled with magical creatures");

      if(wand >= 1)
      {
        System.out.println("\nYou have a wand, you can use some spells to fight agains the dangerous creatures in the Forbidden Forest");
        System.out.println("\nDo you want to deep or depthless in the forest");
        System.out.println("Your choice?");
        System.out.println("(a) Go deep");
        System.out.println("(b) Go depthless");
         String ds = In.getString();


      if(ds.equals("a"))
      {
        System.out.println("You go deep. It's dark and shallow");
        System.out.println("You hear something. It sounds like a hoof. Is it a unicorn? ");
        System.out.println("You follow the sound and see something is moving");
        System.out.println("You getting closer. It's Voldermort!!!");
        System.out.println("Fortunaty you have a wand. You cast the explosive spell 'Bombarda' to Voldermort and be able to escape");
        System.out.println("Whew.. that was scary. You should go to tell this to Dumbledore");
        
        
      }
      else if(ds.equals("b"))
      {
        System.out.println("You go by the edge of the forest.");
        System.out.println("It's not very scary. You see a Pixie, there're fascinating");
        System.out.println("Then you hear something. It sounds like a hoof");
        System.out.println("You keep following that hoof sound");
        System.out.println("And finally, The sound stops ,and you found a Unicorn. Oh they look majestic.");
        creatures++;//unicorn
      }
      }
      else if(wand ==0)
      {
        System.out.println("You don't have a wand. It's too dangerous.");
      }

      
         System.out.println("Where would you like to explore next");
         System.out.println("(a) Hogwarts");
      String choice0;
   do{
       System.out.println("Your choice?");
        choice0 = In.getString().toLowerCase();

        if(!choice0.equals("a"))
        {
           System.out.println("Invalid choice! Please  enter 'a'.");
        }
        }while(!choice0.equals("a"));
 
         if(choice0.equals("a"))
        {
         Hogwarts();
        }
    }


      public static void Finish()
        {//end the game
           if(creatures < 4)
           {//Did not complete
             System.out.println("\nYou lose");
             System.out.println("You have to find the snidget, unicorn, mandrake and scabber");

             System.out.println("\nWould you like to play again (yes/no)");
             String gn = In.getString();
             if(gn.equals("yes"))
             {
    
               creatures = 0;
               WizardingWorld();
             }
             
              
           }
          else if(creatures >= 4)
          {//Completed
            System.out.println("\nYou win the Fanstastic Beast and Where To Find Them contest!");
            System.out.println("Congratulations wizard!");
            System.out.println("Would you like to play again (yes/no)");
             String ng = In.getString();
             if(ng.equals("yes"))
             {
               creatures = 0;
               WizardingWorld();
             }

          }
        }
}

class In {
    private static java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    public static String getString() {
        return scanner.nextLine();
    }
}
