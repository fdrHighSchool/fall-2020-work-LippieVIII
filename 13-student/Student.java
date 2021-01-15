import java.util.Arrays;

class Student {
  //instance variables
  private String name;
  private String osis;
  private int[] grades;
  private int numGrades;

  //constructors
  public Student(String n, String o) {
    this.name = n;
    this.osis = o;
    grades = new int[10];
    numGrades = 0;
  }

  //methods
  public String getName() {
    return this.name;
  }//end getName method

  public String getOSIS() {
    return "";
  }//end getOSIS method

  public void displayGrades() {
    System.out.println(Arrays.toString(this.grades));
  }//End

  public int[] getGrades() {
    return this.grades;
  }

  public void setName(String name) {
    this.name = name;
  }//end setName method

  public void fillArray() {
    for (int row = 0; row < this.grades.length; row++) {
      this.grades[row] = (int)(Math.random() * 46 + 55);
    }
  }

  public void addGrade(int grade) {
    if (this.numGrades == 0) {
      int lowestIndex = 0;
      int lowestGrade = this.grades[0];

      for (int i = 1; i < this.grades.length; i++) {
        if (this.grades[i] < lowestGrade) {
          lowestIndex = i;
          lowestGrade = this.grades[i];
        }//end if statement
      }//end for loop

      //Replace (if grade is greater than lowest)
      grades[lowestIndex] = grade;
    }// end if statement

    //if grade book wasn't full
    else {
      this.grades[this.numGrades] = grade;
      this.numGrades++;
    }

    this.grades[this.numGrades] = grade;
    this.numGrades++;
  }//end AddGrade method

  public double calculateAverage() {
    int sum = 0;
    double count = 0.0;
    //Go through Array
    for (int i = 0; i < this.grades.length; i++) {
      //Determine if value is 0
      if (this.grades[i] != 0) {
        sum += this.grades[i];
        count++;
      }//End if statement
    }//End for loop
    return sum / count;
  }//end calculateAverage() method

  public String toString() {
    return "Student: " + this.name + "\n" + "OSIS: " + this.osis + "\n";
  }

}//End Student class
