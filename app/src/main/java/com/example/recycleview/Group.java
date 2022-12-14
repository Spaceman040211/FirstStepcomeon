package com.example.recycleview;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

import androidx.appcompat.content.res.AppCompatResources;

public class Group {
    private String GroupName;
    private String GroupNews;
    private String Time;
    private int GroupPicture;
    public String getGroupName(){return GroupName;}
    public void setGroupName(String groupName){this.GroupName=groupName;}
    public String getGroupNews(){return GroupNews;}
    public void setGroupNews(String groupNews){this.GroupNews=groupNews;}
    public String getTime(){return Time;}
    public void setTime(String time){this.Time=time;}
    public int getGroupPicture(){return GroupPicture;}
    public void setGroupPicture(int GroupPicture){this.GroupPicture=GroupPicture;}

}
