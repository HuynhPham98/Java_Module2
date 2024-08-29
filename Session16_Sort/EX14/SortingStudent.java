package ThuatToanSapXepVaTimKiem.EX14;

public class SortingStudent {

    // Insertion Sort
    public static Student[] insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;
            while (j >= 0 && students[j].getScore() > key.getScore()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
        return students;
    }

    // Selection Sort
    public static Student[] selectionSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (students[j].getScore() < students[minIdx].getScore()) {
                    minIdx = j;
                }
            }
            Student temp = students[minIdx];
            students[minIdx] = students[i];
            students[i] = temp;
        }
        return students;
    }

    // Bubble Sort
    public static Student[] bubbleSort(Student[] students) {
        int n = students.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].getScore() > students[j + 1].getScore()) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        return students;
    }

    // Hàm in danh sách học sinh
    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println();
    }
}

