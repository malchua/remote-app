package com.example.meghanchua.remoteapp.objects;


import java.io.Serializable;

public class UserProfile implements Serializable{

    private boolean power;
    private int currentChannel;
    private String currDay;
    private int currHour;
    private String currTime;
    private int volume;
    private boolean onGuide;
    private int guideChannel;
    private String guideDay;
    private int guideHour;
    private String guideTime;
    private boolean onRecord;

    public UserProfile()
    {
        this.power = true;
        this.currentChannel = 1;
        this.currDay = "SAT";
        this.currHour = 10;
        this.currTime = "AM";
        this.volume = 1;
        this.onGuide = false;
        this.guideChannel = this.currentChannel;
        this.guideDay = currDay;
        this.guideHour = currHour;
        this.guideTime = currTime;
        this.onRecord = false;
    }

    public boolean hasPower()
    {
        return power;
    }
    public void powerOn()
    {
        power = true;
    }

    public void powerOff()
    {
        power = false;
    }

    public final int getCurrentChannel()
    {
        return currentChannel;
    }

    public void increaseCurrentChannel()
    {
        currentChannel++;
        if (currentChannel > 20)
            currentChannel = 1;
    }

    public void decreaseCurrentChannel()
    {
        currentChannel--;
        if (currentChannel <= 0)
            currentChannel = 20;
    }

    public void selectChannelFromGuide()
    {
        currentChannel = guideChannel;
        currTime = guideTime;
    }

    public int getCurrHour()
    {
        return currHour;
    }

    public String getCurrentTime()
    {
        return currTime;
    }

    public final int getCurrentVolume()
    {
        return volume;
    }

    public final boolean onGuide()
    {
        return onGuide;
    }

    public final boolean onRecord()
    {
        return onRecord;
    }

    public final int getGuideChannel()
    {
        return guideChannel;
    }

    public void increaseGuideChannel()
    {
        guideChannel++;
        if (guideChannel > 20)
            guideChannel = 1;
    }

    public void decreaseGuideChannel()
    {
        guideChannel--;
        if (guideChannel <= 0)
            guideChannel = 20;
    }

    public String getDay()
    {
        return guideDay;
    }

    private void nextDay()
    {
        guideDay = "SUN";
    }

    private void prevDay()
    {
        guideDay = "SAT";
    }

    public String getGuideTime()
    {
        return guideTime;
    }

    private void switchTime()
    {
        if (guideTime.equals("AM"))
            guideTime = "PM";
        else
            guideTime = "AM";
    }

    public int getGuideHour()
    {
        return guideHour;
    }

    public void increaseGuideHour()
    {
        guideHour++;
        if (guideHour == 12)
        {
            switchTime();
            if (guideTime.equals("AM"))
                nextDay();
        }

        if (guideHour > 12)
        {
            guideHour = 1;
        }
    }

    public void decreaseGuideHour()
    {
        guideHour--;
        if (guideHour == 0)
            guideHour = 12;

        if (guideHour == 11)
        {
            switchTime();
            if (guideTime.equals("PM"))
                prevDay();
        }
    }

    public String getDate()
    {
        return guideDay + " " + guideHour + " " + guideTime;
    }

    public void selectChannel()
    {
        currentChannel = guideChannel;
        guideDay = currDay;
        guideHour = currHour;
        guideTime = currTime;
    }

    public void enterGuide()
    {
        guideChannel = currentChannel;
        onGuide = true;
    }

    public void exitGuide()
    {
        guideChannel = currentChannel;
        guideDay = currDay;
        guideHour = currHour;
        guideTime = currTime;
        onGuide = false;
    }

    public void enterRecord()
    {
        onRecord = true;
    }

    public void exitRecord()
    {
        onRecord = false;
    }

    public String displayTV()
    {
        return "TV: CH." + currentChannel + ", " + getDate();
    }

    public String displayGuide()
    {
        return "Guide: CH." + currentChannel + ", " + getDate();
    }

}
