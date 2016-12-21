package us.heftech.undercontrol.UserInfo;

/**
 * Created by mphnb2013 on 12/21/16.
 */

public class Entry {

    private int mGlucoseReading;
    private int mLongActingTaken;
    private int mMealTimeTaken;
    private int mMinutesOfActivity;
    private String mComments;


    public int getGlucoseReading() {
        return mGlucoseReading;
    }

    public void setGlucoseReading(int glucoseReading) {
        mGlucoseReading = glucoseReading;
    }

    public int getLongActingTaken() {
        return mLongActingTaken;
    }

    public void setLongActingTaken(int longActingTaken) {
        mLongActingTaken = longActingTaken;
    }

    public int getMealTimeTaken() {
        return mMealTimeTaken;
    }

    public void setMealTimeTaken(int mealTimeTaken) {
        mMealTimeTaken = mealTimeTaken;
    }

    public int getMinutesOfActivity() {
        return mMinutesOfActivity;
    }

    public void setMinutesOfActivity(int minutesOfActivity) {
        mMinutesOfActivity = minutesOfActivity;
    }

    public String getComments() {
        return mComments;
    }

    public void setComments(String comments) {
        mComments = comments;
    }




}
