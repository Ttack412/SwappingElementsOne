class Main {
  public static void main(String[] args) {
  // 1. Given the planets array below sort them in order by swapping the elements using the different indexes manually. Print out the resulting array using a for each loop. If you think Pluto is a planet then you can argue with Nancy on the RAP Discord.

   String[] planets = {"Neptune", "Mercury", "Earth", "Jupiter", "Venus", "Uranus", "Saturn", "Mars"};
   String tempPlanet;

    //Flipped Neptune and Mercurcy
  tempPlanet = planets[0];
  planets[0] = planets[1];
  planets[1] = tempPlanet;

    //Flipped Neptune and Venus
  tempPlanet = planets[1];
  planets[1] = planets[4];
  planets[4] = tempPlanet;

    //Flipped Jupiter and Mars
  tempPlanet = planets[3];
  planets[3] = planets[7];
  planets[7] = tempPlanet;

    //Flipped Jupiter and Neptune
  tempPlanet = planets[7];
  planets[7] = planets[4];
  planets[4] = tempPlanet;

    //Flipped Saturn and Uranus
  tempPlanet = planets[5];
  planets[5] = planets[6];
  planets[6] = tempPlanet;

  for(int i = 0; i < planets.length; i++)
    {
      System.out.println(planets[i]);
    }
    System.out.println("Pluto");
  }
}