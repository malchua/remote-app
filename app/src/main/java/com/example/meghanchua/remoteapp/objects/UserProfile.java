package com.example.meghanchua.remoteapp.objects;


public class UserProfile {

    private int currentChannel;
    private int volume;
    private boolean onGuide;
    private int guideChannel;
    private int currTime;
    private int guideTime;

    public UserProfile()
    {
        this.currentChannel = 1;
        this.currTime = 400;
        this.volume = 1;
        this.onGuide = false;
        this.guideChannel = this.currentChannel;
        this.guideTime = currTime;
    }

    public final int getCurrentChannel()
    {
        return currentChannel;
    }

    public void increaseCurrentChannel()
    {
        currentChannel++;
    }

    public void decreaseCurrentChannel()
    {
        currentChannel--;
    }

    public void selectChannelFromGuide()
    {
        currentChannel = guideChannel;
        currTime = guideTime;
    }

    public int getCurrentTime()
    {
        return currTime;
    }

    public final int getCurrentVolume()
    {
        return volume;
    }

    public final boolean getOnGuide()
    {
        return onGuide;
    }

    public void enterGuide()
    {
        onGuide = true;
    }

    public void exitGuide()
    {
        onGuide = false;
    }

    public final int getGuideChannel()
    {
        return guideChannel;
    }

    public void increaseGuideChannel()
    {
        guideChannel++;
    }

    public void decreaseGuideChannel()
    {
        guideChannel--;
    }

    public int getGuideTime()
    {
        return guideTime;
    }

    public void increaseGuideTime()
    {
        if ((guideTime % 100) == 30)
        {
            guideTime+=70;
        }
        else
        {
            guideTime+=30;
        }
    }

    public void decreaseGuideTime()
    {
        if ((guideTime % 100) == 30)
        {
            guideTime-=30;
        }
        else
        {
            guideTime-=70;
        }
    }
}
