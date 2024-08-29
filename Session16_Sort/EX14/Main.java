package ThuatToanSapXepVaTimKiem.EX14;

public class Main {
    public static void main(String[] args) {
        // Tạo danh sách học sinh
        Student[] students = {
                new Student(1, "John", 75.5),
                new Student(2, "Jane", 85.3),
                new Student(3, "Tom", 65.8),
                new Student(4, "Alice", 90.2),
                new Student(5, "Bob", 70.4)
        };

        // Sắp xếp bằng thuật toán Insertion Sort
        Student[] insertionSortedStudents = SortingStudent.insertionSort(students.clone());
        System.out.println("Sắp xếp bằng Insertion Sort:");
        SortingStudent.printStudents(insertionSortedStudents);

        // Sắp xếp bằng thuật toán Selection Sort
        Student[] selectionSortedStudents = SortingStudent.selectionSort(students.clone());
        System.out.println("Sắp xếp bằng Selection Sort:");
        SortingStudent.printStudents(selectionSortedStudents);

        // Sắp xếp bằng thuật toán Bubble Sort
        Student[] bubbleSortedStudents = SortingStudent.bubbleSort(students.clone());
        System.out.println("Sắp xếp bằng Bubble Sort:");
        SortingStudent.printStudents(bubbleSortedStudents);
    }
}

