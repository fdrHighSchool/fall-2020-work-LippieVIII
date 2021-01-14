public class Main {
  public static void main(String[] args) {
    Student student1 = new Student("kyler", "123456789");
    Student student2 = new Student("XinBao", "345621342");
    Student student3 = new Student("Thomas", "777777777");
    System.out.println(student1);
    System.out.println(student2);
    System.out.println(student3);

    student1.addGrade(100);
    student1.displayGrades();
    student1.addGrade(90);
    student1.displayGrades();

    student2.addGrade(95);
    student2.displayGrades();

    student3.fillArray();
    student3.displayGrades();

    System.out.println(student1.calculateAverage());
    System.out.println(student2.calculateAverage());
    System.out.println(student3.calculateAverage());
  }
}
