package Examination;

import java.time.LocalDate;

public abstract class Exam {
    protected LocalDate date;
    public Exam(LocalDate date) {
        this.date = date;
    }
    public void setDate(LocalDate date){
        this.date = date;
    }
    public LocalDate getDate() {
        return date;
    }
}
