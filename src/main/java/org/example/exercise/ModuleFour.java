package org.example.exercise;

import java.util.Scanner;

public class ModuleFour {
    private final Scanner scanner = new Scanner(System.in);

    public float[] exercise4_createArray(int students){
        float[] result = new float[students];
        for(int i=0; i<students; i++){
            System.out.printf("What is the grade of %dº student: ", i);
            result[i] = this.scanner.nextFloat();
        }
        return result;
    }
    public float exercise4_getGradeOfStudent(float[] array, int student){
        if(array[student] < 0){
            return 10.0F;
        }else{
            return array[student];
        }
    }
    public void exercise4(){
        System.out.println("Say how many students there are in the class:");
        float[] array = this.exercise4_createArray(this.scanner.nextInt());
        System.out.println("Say which student you would like to check the grade: ");
        int student = this.scanner.nextInt();
        float result =  exercise4_getGradeOfStudent(array, student);
        System.out.printf("The grade of the %dº student is: %f", student, result);
    }

}
