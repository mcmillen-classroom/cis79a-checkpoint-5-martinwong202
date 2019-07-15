package MartinWong.quizapp;

import android.content.Context;

import java.util.Arrays;

public class FillTheBlank extends Question {
    private String[] mFillAnswers;
    public FillTheBlank(int textResId, int hintResId, String[] fillAnswers) {
        super(textResId, hintResId);
        mFillAnswers=fillAnswers;
    }
    @Override
    public boolean checkAnswer(String userAnswer)
    {
        for (String ans : mFillAnswers)
        {
            if (ans.equalsIgnoreCase(userAnswer))
            {
                return true;
            }
        }

        return false;
    }
    @Override
    public boolean isFillTheBlankQuestion(){
        return true;
    }
    @Override
    public String getAnswerText(Context ctx){
        return Arrays.toString(mFillAnswers);
    }
}
