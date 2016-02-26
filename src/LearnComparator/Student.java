package LearnComparator;

import java.util.Comparator;

/**
 * Created by synergisticit on 2/25/2016.
 */
public class Student {
    int id;
    String fName;
    String lName;
    String fathersFullName;

    public Student(int id, String fName, String lName, String fathersFullName) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.fathersFullName = fathersFullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", fathersFullName='" + fathersFullName + '\'' +
                '}';
    }


    /**
     * DNSO
     *
     * @param
     * @return
     */
//    @Override
//    public int compareTo(Object o) {
//        Student curr =(Student)o;
//
//        if (this.id > curr.id)
//            return 1;
//        else if(this.id < curr.id)
//            return -1;
//        else
//            return compareFirstNames(o);
//    }

    // Lexicographical Order
    private int compareFirstNames(Object o) {
        Student curr =(Student)o;
        int ret = this.fName.compareTo(curr.fName);
        if (ret != 0)
            return ret;
        else
            return compareFathersName(o);


    }

    private int compareFathersName(Object o) {
        Student curr =(Student)o;

        return this.fathersFullName.compareTo(curr.fathersFullName);


    }

    /**
     * WILL NOT WORK
     * @param o1
     * @param o2
     * @return
     */
//    @Override
//    public int compare(Object o1, Object o2) {
//        Student student1 = (Student) o1;
//        Student student2 = (Student) o2;
//
//        if (student1.id > student2.id)
//            return 1;
//        else if (student1.id < student2.id)
//            return -1;
//        else
//            return 0;
//    }
}

