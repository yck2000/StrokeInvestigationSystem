import Examination.BP;
import Examination.MRI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient("Daphne Von Oram",
                "https://martinh.netfirms.com/BIOE60010/DaphneVonOram.jpg", 62);
        Patient patient2 = new Patient("Sebastian Compton",
                "https://martinh.netfirms.com/BIOE60010/SebastianCompton.jpg", 31);
        patient1.setMRIExam(new MRI(LocalDate.of(2023,9,14),
                "https://martinh.netfirms.com/BIOE60010/mri1.jpg", 2));
        patient1.setBPExam(new BP(LocalDate.of(2023,9,15),
                130, 70, "ST"));
        patient2.setMRIExam(new MRI(LocalDate.of(2023,11,19),
                "https://martinh.netfirms.com/BIOE60010/mri2.jpg", 4));
        patient2.setBPExam(new BP(LocalDate.of(2023,11,20),
                150, 80, "VST"));


        JFrame frame = new JFrame("Console");
        frame.setSize(800,600);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new GridLayout(2,1,20,20));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        JPanel doctorPanel = new JPanel();
        doctorPanel.setLayout(new GridLayout(2,4,2,2));
        doctorPanel.setBackground(Color.BLACK);
        JLabel pat1Icon = new JLabel();
        JPanel pat1Info = new JPanel();
        pat1Info.setLayout(new GridLayout(2,1));
        pat1Info.add(new JLabel("Name: "+patient1.getName()));
        pat1Info.add(new JLabel("Age: "+patient1.getAge()));
        JLabel pat2Icon = new JLabel();
        JPanel pat2Info = new JPanel();
        pat2Info.setLayout(new GridLayout(2,1));
        pat2Info.add(new JLabel("Name: "+patient2.getName()));
        pat2Info.add(new JLabel("Age: "+patient2.getAge()));
        pat1Icon.setIcon(patient1.getIcon());
        pat2Icon.setIcon(patient2.getIcon());



        JLabel pat1MRIImage = new JLabel();
        JLabel pat2MRIImage = new JLabel();
        pat1MRIImage.setIcon(patient1.getMRIImage());
        pat2MRIImage.setIcon(patient2.getMRIImage());

        JPanel pat1BPInfo = new JPanel();
        JPanel pat2BPInfo = new JPanel();
        pat1BPInfo.setLayout(new GridLayout(2,1));
        pat2BPInfo.setLayout(new GridLayout(2,1));
        pat1BPInfo.add(new JLabel("Blood pressure"));
        pat1BPInfo.add(new JLabel(patient1.displayBP()));
        pat2BPInfo.add(new JLabel("Blood pressure"));
        pat2BPInfo.add(new JLabel(patient2.displayBP()));


        doctorPanel.add(pat1Icon);
        doctorPanel.add(pat1Info);
        doctorPanel.add(pat1MRIImage);
        doctorPanel.add(pat1BPInfo);
        doctorPanel.add(pat2Icon);
        doctorPanel.add(pat2Info);
        doctorPanel.add(pat2MRIImage);
        doctorPanel.add(pat2BPInfo);
        doctorPanel.setBorder(BorderFactory.createLineBorder(Color.black));


        JPanel adminPanel = new JPanel();
        adminPanel.add(new JLabel(patient1.getExamDetails()));
        adminPanel.add(new JLabel(patient2.getExamDetails()));

        mainPanel.add(doctorPanel);
        mainPanel.add(adminPanel);

        frame.setContentPane(mainPanel);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {// Ends program if close window is clicked
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

    }
}
