/*
Create a program to take input marks of students in 3 subjects physics, chemistry, and maths. Compute the percentage and then calculate the grade as shown in figure below

Hint => 
Write a method to generate random 2-digit scores for Physics, Chemistry and Math (PCM) for the students and return the scores. This method returns a 2D array with PCM scores for all students
Write a Method to calculate the total, average, and percentages for each student and return a 2D array with the corresponding values. Please ensure to round off the values to 2 Digits using Math.round() method
Write a Method to calculate the grade based on the percentage as shown in the ref table and return a 2D array of students' grade
Finally write a Method to display the scorecard of all students with their scores, total, average, percentage, and grade in a tabular format. 
*/
public class StudentGradesTable {
    public static int[][] generateScores(int students) {
        int[][] scores = new int[students][3];
        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 40 + (int)(Math.random() * 61); // 40-100
            }
        }
        return scores;
    }
    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][4];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3.0;
            double percent = (total / 300.0) * 100.0;
            stats[i][0] = total;
            stats[i][1] = Math.round(avg * 100.0) / 100.0;
            stats[i][2] = Math.round(percent * 100.0) / 100.0;
        }
        return stats;
    }
    public static String[] calculateGrades(double[][] stats) {
        String[] grades = new String[stats.length];
        for (int i = 0; i < stats.length; i++) {
            double percent = stats[i][2];
            if (percent >= 90) grades[i] = "A+";
            else if (percent >= 80) grades[i] = "A";
            else if (percent >= 70) grades[i] = "B+";
            else if (percent >= 60) grades[i] = "B";
            else if (percent >= 50) grades[i] = "C";
            else if (percent >= 40) grades[i] = "D";
            else grades[i] = "F";
        }
        return grades;
    }
    public static void displayScorecard(int[][] scores, double[][] stats, String[] grades) {
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t%.2f\t%s\n", (i+1), scores[i][0], scores[i][1], scores[i][2], stats[i][0], stats[i][1], stats[i][2], grades[i]);
        }
    }
    public static void main(String[] args) {
        int students = 10;
        int[][] scores = generateScores(students);
        double[][] stats = calculateStats(scores);
        String[] grades = calculateGrades(stats);
        displayScorecard(scores, stats, grades);
    }
}
