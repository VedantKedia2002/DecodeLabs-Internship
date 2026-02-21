import java.util.*;

class Student {
    String name;
    int roll;
    String grade;

    public Student(String name, int roll, String grade) {
        this.name = name;
        this.roll = roll;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Roll: " + roll + " | Name: " + name + " | Grade: " + grade);
    }
}

class Manager {
    ArrayList<Student> list = new ArrayList<>();

    public void add(Student s) {
        // check if roll number is already taken
        for (Student temp : list) {
            if (temp.roll == s.roll) {
                System.out.println("Roll number already exists!");
                return;
            }
        }
        list.add(s);
        System.out.println("Added successfully.");
    }

    public void remove(int r) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).roll == r) {
                list.remove(i);
                System.out.println("Removed successfully.");
                return;
            }
        }
        System.out.println("Not found.");
    }

    public void search(int r) {
        for (Student s : list) {
            if (s.roll == r) {
                System.out.print("Found -> ");
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void showAll() {
        if (list.size() == 0) {
            System.out.println("List is empty.");
        } else {
            System.out.println("--- Student List ---");
            for (Student s : list) {
                s.display();
            }
        }
    }
}

public class STUDENT_MANAGEMENT_SYSTEM_TASK_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager mgr = new Manager();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Show All");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // clear the bad input
                continue;
            }

            if (choice == 5) {
                System.out.println("Bye!");
                break;
            }

            switch (choice) {
                case 1:
                    sc.nextLine(); // clear buffer
                    System.out.print("Name: ");
                    String n = sc.nextLine();

                    System.out.print("Roll Number: ");
                    int r = 0;
                    try {
                        r = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Roll number must be an integer.");
                        sc.nextLine();
                        break; // goes back to menu
                    }

                    sc.nextLine(); // clear buffer
                    System.out.print("Grade: ");
                    String g = sc.nextLine();

                    mgr.add(new Student(n, r, g));
                    break;

                case 2:
                    System.out.print("Enter roll to remove: ");
                    int rm = sc.nextInt();
                    mgr.remove(rm);
                    break;

                case 3:
                    System.out.print("Enter roll to search: ");
                    int sr = sc.nextInt();
                    mgr.search(sr);
                    break;

                case 4:
                    mgr.showAll();
                    break;

                default:
                    System.out.println("Wrong choice. Try again.");
            }
        }
        sc.close();
    }
}