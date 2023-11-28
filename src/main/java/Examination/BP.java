package Examination;

import java.time.LocalDate;

public class BP extends Exam{
    private int systolic;
    private int diastolic;
    private String duration;
    public BP(LocalDate date, int systolic, int diastolic, String duration) {
        super(date);
        this.systolic = systolic;
        this.diastolic = diastolic;
        this.duration = duration;
    }
    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }
    public void setDiastolic(int diastolic) {
        this.diastolic = diastolic;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }
    public int getSystolic() {
        return systolic;
    }
    public int getDiastolic() {
        return diastolic;
    }
    public String getDuration() {
        return duration;
    }
}
