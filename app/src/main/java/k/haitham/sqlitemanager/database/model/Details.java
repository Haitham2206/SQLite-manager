package k.haitham.sqlitemanager.database.model;

public class Details {
    public static final String TAG = Details.class.getSimpleName();
    public static final String TABLE = "ActivityRecognition";

    //Labels table columns names
    public static final String KEY_ActivityRecognitionId = "activityRecognitionID";
    public static final String KEY_DayTime = "dayTime";
    public static final String KEY_ActivityType = "activityType";
    public static final String KEY_Confidence = "confidence";


    private String dayTime;
    private String activityType;
    private String confidence;


    public String getDayTime() {
        return dayTime;
    }

    public void setDayTime(String dayTime) {
        this.dayTime = dayTime;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }


}
