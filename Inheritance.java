class Person {
    String name;

    Person(String name) {
        this.name = name;
    }

    void introduce() {
        System.out.println("Hi, my name is " + name + ".");
    }
}

class Student extends Person {
    int grade;

    Student(String name, int grade) {
        super(name);
        this.grade = grade;
    }

    void study() {
        System.out.println(name + " is studying in grade " + grade + ".");
    }
}

class GraduateStudent extends Student {
    String researchTopic;

    GraduateStudent(String name, int grade, String researchTopic) {
        super(name, grade);
        this.researchTopic = researchTopic;
    }

    void research() {
        System.out.println(name + " is researching: " + researchTopic);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, String subject) {
        super(name);
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " teaches " + subject + ".");
    }
}

interface Teachable {
    void conductClass();
}

interface Researchable {
    void doResearch();
}

class Assistant extends Person implements Teachable, Researchable {
    String department;

    Assistant(String name, String department) {
        super(name);
        this.department = department;
    }

    public void conductClass() {
        System.out.println(name + " is conducting a class in " + department + " department.");
    }

    public void doResearch() {
        System.out.println(name + " is doing research in " + department + " department.");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Student st = new Student("Lisa", 10);
        st.introduce();
        st.study();

        System.out.println();

        GraduateStudent gradStudent = new GraduateStudent("Sara", 12, "Impact of Social Media");
        gradStudent.introduce();
        gradStudent.study();
        gradStudent.research();

        System.out.println();
        Teacher teacher = new Teacher("Miles", "Mathematics");
        teacher.introduce();
        teacher.teach();

        System.out.println();

        Assistant a = new Assistant("Zade", "Computer Science");
        a.introduce();
        a.conductClass();
        a.doResearch();
    }
}
