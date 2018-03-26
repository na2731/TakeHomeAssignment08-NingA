package com.example.android.geoquizcard;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by anning on 2018/3/22.
 */

public class QuestionViewHolder extends RecyclerView.ViewHolder {
    public CardView cardView;
    public TextView toPic;
    public TextView desCription;
    public TextView vIew;
    public ImageView ime;
    //public TextView isTrue;


//    Intent e=new Intent(this,MainActivity.class);
//        e.putExtra



    public QuestionViewHolder(View itemView, final Context context, final List<Question> questions) {
        super(itemView);
        cardView = (CardView) itemView.findViewById(R.id.card_view);
        toPic = (TextView) itemView.findViewById(R.id.textView1);
        desCription = (TextView) itemView.findViewById(R.id.textView2);
        ime = (ImageView) itemView.findViewById(R.id.ii);
        vIew=(TextView)itemView.findViewById(R.id.textView3);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (toPic.getText().equals("Ellen/s Tribute to the Obamas")) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=XvgnOqcCYCM" ));
                        context.startActivity(webIntent);
                }
                if (toPic.getText().equals("Ice Cube Says Nice Things Angrily")) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Zi_k7H43Y-M" ));
                    context.startActivity(webIntent);
                }
                if (toPic.getText().equals("Donald Trump Interviews Himself In the Mirror")) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=c2DgwPG7mAA" ));
                    context.startActivity(webIntent);
                }
                if (toPic.getText().equals("Celebrities Read Mean Tweets #9")) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=w1AhrEhQ0mg" ));
                    context.startActivity(webIntent);
                }
                if (toPic.getText().equals("Mean Tweets Live")) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LsKFsF2zpFM" ));
                    context.startActivity(webIntent);
                }
                if (toPic.getText().equals("Mean Tweets Live")) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=LsKFsF2zpFM" ));
                    context.startActivity(webIntent);
                }
                if (toPic.getText().equals("Mean Tweets-Music")) {
                    Intent webIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=5M1ZKPCLb4I" ));
                    context.startActivity(webIntent);
                }


            }
        });
    }
}



