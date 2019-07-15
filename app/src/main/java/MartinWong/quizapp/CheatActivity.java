package MartinWong.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CheatActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView mQuestionTextView;
    private TextView mAnswerTextView;
    private Button mShowAnswerButton;
    private String mAnswerText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);
        mQuestionTextView= (TextView) findViewById(R.id.question_text_view);
        mAnswerTextView= (TextView) findViewById(R.id.answer_text_view);
        mShowAnswerButton= (Button) findViewById(R.id.show_answer_button);
        mShowAnswerButton.setOnClickListener(this);

        Intent launchIntent= getIntent();
        String questionText=launchIntent.getStringExtra("question_text");
        mQuestionTextView.setText(questionText);
    }

    @Override
    public void onClick(View view) {

    }
    public static Intent newIntent(Context ctx, Question question){
        Intent ret= new Intent(ctx,CheatActivity.class);
        ret.putExtra("qusetion_text", question.getText(ctx));
        ret.putExtra("answer_text", question.getAnswerText(ctx));
        return ret;
    }
}
