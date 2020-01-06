package mediaplayerfinal;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.media.Player;
import javax.media.Manager;
import javax.media.Time;
import org.bytedeco.javacpp.opencv_core;
import org.bytedeco.javacpp.opencv_core.CvScalar;
import org.bytedeco.javacpp.opencv_core.IplImage;
import static org.bytedeco.javacpp.opencv_core.cvCreateImage;
import static org.bytedeco.javacpp.opencv_core.cvInRangeS;
import static org.bytedeco.javacpp.opencv_core.cvReleaseImage;
import static org.bytedeco.javacpp.opencv_core.cvScalar;
import static org.bytedeco.javacpp.opencv_core.cvSize;
import org.bytedeco.javacpp.opencv_highgui;
import org.bytedeco.javacpp.opencv_highgui.CvCapture;
import static org.bytedeco.javacpp.opencv_highgui.cvCreateCameraCapture;
import static org.bytedeco.javacpp.opencv_highgui.cvQueryFrame;
import static org.bytedeco.javacpp.opencv_highgui.cvReleaseCapture;
import static org.bytedeco.javacpp.opencv_highgui.cvSaveImage;
import static org.bytedeco.javacpp.opencv_highgui.cvShowImage;
import static org.bytedeco.javacpp.opencv_highgui.cvWaitKey;
import static org.bytedeco.javacpp.opencv_imgproc.CV_BGR2HSV;
import static org.bytedeco.javacpp.opencv_imgproc.cvCvtColor;
import org.bytedeco.javacv.CanvasFrame;

public class AudioPlayerCV extends javax.swing.JFrame {

    Player audioPlayer = null;
    String audioPath = "";
    int l;
    int cn = 0;
    String[] s;

    public AudioPlayerCV() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        File f = new File("src\\audioF");
        s = f.list();

        l = s.length;

