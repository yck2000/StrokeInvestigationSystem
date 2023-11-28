import Examination.*;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class Patient {
    private String name;
    private String URLlink;
    private int age;
    private MRI MRIExam;
    private BP BPExam;


    //Below are parameters for future design:
    private ArrayList<String> MRIImages;
    private Exam heartRate;
    private Exam ECG;
    private Exam Xray;
    private ArrayList<Exam> exams;


    public Patient(String name, String URLlink, int age){
        this.name = name;
        this.URLlink = URLlink;
        this.age = age;

        //For adding MRI images in future
        MRIImages = new ArrayList<String>();
        MRIImages.add(URLlink);
        exams = new ArrayList<Exam>();
    }

    public String displayBP() {
        return BPExam.getSystolic() + " over " + BPExam.getDiastolic();
    }

    public String getExamDetails() {
        return  "Patient: " + name + ": " + "MRI: " + MRIExam.getFieldStrength() +
                ", " + MRIExam.getDate().toString() + ": BP: " + BPExam.getDuration() +
                ", " + BPExam.getDate().toString();
    }


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setMRIExam(MRI MRIExam) {
        this.MRIExam = MRIExam;
        exams.add(MRIExam);
    }
    public void setBPExam(BP BPExam) {
        this.BPExam = BPExam;
        exams.add(BPExam);
    }
    public MRI getMRIExam() {
        return MRIExam;
    }
    public BP getBPExam() {
        return BPExam;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setURL(String URLlink) {
        this.URLlink = URLlink;
    }

    public ImageIcon getMRIImage() {
        URL MRIURL = null;
        try {
            MRIURL = new URL(MRIExam.getURL());
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        return new ImageIcon(MRIURL);
    }
    public ImageIcon getIcon() {
        URL link = null;
        try {
            link = new URL(URLlink);
        } catch (MalformedURLException e) {
            System.out.println(e.getMessage());
        }
        return new ImageIcon(link);
    }

    //Below are access for future design parameters:
    public ArrayList<Exam> getExams() {
        return exams;
    }
    public void addHeartRate(Exam heartRate) {
        exams.add(heartRate);
    }
    public void addECG(Exam ECG) {
        exams.add(ECG);
    }
    public void addXray(Exam Xray) {
        exams.add(Xray);
    }

    public Exam getHeartRate() {
        return heartRate;
    }

    public Exam getECG() {
        return ECG;
    }

    public Exam getXray() {
        return Xray;
    }



}
