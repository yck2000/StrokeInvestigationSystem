package Examination;

import java.time.LocalDate;

public class MRI extends Exam{
    private String name;
    private String URLlink;
    private int fieldStrength;
    public MRI(LocalDate date, String URLlink, int fieldStrength) {
        super(date);
        name = "MRI examination";
        this.URLlink = URLlink;
        this.fieldStrength = fieldStrength;
    }
    public void setURL(String URLlink) {
        this.URLlink = URLlink;
    }
    public String getURL() {
        return URLlink;
    }

    public void setFieldStrength(int fieldStrength) {
        this.fieldStrength = fieldStrength;
    }
    public String getFieldStrength() {
        return fieldStrength+" Tesla";
    }

    public String getName() {
        return name;
    }



}
