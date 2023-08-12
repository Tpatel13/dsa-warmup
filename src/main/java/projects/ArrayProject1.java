package projects;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ArrayProject1 {

    private static final String EXIT_WORD = "exit";
    private int[] temperatureData = null;

    public ArrayProject1(int numberOfDays) {
        this.temperatureData = new int[numberOfDays];
    }

    public void insertTemperature(int day, int temperature) {
        try {
            temperatureData[day] = temperature;
        } catch (Exception e) {
            System.out.println("Error while inserting temperature on " + day + "th day");
        }
    }

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Welcome to Days Temperature project ");
        System.out.println("How many days of Temperature you want to insert");
        System.out.println("Type exit anytime to exit");
        int numberOfDays;
        while (true) {
            try {
                numberOfDays = Integer.parseInt(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Enter valid integer value");
            }
        }

        ArrayProject1 arrayProject1 = new ArrayProject1(numberOfDays);

        arrayProject1.getTemperatureDataFromUser();
        System.out.println(Arrays.toString(arrayProject1.temperatureData));
        arrayProject1.printAverageTempV1();
        arrayProject1.printNoOfDaysMoreThenAverage();
        arrayProject1.printNoOfDaysMoreThenAverageWithDay();
    }

    private void getTemperatureDataFromUser() {
        if (this.temperatureData != null || this.temperatureData.length != 0) {
            int day = 0;

            BufferedReader reader;

            while (day < this.temperatureData.length) {
                System.out.println("Enter " + (1 + day) + "th day temperature");
                try {
                    reader = new BufferedReader(new InputStreamReader(System.in));
                    if (reader.readLine().equals(EXIT_WORD)) {
                        break;
                    }

                    temperatureData[day] = Integer.parseInt(reader.readLine());
                    System.out.println(" ");
                } catch (Exception e) {
                    System.out.println("Enter again valid temperature value");
                }
            }
        }
    }

    private void printAverageTempV1() {
        int sum = 0;

        for (int i = 0; i < this.temperatureData.length; i++) {
            sum = sum + this.temperatureData[i];
        }
        System.out.println("Average Temperature : " + sum / this.temperatureData.length);
    }

    private void printAverageTempV2() {
        System.out.println("Average Temperature : " + (Arrays.stream(this.temperatureData).sum()) / this.temperatureData.length);
    }

    private void printAverageTempV3() {
        System.out.println("Average Temperature : " + (Arrays.stream(this.temperatureData).average().getAsDouble()));
    }

    private void printNoOfDaysMoreThenAverage() {
        if (this.temperatureData != null || this.temperatureData.length != 0) {
            Supplier<IntStream> intStream = () -> Arrays.stream(this.temperatureData);

            int averageTemp = intStream.get().sum() / this.temperatureData.length;

            int numberOfDaysMoreThenAverage = (int) intStream.get().filter(temperature -> temperature >= averageTemp).count();

            System.out.println("NUmber of days more then average : " + numberOfDaysMoreThenAverage);
        }
        int[] myArray=new int[]{1,2,3,4,5,6};

    }


    private void printNoOfDaysMoreThenAverageWithDay() {
        if (this.temperatureData != null || this.temperatureData.length != 0) {

            Supplier<IntStream> intStream = () -> Arrays.stream(this.temperatureData);

            int averageTemp = intStream.get().sum() / this.temperatureData.length;

            System.out.println("Average temperature : " + averageTemp);
            System.out.println();

            for (int day = 0; day < this.temperatureData.length; day++) {
                if (this.temperatureData[day] >= averageTemp) {
                    System.out.print(" " + (1 + day));
                }
            }

            System.out.println(" th day/days");
        }
    }


}
