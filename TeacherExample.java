// Enum representing different branches
enum Branch {
    MATH("information regarding math"),
    PHYSICS("information regarding physics"),
    CS("information regarding cs"),
    ENG("information regarding eng");

    private final String description;

    Branch(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

// Teacher class with id and branch attributes
class Teacher {
    private final int id;
    private final Branch branch;

    public Teacher(int id, Branch branch) {
        this.id = id;
        this.branch = branch;
    }

    public int getId() {
        return id;
    }

    public Branch getBranch() {
        return branch;
    }
}

public class TeacherExample {
    public static void main(String[] args) {
        // Creating four Teacher objects with different branches
        Teacher teacher1 = new Teacher(1, Branch.MATH);
        Teacher teacher2 = new Teacher(2, Branch.PHYSICS);
        Teacher teacher3 = new Teacher(3, Branch.CS);
        Teacher teacher4 = new Teacher(4, Branch.ENG);

        // Putting them in an array
        Teacher[] teachers = {teacher1, teacher2, teacher3, teacher4};

        // Printing their branches using a for loop
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.getId() +
                    ", Branch: " + teacher.getBranch() +
                    ", Description: " + teacher.getBranch().getDescription());
        }
    }
}
