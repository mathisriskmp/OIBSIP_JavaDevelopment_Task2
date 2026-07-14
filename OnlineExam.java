import java.util.Scanner;

public class OnlineExam {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String username = "admin";
        String password = "1234";

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (!user.equals(username) || !pass.equals(password)) {
            System.out.println("Invalid Login Credentials!");
            sc.close();
            return;
        }

        Question[] questions = {

            new Question(
                    "Java is a?",
                    "A. Programming Language",
                    "B. Animal",
                    "C. Fruit",
                    "D. Car",
                    'A'),

            new Question(
                    "Which company developed Java?",
                    "A. Google",
                    "B. Sun Microsystems",
                    "C. Apple",
                    "D. IBM",
                    'B'),

            new Question(
                    "Which keyword is used for inheritance?",
                    "A. import",
                    "B. extends",
                    "C. package",
                    "D. static",
                    'B'),

            new Question(
                    "Java is?",
                    "A. Platform Independent",
                    "B. Platform Dependent",
                    "C. Operating System",
                    "D. Hardware",
                    'A'),

            new Question(
                    "JVM stands for?",
                    "A. Java Variable Machine",
                    "B. Java Virtual Machine",
                    "C. Joint Virtual Machine",
                    "D. Java Verified Machine",
                    'B')
        };

        int score = 0;

        System.out.println("\n===== EXAM STARTED =====");

        for (int i = 0; i < questions.length; i++) {

            Question q = questions[i];

            System.out.println("\nQuestion " + (i + 1));
            System.out.println(q.question);
            System.out.println(q.optionA);
            System.out.println(q.optionB);
            System.out.println(q.optionC);
            System.out.println(q.optionD);

            System.out.print("Enter Answer (A/B/C/D): ");
            char ans = Character.toUpperCase(sc.next().charAt(0));

            if (ans == q.answer) {
                score++;
            }
        }

        System.out.println("\n===== EXAM COMPLETED =====");
        System.out.println("Total Questions : " + questions.length);
        System.out.println("Correct Answers : " + score);
        System.out.println("Wrong Answers   : " + (questions.length - score));
        System.out.println("Final Score     : " + score + "/" + questions.length);

        if (score >= 3) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }

        sc.close();
    }
}