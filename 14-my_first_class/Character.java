public class Character {
  //Instance variables
  private String theClass;
  private String ability;
  private int level;

  //The constructor
  public Character(String c, String a) {
    this.theClass = c;
    this.ability = a;

    /*
     * Math.random() --> [0, 1)
     * Math.random() * 200 --> [0, 200)
     * Math.random() * 200 + 1 --> [1, 201)
     */
    this.level = (int)(Math.random() * 200 + 1);
  }

  public String getCharacterClass() {
    return this.theClass;
  }//End getClass method

  public String getAbility() {
    return this.ability;
  }

  public int getLevel() {
    return this.level;

  }
  public void displayLevel() {
    System.out.println(level);
  }//End displayLevel method

  public void setClass(String theClass) {
    this.theClass = theClass;
  }

  //Last method
  //override toString()
  public String toString() {
    return "Class: " + this.theClass + "\n" + "Ability: " + this.ability + "\n" + "Level: " + this.level + "\n";
  }
}
