package challenges.daysOfCode.day12Inheritance;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Student extends Person {
    private int[] testScores;
    private int[] scores;

    public Student( String firstName, String lastName, int id, int[] scores ) {
        super( firstName, lastName, id );
        this.scores = scores;
    }

    public char calculate() {
        OptionalDouble optAverageScore = Arrays.stream(this.scores).average();
        double averageScore = optAverageScore.orElse(0);
        if ( 90 <= averageScore && averageScore <= 100 ) {
            return 'O';
        } else if ( 80 <= averageScore && averageScore < 90 ){
            return 'E';
        } else if ( 70 <= averageScore && averageScore < 80 ){
            return 'A';
        } else if ( 55 <= averageScore && averageScore < 70 ){
            return 'P';
        } else if ( 40 <= averageScore && averageScore < 55 ){
            return 'D';
        } else return 'T';
    }
}