        audioPath = "src\\audioF\\" + s[cn];
        initAudioPlayer(audioPath);
       
    }

    private void initAudioPlayer(String pathname) {
        try {
            URL url = new File(pathname).toURL();
            System.out.println(pathname);
            //System.out.println(l);
            audioPlayer = Manager.createRealizedPlayer(url);
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        previous = new javax.swing.JButton();
        PlayjToggleButton1 = new javax.swing.JToggleButton();
        next = new javax.swing.JButton();
        StopButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        canvas1 = new java.awt.Canvas();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CV Interface");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(36, 47, 65));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(100, 100));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(36, 47, 65));
        jPanel1.setForeground(new java.awt.Color(36, 47, 65));

        previous.setBackground(new java.awt.Color(36, 47, 65));
        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/audio/rsz_pre.png"))); // NOI18N
        previous.setToolTipText("pre");
        previous.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        previous.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previousActionPerformed(evt);
            }
        });

        PlayjToggleButton1.setBackground(new java.awt.Color(36, 47, 65));
        PlayjToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/audio/play.png"))); // NOI18N
        PlayjToggleButton1.setToolTipText("play/Push");
        PlayjToggleButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PlayjToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayjToggleButton1ActionPerformed(evt);
            }
        });

        next.setBackground(new java.awt.Color(36, 47, 65));
        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/audio/rsz_next.png"))); // NOI18N
        next.setToolTipText("next");
        next.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextActionPerformed(evt);
            }
        });

        StopButton.setBackground(new java.awt.Color(36, 47, 65));
        StopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/audio/Stop.png"))); // NOI18N
        StopButton.setToolTipText("stop");
        StopButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        StopButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopButtonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/audio/rsz_59647312-logo-des-yeux-de-modèle-de-vecteur-de-conception-colorful-icône-du-support-creative-concept-de-vision-log.png"))); // NOI18N

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("C");
        jButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(previous, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PlayjToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(next, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(canvas1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(StopButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(next, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(PlayjToggleButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(previous, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        PlayjToggleButton1.getAccessibleContext().setAccessibleDescription("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void StopButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopButtonActionPerformed
        // TODO add your handling code here:
        audioPlayer.stop();
        audioPlayer.setMediaTime(new Time(0.0));
        if (PlayjToggleButton1.isSelected()) {
            PlayjToggleButton1.setSelected(false);
            audioPlayer.stop();
        }
    }//GEN-LAST:event_StopButtonActionPerformed

    private void PlayjToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayjToggleButton1ActionPerformed
        //Play  or Pause

        if (PlayjToggleButton1.isSelected()) {
            PlayjToggleButton1.setText("play");
            audioPlayer.start();
        } else {
            PlayjToggleButton1.setText("pause");
            audioPlayer.stop();
        }
    }//GEN-LAST:event_PlayjToggleButton1ActionPerformed

    private void nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextActionPerformed
        audioPlayer.stop();
        cn++;
        audioPath = "src\\audioF\\" + s[cn % l];
        //System.out.println(audioPath);
        initAudioPlayer(audioPath);

        if (PlayjToggleButton1.isSelected()) {
            PlayjToggleButton1.setSelected(true);
            audioPlayer.stop();
        } else {
            PlayjToggleButton1.setSelected(true);
            PlayjToggleButton1.setText("Play");
        }
        audioPlayer.start();

    }//GEN-LAST:event_nextActionPerformed

    private void previousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previousActionPerformed
        // Previous
        audioPlayer.stop();
        cn--;
        if (cn == -1) {
            cn = l - 1;
        }
        audioPath = "src\\audioF\\" + s[cn % l];
        //System.out.println(audioPath);
        initAudioPlayer(audioPath);
        if (PlayjToggleButton1.isSelected()) {
            PlayjToggleButton1.setSelected(true);
            audioPlayer.stop();
        } else {
            PlayjToggleButton1.setSelected(true);
            PlayjToggleButton1.setText("Play");
        }

        audioPlayer.start();
    }//GEN-LAST:event_previousActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //open CV Code:
        audioPlayer.stop();
        IplImage img1, bluehsv, bluebin, redhsv, redbin, greenhsv, greenbin;

        bluehsv = cvCreateImage(cvSize(640, 480), 8, 3);
        bluebin = cvCreateImage(cvSize(640, 480), 8, 1);

        redhsv = cvCreateImage(cvSize(640, 480), 8, 3);
        redbin = cvCreateImage(cvSize(640, 480), 8, 1);
        greenhsv = cvCreateImage(cvSize(640, 480), 8, 3);
        greenbin = cvCreateImage(cvSize(640, 480), 8, 1);

        CvCapture capture1 = cvCreateCameraCapture(0);

        int i = 1, checkblue, checkred, checkgreen, green = 0, red = 0, blue = 0, cc = 0, pp=0;

        while (i == 1) {
            green = 0;
            red = 0;
            blue = 0;
            img1 = cvQueryFrame(capture1);

            if (img1 == null) {
                break;
            }

            cvCvtColor(img1, bluehsv, CV_BGR2HSV);
            cvCvtColor(img1, redhsv, CV_BGR2HSV);
            cvCvtColor(img1, greenhsv, CV_BGR2HSV);

            CvScalar minb = cvScalar(95, 150, 75, 0), maxb = cvScalar(145, 255, 255, 0);  //Blue
            CvScalar ming = cvScalar(40, 50, 60, 0), maxg = cvScalar(80, 255, 255, 0);    //Green
            CvScalar minr = cvScalar(150, 150, 75, 0), maxr = cvScalar(200, 255, 255, 0);   //Red

            cvInRangeS(bluehsv, minb, maxb, bluebin);
            cvInRangeS(redhsv, minr, maxr, redbin);
            cvInRangeS(greenhsv, ming, maxg, greenbin);

            cvShowImage("BinaryBlue", bluebin);
            cvShowImage("BinaryRed", redbin);
            cvShowImage("BinaryGreen", greenbin);
            cvShowImage("color", img1);

            cvSaveImage("Blue.jpg", bluebin);
            cvSaveImage("Red.jpg", redbin);
            cvSaveImage("Green.jpg", greenbin);

            //checking blue
            try {
                File bluefile = new File("Blue.jpg");
                BufferedImage blueimg = ImageIO.read(bluefile);
                int bwidth = blueimg.getWidth();
                int bheight = blueimg.getHeight();

                int btc = 0, bco = 0;

                for (int ii = 0; ii < bheight; ii++) {

                    for (int jj = 0; jj < bwidth; jj++) {

                        btc++;
                        Color c = new Color(blueimg.getRGB(jj, ii));
                        //System.out.println("S.No: " + count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
                        if (c.getRed() == 0) {
                            bco++;

                        }
                    }
                }
                checkblue = btc - bco;
                System.out.println("Blue " + checkblue);
                if (checkblue > 1000) {
                    blue = 1;

                }
                //System.out.println("Blue"+btc+"  "+bco+"  "+(btc-bco));
            } catch (Exception e) {
            }

            //checking red
            try {
                File redfile = new File("Red.jpg");
                BufferedImage redimg = ImageIO.read(redfile);
                int rwidth = redimg.getWidth();
                int rheight = redimg.getHeight();

                int rtc = 0, rco = 0;

                for (int ii = 0; ii < rheight; ii++) {

                    for (int jj = 0; jj < rwidth; jj++) {

                        rtc++;
                        Color c = new Color(redimg.getRGB(jj, ii));
                        if (c.getRed() == 0) {
                            rco++;

                        }
                    }
                }
                checkred = rtc - rco;
                System.out.println("Red " + checkred);
                if (checkred > 1000) {
                    red = 1;

                }
                //System.out.println("Red"+rtc+"  "+rco+"  "+(rtc-rco));
            } catch (Exception e) {
            }

            //checking Green
            try {
                File greenfile = new File("Green.jpg");
                BufferedImage greenimg = ImageIO.read(greenfile);
                int gwidth = greenimg.getWidth();
                int gheight = greenimg.getHeight();

                int gtc = 0, gco = 0;

                for (int ii = 0; ii < gheight; ii++) {

                    for (int jj = 0; jj < gwidth; jj++) {

                        gtc++;
                        Color c = new Color(greenimg.getRGB(jj, ii));
                        //System.out.println("S.No: " + count + " Red: " + c.getRed() +"  Green: " + c.getGreen() + " Blue: " + c.getBlue());
                        if (c.getRed() == 0) {
                            gco++;
                        }
                    }
                }
                checkgreen = gtc - gco;
                System.out.println("Green " + checkgreen);
                if (checkgreen > 2500) {
                    green = 1;

                }
                //System.out.println("Green"+gtc+"  "+gco+"  "+(gtc-gco));
            } catch (Exception e) {
            }

            //media player controling 
            if (red == 1 && green == 0 && blue == 1 && cc == 1) {
                //Play  or Pause
                cc = 0;
                System.out.println("Green");
                pp++;
                 if(pp%2==1)
                 {
                     audioPlayer.start();
                 }
                 else
                    audioPlayer.stop();

            } else if (red == 1 && green == 1 && blue == 0 && cc == 1) {
                //Next
                cc = 0;
                System.out.println("Blue");
                audioPlayer.stop();
                cn++;
                audioPath = "src\\audioF\\" + s[cn % l];
                //System.out.println(audioPath);
                initAudioPlayer(audioPath);

                if (PlayjToggleButton1.isSelected()) {
                    PlayjToggleButton1.setSelected(true);
                    audioPlayer.stop();
                } else {
                    PlayjToggleButton1.setSelected(true);
                    PlayjToggleButton1.setText("Play");
                }
                audioPlayer.start();

            } else if (red == 0 && green == 1 && blue == 1 && cc == 1) {
                // Previous
                cc = 0;
                System.out.println("Red");
                audioPlayer.stop();
                cn--;
                if (cn == -1) {
                    cn = l - 1;
                }
                audioPath = "src\\audioF\\" + s[cn % l];
                //System.out.println(audioPath);
                initAudioPlayer(audioPath);
                if (PlayjToggleButton1.isSelected()) {
                    PlayjToggleButton1.setSelected(true);
                    audioPlayer.stop();
                } else {
                    PlayjToggleButton1.setSelected(true);
                    PlayjToggleButton1.setText("Play");
                }
                audioPlayer.start();
            } else if (red == 1 && green == 1 && blue == 1) {
                cc = 1;
            }

            char c = (char) cvWaitKey(100);
            if (c == ' ') {
                audioPlayer.stop();
                System.exit(0);
                //this.dispose();
                //System.out.println("space detected----------------------------");
                break;
            }
        }

        cvReleaseImage(bluehsv);
        cvReleaseImage(bluebin);
        cvReleaseImage(redhsv);
        cvReleaseImage(redbin);
        cvReleaseImage(greenhsv);
        cvReleaseImage(greenbin);
        cvReleaseCapture(capture1);


    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudioPlayerCV().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton PlayjToggleButton1;
    private javax.swing.JButton StopButton;
    private java.awt.Canvas canvas1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton next;
    private javax.swing.JButton previous;
    // End of variables declaration//GEN-END:variables
}
