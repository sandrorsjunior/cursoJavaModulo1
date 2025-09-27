package org.example.exercise;

import org.example.menu.ModuleOneOptions;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Optional;
import java.util.Scanner;

public class ModuleOne {
    private ModuleOneOptions options;


    //Goals: Write an algorithm that reads the values of two angles of a triangle and calculates and prints
    // the value of the third angle..
    public float exercise1(float angleOne, float angleTwo){
        final float sumOfAngles = Math.abs(angleOne - angleTwo);
        if(sumOfAngles>= 180) throw new IllegalArgumentException("One or Both arguments are wrong! The angles sum shouldn't  >= 180");
        return 180 - sumOfAngles;
    }
    //Goals: Write an algorithm that reads a number of hours (which may not be an integer) and calculates and
    // writes its equivalent in minutes.
    public long exercise2(long hour){
        return hour * 60;
    }

    public BigDecimal exercise3(float currentlySalary){
        final BigDecimal rate = new BigDecimal("0.20");
        return (BigDecimal.valueOf(currentlySalary).multiply(rate)).add(BigDecimal.valueOf(currentlySalary));
    }
    public BigDecimal exercise3(float currentlySalary, float rate){
        return (BigDecimal.valueOf(currentlySalary).multiply(BigDecimal.valueOf(rate))).add(BigDecimal.valueOf(currentlySalary));
    }
    public ArrayList<Float> insertStudentGrade(int quantityOfGrades){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> arrayOfGrades = new ArrayList<>();
        for(int i = 0; i < quantityOfGrades; i++){
            System.out.print("Tell me the " + i + "º Grade: ");
            arrayOfGrades.add(scanner.nextFloat());
        }

        return arrayOfGrades;
    }

    public Float exercise4(ArrayList<Float> listOfGrades){
        Optional<Float> sum =  listOfGrades.stream().reduce((a, b) -> (a + b));

        if(sum.isPresent()) {
            return (float)(sum.get() / (listOfGrades.size() * 1.0));
        }else {
            throw new RuntimeException("Due some reason it wasn't possible add up all the grades!");
        }
    }

    //Write an algorithm that reads two student grades for an assignment and a test.
    // Knowing that the assignment accounts for 60% of the grade, the algorithm should calculate the weighted average of
    // the student's assessment items.
    public Float exercise5(ArrayList<Float> listOfGrades){
        Optional<Float> sum =  listOfGrades.stream().reduce((a, b) -> (float)(a*0.6) + (float)(a*0.2));

        if(sum.isPresent()) {
            return (float)(sum.get() / (listOfGrades.size() * 1.0));
        }else {
            throw new RuntimeException("Due some reason it wasn't possible add up all the grades!");
        }
    }

    //Write an algorithm that reads a number of minutes (integer) and calculates and writes its equivalent in hours and minutes.
    public HashMap<String, Integer> exercise6(int time){
        final int hour = time/60;
        final int minutes = time%60;
        HashMap<String, Integer> result = new HashMap<>();
        result.put("hour", hour);
        result.put("minutes", minutes);
        return result;
    }

}
