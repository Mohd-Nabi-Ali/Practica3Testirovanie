package test;


import main.QuestionsBase;
import org.junit.jupiter.api.Test;

public class QuestionsBaseTest {

    @Test
    void testAgeQuestion(){
        final String expAgeQuestion = "Сколько вам лет?";
        assert(expAgeQuestion.equals(QuestionsBase.AGE.getQuestion()));
    }

}
