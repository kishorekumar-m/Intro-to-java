class School {
    void classroom() {
        System.out.println("GOLDEN SCHOOL");
    }
}

class Student extends School {
    void classroom() {
        super.classroom();
        System.out.println("LKG");
    }
}

class Students1 extends School {
    void classroom() {
        System.out.println("UKG");
    }
}

public class schoolPoly {
    public static void main(String[] args) {
        School s = new School();            // Creating object of School class
        School s1 = new Student();          // Creating object of Student class (polymorphism)
        School s2 = new Students1();        // Creating object of Students1 class (polymorphism)

        s.classroom();  // Output: GOLDEN SCHOOL
        s1.classroom(); // Output: GOLDEN SCHOOL, LKG (due to method overriding)
        s2.classroom(); // Output: UKG
    }   
}

