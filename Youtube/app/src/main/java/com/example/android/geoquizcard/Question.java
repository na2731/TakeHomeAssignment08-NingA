package com.example.android.geoquizcard;

import android.view.View;

/**
 * Created by anning on 2018/3/22.
 */

public class Question {
    public int photoId;
    public String Views;
    public String Description;
    public String Topic;



    public int getPhotoId(){return photoId;}

    public void setPhotoId(int photoId){this.photoId=photoId;}

   public String getViews(){return Views;}

   public void setViews(String Views){this.Views=Views;}

   public void setDescription(String Description){this.Description=Description;}

   public String getDescription(){return Description;}

   public void setTopic(String Topic){this.Topic=Topic;}

   public String getTopic(){return Topic;}

    public Question(int photoId,String Topic, String Description,String Views){
        this.Views=Views;
        this.photoId=photoId;
        this.Description=Description;
        this.Topic=Topic;

    }
}
