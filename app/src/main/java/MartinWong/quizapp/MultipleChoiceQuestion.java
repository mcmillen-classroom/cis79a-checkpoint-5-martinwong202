package MartinWong.quizapp;

import android.content.Context;

public class MultipleChoiceQuestion extends Question {
    private int mOptionsResIds;
    private int mAnswers;
    public MultipleChoiceQuestion(int textResId, int hintResId, int optionsResId, int ans) {
        super(textResId, hintResId);
         mOptionsResIds= optionsResId;
         mAnswers=ans;
    }

    public int getmOptionsResIds() {
        return mOptionsResIds;
    }

    @Override
    public boolean checkAnswer(int ans){
        return mAnswers==ans;
    }
    @Override
    public boolean isMultipleChoiceQuestion(){
        return true;
    }
    @Override
    public String getAnswerText(Context ctx){
        String[] options=ctx.getResources().getStringArray(mOptionsResIds);
        return options[mAnswers];
    }
}
