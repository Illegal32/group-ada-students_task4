package az.coders.ada_students.lessons.lesson_9.Recursion;

public class TriangleRec {
    public static void main(String[] args) {
        System.out.println(triangle(10));
    }
    public static int triangle(int rows) {
        if (rows == 0) return 0;
        return rows + triangle(rows - 1);
    }

}
