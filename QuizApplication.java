import java.util.*;

class Question {
    String questionText;
    String[] options;
    int correctAnswer;

    public Question(String questionText, String[] options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }
}

public class QuizApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Question> questions = new ArrayList<>();

        // Adding questions
        questions.add(new Question(
            "Which of the following is not a Java feature?",
            new String[]{"A) Object-Oriented", "B) Platform Independent", "C) Use of pointers", "D) Robust"},
            3
        ));

        questions.add(new Question(
            "What is the extension of Java code files?",
            new String[]{"A) .js", "B) .java", "C) .class", "D) .txt"},
            2
        ));

        questions.add(new Question(
            "Which keyword is used to inherit a class in Java?",
            new String[]{"A) super", "B) this", "C) extends", "D) implements"},
            3
        ));

        questions.add(new Question(
            "Which of these is a reserved keyword in Java?",
            new String[]{"A) array", "B) goto", "C) null", "D) String"},
            2
        ));

        questions.add(new Question(
            "Which method is used to start a thread in Java?",
            new String[]{"A) init()", "B) start()", "C) run()", "D) execute()"},
            2
        ));

        int score = 0;
        int questionNumber = 1;

        System.out.println("========== Welcome to Java Quiz ==========\n");

        for (Question q : questions) {
            System.out.println("Q" + questionNumber + ": " + q.questionText);
            for (String option : q.options) {
                System.out.println(option);
            }

            System.out.print("Enter your answer (1-4): ");
            int answer = sc.nextInt();

            if (answer == q.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.options[q.correctAnswer - 1] + "\n");
            }

            questionNumber++;
        }

        System.out.println("========== Quiz Completed ==========");
        System.out.println("Your Score: " + score + " / " + questions.size());

        if (score == questions.size()) {
            System.out.println("🎉 Excellent! Perfect score!");
        } else if (score >= questions.size() * 0.6) {
            System.out.println("👍 Good Job! Keep it up!");
        } else {
            System.out.println("💪 Keep practicing to improve!");
        }

        sc.close();
    }
}
