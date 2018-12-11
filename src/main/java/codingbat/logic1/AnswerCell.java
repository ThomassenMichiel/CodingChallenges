package codingbat.logic1;

public class AnswerCell {
    public static void main(String[] args) {
        System.out.println(answerCell(false,false,false));
        System.out.println(answerCell(false,false,true));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        return !isAsleep && (isMorning ? isMom : !isMom);
    }
}
