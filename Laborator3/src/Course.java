public class Course implements CourseOperations{
    String name;
    String description;
    Professor teacher;
    Student[] students;

    public Course(String name, String description,
                  Professor teacher, Student[] students) {
        this.name = name;
        this.description = description;
        this.teacher = teacher;
        this.students = students;
    }

    public void addStudent(Student student){

        int newLength = students.length + 1;
        Student[] aux = new Student[newLength];
        int index = 0;
        for(Student s : students) {
            aux[index++]=s;
        }

        aux[index] = student;
        this.students = new Student[newLength];
        System.arraycopy(aux,0,students,0,newLength);

    }
    public Student[] getEnrolledStudents()
    {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder("Course: " + "name=" + name + ", description=" +
                description + ",\nTeacher=" + teacher + ",\nStudents:\n");
        for(Student s : students) {
            str.append(s).append("\n");
        }

        return str.toString();
    }

    @Override
    public void UpdateProfessor(Professor p) {

    }

    @Override
    public void AddStudent(Student student) {

    }

    @Override
    public void RemoveStudent(Student student) {

    }

    @Override
    public void UpdateStudent(Student student) {

    }

    @Override
    public void UpdateCourse(String name, String description) {

    }
}