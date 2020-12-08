package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView mStoryTextView;
    private Button mButtonTop;
    private Button mButtonBottom;

    //track the story number
    private int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        // originally initialised as T1 Story and Answers
        mStoryTextView = findViewById(R.id.storyTextView);
        mButtonTop = findViewById(R.id.buttonTop);
        mButtonBottom = findViewById(R.id.buttonBottom);
        //alternative is set as R.string.T1_Story


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1 || mStoryIndex == 2) {
                    storyT3();
                    mStoryIndex = 3;
                } else {
                    //T6 End
                    story3TopEnd();
                    hideButtons();
                }
            }
        });

        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mStoryIndex == 1) {
                    storyT2();
                    mStoryIndex = 2;
                } else if (mStoryIndex == 3) {
                    //T5 End
                    story3BottomEnd();
                    hideButtons();
                } else {
                    //T4 End
                    story2BottomEnd();
                    hideButtons();
                }

            }
        });

    }

    public void storyT3() {
        mStoryTextView.setText(R.string.T3_Story);
        mButtonTop.setText(R.string.T3_Ans1);
        mButtonBottom.setText(R.string.T3_Ans2);
    }

    public void storyT2() {
        mStoryTextView.setText(R.string.T2_Story);
        mButtonTop.setText(R.string.T2_Ans1);
        mButtonBottom.setText(R.string.T2_Ans2);
    }

    public void story3TopEnd() {
        mStoryTextView.setText(R.string.T6_End);
    }

    public void story3BottomEnd() {
        mStoryTextView.setText(R.string.T5_End);
    }

    public void story2BottomEnd() {
        mStoryTextView.setText(R.string.T4_End);
    }

    public void hideButtons() {
        mButtonTop.setVisibility(View.GONE);
        mButtonBottom.setVisibility(View.GONE);
    }
}
