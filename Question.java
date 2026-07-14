public class Question {

    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char answer;

    public Question(String question,
                    String optionA,
                    String optionB,
                    String optionC,
                    String optionD,
                    char answer) {

        this.question = question;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.answer = answer;
    }
}