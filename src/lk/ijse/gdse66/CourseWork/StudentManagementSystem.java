package lk.ijse.gdse66.CourseWork;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author : Kavithma Thushal
 * @project : Java-Questions
 * @since : 10:33 PM - 12/29/2023
 **/
public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] student = new int[10];

        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("|                           WELCOME TO GDSE MARKS MANAGEMENT SYSTEM                            |");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("    [1] Add New Student                               [2] Add New Student With Marks");
        System.out.println("    [3] Add Marks                                     [4] Update Student Details");
        System.out.println("    [5] Update Marks                                  [6] Delete Student");
        System.out.println("    [7] Print Student Details                         [8] Print Student Ranks");
        System.out.println("    [9] Best in Programming Fundamentals              [10] Best in Database Management System");
        System.out.println();
        System.out.print("Enter an option to continue > ");
        int mainChoice = scanner.nextInt();

        switch (mainChoice) {
            case 1:
                System.out.println(Arrays.toString(student));
                break;
        }
    }
}