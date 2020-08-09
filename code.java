
package restauracja;
import java.awt.Component;
import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author jaros
 */
public class Restauracja1 extends javax.swing.JFrame {

   
    public Restauracja1() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanelNapoje = new javax.swing.JPanel();
        jlblPodatek1 = new javax.swing.JLabel();
        jlblPodsuma1 = new javax.swing.JLabel();
        jlblTotal1 = new javax.swing.JLabel();
        jTextWoda = new javax.swing.JTextField();
        jTextCola = new javax.swing.JTextField();
        jlblPodatek3 = new javax.swing.JLabel();
        jlblPodatek2 = new javax.swing.JLabel();
        jlblPodatek5 = new javax.swing.JLabel();
        jlblPodatek7 = new javax.swing.JLabel();
        jTextLemoniada = new javax.swing.JTextField();
        jTextSok = new javax.swing.JTextField();
        jTextKawa = new javax.swing.JTextField();
        jTextHerbata = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanelJedzenie = new javax.swing.JPanel();
        jlblPodatek4 = new javax.swing.JLabel();
        jlblPodsuma2 = new javax.swing.JLabel();
        jlblTotal2 = new javax.swing.JLabel();
        jlblPodatek9 = new javax.swing.JLabel();
        jlblPodatek10 = new javax.swing.JLabel();
        jlblPodatek11 = new javax.swing.JLabel();
        jlblPodatek12 = new javax.swing.JLabel();
        jTextSzarlotka = new javax.swing.JTextField();
        jTextZeberka = new javax.swing.JTextField();
        jTextSchabowy = new javax.swing.JTextField();
        jTextZurek = new javax.swing.JTextField();
        jTextRuskie = new javax.swing.JTextField();
        jTextTatar = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanelOkno = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextRachunek = new javax.swing.JTextArea();
        jPanelSumowanie = new javax.swing.JPanel();
        jlblPodatek6 = new javax.swing.JLabel();
        jlblPodsuma3 = new javax.swing.JLabel();
        jlblTotal3 = new javax.swing.JLabel();
        jTextSumaRazem = new javax.swing.JTextField();
        jTextNapoje = new javax.swing.JTextField();
        jTextJedzenie = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jButtonSuma = new javax.swing.JButton();
        jButtonRachunek = new javax.swing.JButton();
        jButtonWyczysc = new javax.swing.JButton();
        jButtonWyjdz = new javax.swing.JButton();
        jPanelPodatek = new javax.swing.JPanel();
        jTextPodatek8 = new javax.swing.JTextField();
        jTextPodsuma = new javax.swing.JTextField();
        jTextSuma = new javax.swing.JTextField();
        jlblPodatek23 = new javax.swing.JLabel();
        jlblTotal = new javax.swing.JLabel();
        jlblPodsuma = new javax.swing.JLabel();
        jlblPodatek8 = new javax.swing.JLabel();
        jTextPodatek23 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 12));

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        jLabel1.setText("Restauracyjny system sprzedażowy");
        jLabel1.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(259, 259, 259)
                .addComponent(jLabel1)
                .addContainerGap(295, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanelNapoje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 8));

        jlblPodatek1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek1.setText("Sok");

        jlblPodsuma1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodsuma1.setText("Lemoniada");

        jlblTotal1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblTotal1.setText("Woda");

        jTextWoda.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextWoda.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextWoda.setText("0");

        jTextCola.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextCola.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCola.setText("0");

        jlblPodatek3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek3.setText("NAPOJE");

        jlblPodatek2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek2.setText("Coca-Cola");

        jlblPodatek5.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek5.setText("Kawa");

        jlblPodatek7.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek7.setText("Herbata");

        jTextLemoniada.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextLemoniada.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextLemoniada.setText("0");

        jTextSok.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextSok.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSok.setText("0");

        jTextKawa.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextKawa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextKawa.setText("0");

        jTextHerbata.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextHerbata.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextHerbata.setText("0");

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel2.setText("9,-");

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel3.setText("8,-");

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel5.setText("12,-");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel6.setText("13,-");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel4.setText("12,-");

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel7.setText("14,-");

        javax.swing.GroupLayout jPanelNapojeLayout = new javax.swing.GroupLayout(jPanelNapoje);
        jPanelNapoje.setLayout(jPanelNapojeLayout);
        jPanelNapojeLayout.setHorizontalGroup(
            jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNapojeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlblTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPodsuma1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPodatek2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPodatek1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPodatek5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPodatek7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNapojeLayout.createSequentialGroup()
                        .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextHerbata, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextKawa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSok, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelNapojeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextCola, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelNapojeLayout.createSequentialGroup()
                        .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextLemoniada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextWoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNapojeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblPodatek3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        jPanelNapojeLayout.setVerticalGroup(
            jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNapojeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblPodatek3)
                .addGap(19, 19, 19)
                .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPodsuma1)
                        .addComponent(jLabel5))
                    .addComponent(jTextLemoniada, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblTotal1)
                        .addComponent(jLabel2))
                    .addComponent(jTextWoda, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextCola, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPodatek2)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPodatek1)
                        .addComponent(jLabel6))
                    .addComponent(jTextSok, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextKawa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPodatek5)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNapojeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPodatek7)
                        .addComponent(jLabel7))
                    .addComponent(jTextHerbata, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelJedzenie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 8));

        jlblPodatek4.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek4.setText("JEDZENIE");

        jlblPodsuma2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodsuma2.setText("Tatar wołowy");

        jlblTotal2.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblTotal2.setText("Pierogi Ruskie");

        jlblPodatek9.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek9.setText("Żurek");

        jlblPodatek10.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek10.setText("Schabowy");

        jlblPodatek11.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek11.setText("Żeberka");

        jlblPodatek12.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek12.setText("Szarlotka");

        jTextSzarlotka.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextSzarlotka.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSzarlotka.setText("0");
        jTextSzarlotka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSzarlotkaActionPerformed(evt);
            }
        });

        jTextZeberka.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextZeberka.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextZeberka.setText("0");

        jTextSchabowy.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextSchabowy.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextSchabowy.setText("0");

        jTextZurek.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextZurek.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextZurek.setText("0");

        jTextRuskie.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextRuskie.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextRuskie.setText("0");

        jTextTatar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jTextTatar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextTatar.setText("0");
        jTextTatar.setName(""); // NOI18N
        jTextTatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTatarActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel8.setText("39,-");

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel9.setText("26,-");

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel10.setText("19,-");

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel11.setText("39,-");

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel12.setText("56,-");

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 3, 24)); // NOI18N
        jLabel13.setText("22,-");

        javax.swing.GroupLayout jPanelJedzenieLayout = new javax.swing.GroupLayout(jPanelJedzenie);
        jPanelJedzenie.setLayout(jPanelJedzenieLayout);
        jPanelJedzenieLayout.setHorizontalGroup(
            jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                        .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJedzenieLayout.createSequentialGroup()
                                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlblPodatek9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblTotal2, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                                .addGap(161, 161, 161))
                            .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jlblPodatek11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jlblPodatek10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlblPodatek12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 245, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextRuskie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextZurek, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSchabowy, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextZeberka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextSzarlotka, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                        .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                                .addComponent(jlblPodsuma2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8))
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextTatar, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJedzenieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblPodatek4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );
        jPanelJedzenieLayout.setVerticalGroup(
            jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblPodatek4)
                .addGap(18, 18, 18)
                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextTatar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                        .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblPodsuma2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(5, 5, 5)))
                .addGap(18, 18, 18)
                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextRuskie, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblTotal2)
                        .addComponent(jLabel9)))
                .addGap(18, 18, 18)
                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                        .addComponent(jTextZurek, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jTextSchabowy, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelJedzenieLayout.createSequentialGroup()
                        .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblPodatek9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlblPodatek10)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPodatek11)
                        .addComponent(jLabel12))
                    .addComponent(jTextZeberka, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJedzenieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jlblPodatek12)
                        .addComponent(jLabel13))
                    .addComponent(jTextSzarlotka, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanelOkno.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 8));

        jTextRachunek.setColumns(20);
        jTextRachunek.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jTextRachunek.setRows(5);
        jScrollPane1.setViewportView(jTextRachunek);

        javax.swing.GroupLayout jPanelOknoLayout = new javax.swing.GroupLayout(jPanelOkno);
        jPanelOkno.setLayout(jPanelOknoLayout);
        jPanelOknoLayout.setHorizontalGroup(
            jPanelOknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOknoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanelOknoLayout.setVerticalGroup(
            jPanelOknoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOknoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 622, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelSumowanie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 8));

        jlblPodatek6.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek6.setText("JEDZENIE NETTO");

        jlblPodsuma3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodsuma3.setText("NAPOJE NETTO");

        jlblTotal3.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblTotal3.setText("SUMA NETTO");

        jTextSumaRazem.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        jTextNapoje.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        jTextJedzenie.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanelSumowanieLayout = new javax.swing.GroupLayout(jPanelSumowanie);
        jPanelSumowanie.setLayout(jPanelSumowanieLayout);
        jPanelSumowanieLayout.setHorizontalGroup(
            jPanelSumowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSumowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSumowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jlblPodatek6, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE)
                    .addComponent(jlblPodsuma3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlblTotal3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelSumowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextJedzenie, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNapoje, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSumaRazem, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelSumowanieLayout.setVerticalGroup(
            jPanelSumowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSumowanieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSumowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextJedzenie, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPodatek6, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSumowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextNapoje, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblPodsuma3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelSumowanieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextSumaRazem, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblTotal3, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 8));

        jButtonSuma.setBackground(new java.awt.Color(204, 204, 204));
        jButtonSuma.setText("SUMA");
        jButtonSuma.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSumaActionPerformed(evt);
            }
        });

        jButtonRachunek.setBackground(new java.awt.Color(204, 204, 204));
        jButtonRachunek.setText("RACHUNEK");
        jButtonRachunek.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jButtonRachunek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRachunekActionPerformed(evt);
            }
        });

        jButtonWyczysc.setBackground(new java.awt.Color(204, 204, 204));
        jButtonWyczysc.setText("WYCZYŚĆ");
        jButtonWyczysc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jButtonWyczysc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWyczyscActionPerformed(evt);
            }
        });

        jButtonWyjdz.setBackground(new java.awt.Color(204, 204, 204));
        jButtonWyjdz.setText("WYJDŹ");
        jButtonWyjdz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153), 4));
        jButtonWyjdz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWyjdzActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jButtonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRachunek, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonWyczysc, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonWyjdz, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonWyjdz, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButtonSuma, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButtonRachunek, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                    .addComponent(jButtonWyczysc, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanelPodatek.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 8));

        jTextPodatek8.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        jTextPodsuma.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N
        jTextPodsuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPodsumaActionPerformed(evt);
            }
        });

        jTextSuma.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        jlblPodatek23.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek23.setText("VAT 23%");

        jlblTotal.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblTotal.setText("SUMA");

        jlblPodsuma.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodsuma.setText("PODSUMA");

        jlblPodatek8.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jlblPodatek8.setText("VAT 8%");

        jTextPodatek23.setFont(new java.awt.Font("Calibri Light", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanelPodatekLayout = new javax.swing.GroupLayout(jPanelPodatek);
        jPanelPodatek.setLayout(jPanelPodatekLayout);
        jPanelPodatekLayout.setHorizontalGroup(
            jPanelPodatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPodatekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPodatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPodatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jlblTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlblPodsuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        .addComponent(jlblPodatek23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jlblPodatek8, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPodatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextPodatek8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPodsuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextSuma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextPodatek23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanelPodatekLayout.setVerticalGroup(
            jPanelPodatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPodatekLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPodatekLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPodatekLayout.createSequentialGroup()
                        .addComponent(jTextPodatek8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextPodatek23, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextPodsuma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addGroup(jPanelPodatekLayout.createSequentialGroup()
                        .addComponent(jlblPodatek8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblPodatek23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblPodsuma)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jlblTotal)
                        .addGap(6, 6, 6))))
        );

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jButton1.setText("WYDRUKUJ RACHUNEK");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 8));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanelSumowanie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelJedzenie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPanelPodatek, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jPanelNapoje, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelOkno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanelJedzenie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanelNapoje, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanelSumowanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelPodatek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanelOkno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {                                            
        SoftClass_Child ItemCost = new SoftClass_Child();
    
        double iPodatek8, iPodatek23, iPodsuma8, iPodsuma23, iPodsuma, iSuma, iSumaRazem;
        
        
    ItemCost.TatarWolowy = ItemCost.pTatarWolowy * Double.parseDouble(jTextTatar.getText());
    ItemCost.PierogiRuskie = ItemCost.pPierogiRuskie * Double.parseDouble(jTextRuskie.getText());
    ItemCost.Zurek = ItemCost.pZurek * Double.parseDouble(jTextZurek.getText());
    ItemCost.Schabowy = ItemCost.pSchabowy * Double.parseDouble(jTextSchabowy.getText());
    ItemCost.Zeberka = ItemCost.pZeberka * Double.parseDouble(jTextZeberka.getText());
    ItemCost.Szarlotka = ItemCost.pSzarlotka * Double.parseDouble(jTextSzarlotka.getText());
    
    ItemCost.Lemoniada = ItemCost.pLemoniada * Double.parseDouble(jTextLemoniada.getText());
    ItemCost.Cola = ItemCost.pCola * Double.parseDouble(jTextCola.getText());
    ItemCost.Woda = ItemCost.pWoda * Double.parseDouble(jTextWoda.getText());
    ItemCost.Sok = ItemCost.pSok * Double.parseDouble(jTextSok.getText());
    ItemCost.Kawa = ItemCost.pKawa * Double.parseDouble(jTextKawa.getText());
    ItemCost.Herbata = ItemCost.pHerbata * Double.parseDouble(jTextHerbata.getText());    
    
    iPodsuma8 = ItemCost.GetAmountJ();
    iPodatek8 = ItemCost.cFindTax8(iPodsuma8);
    iPodsuma23 = ItemCost.GetAmountN();
    iPodatek23 = ItemCost.cFindTax23(iPodsuma23);
    iPodsuma = iPodsuma8 + iPodsuma23;
    iSuma = iPodsuma + iPodatek8 + iPodatek23;
    iSumaRazem = ItemCost.GetAmountSuma();
    
    String Podsuma = String.format("PLN %.2f", iPodsuma);
    jTextPodsuma.setText(Podsuma);
    
    String Podatek8 = String.format("PLN %.2f", iPodatek8);
    jTextPodatek8.setText(Podatek8);
    
    String Podatek23 = String.format("PLN %.2f", iPodatek23);
    jTextPodatek23.setText(Podatek23);
    
    String Suma = String.format("PLN %.2f", iSuma);
    jTextSuma.setText(Suma);

    String Jedzenie = String.format("PLN %.2f", ItemCost.Jedzenie);
    jTextJedzenie.setText(Jedzenie);
    
    String Napoje = String.format("PLN %.2f", ItemCost.Napoje);
    jTextNapoje.setText(Napoje);
    
    String SumaRazem = String.format("PLN %.2f", ItemCost.SumaRazem);
    jTextSumaRazem.setText(SumaRazem);
    
    
    }                                           

    private void jButtonRachunekActionPerformed(java.awt.event.ActionEvent evt) {                                                
       
    int refs= 1325 + (int) (Math.random()*4238);

    Calendar timer = Calendar.getInstance();
    timer.getTime();
    SimpleDateFormat tTime = new SimpleDateFormat("HH:mm:ss");
    tTime.format(timer.getTime());
    SimpleDateFormat tDate = new SimpleDateFormat("dd-MM-yyyy");
    tDate.format(timer.getTime()); 
    
    jTextRachunek.append("\tRestauracja pod cycem\n\n" +
            "Numer Rachunku: \t\t" + refs + 
            "\n\n====================================\n" +
            "Jedzenie NETTO: \t\t" + jTextJedzenie.getText() + "\n\n" +
            "Napoje NETTO: \t\t" + jTextNapoje.getText() + "\n\n" +
            "Suma NETTO: \t\t" + jTextSumaRazem.getText() + "\n\n" +
            "===================================" + "\n" + 
            "VAT 8%: \t\t\t" + jTextPodatek8.getText() + "\n\n" +
            "VAT 23%: \t\t\t" + jTextPodatek23.getText() + "\n\n" +
            "Podsuma: \t\t\t" + jTextPodsuma.getText() + "\n\n" +
            "Do zapłaty: \t\t\t" + jTextSuma.getText() + "\n\n" +
            
            "===================================" +
            "\n Data: " + tDate.format(timer.getTime()) +
            "\t Godzina: " + tTime.format(timer.getTime()) +
            "\n\n\t Dziękujemy!" + "\n" + 
            "\n\t Zapraszamy ponownie!"  
            );
    
    
    
    
    }                                               

    private void jButtonWyczyscActionPerformed(java.awt.event.ActionEvent evt) {                                               
    JTextField cleartext= null;
        
    for (Component c:jPanelNapoje.getComponents()){
    if (c.getClass().toString().contains("javax.swing.JTextField")){
    cleartext = (JTextField)c;
    cleartext.setText("0");
    }
    }       
    
    //==============================================================
    
    for (Component c:jPanelJedzenie.getComponents()){
    if (c.getClass().toString().contains("javax.swing.JTextField")){
    cleartext = (JTextField)c;
    cleartext.setText("0");
    }
    }                                              
    
    //==============================================================
    
    for (Component c:jPanelSumowanie.getComponents()){
    if (c.getClass().toString().contains("javax.swing.JTextField")){
    cleartext = (JTextField)c;
    cleartext.setText("");
    }
    }       
    
    //==============================================================
    
    for (Component c:jPanelPodatek.getComponents()){
    if (c.getClass().toString().contains("javax.swing.JTextField")){
    cleartext = (JTextField)c;
    cleartext.setText("");
    }
    }
    
    //==============================================================
    
    jTextRachunek.setText(null);
    
    
    
    }
    private void jButtonWyjdzActionPerformed(java.awt.event.ActionEvent evt) {                                             
        SoftClass_Child iExit = new SoftClass_Child();
        
        iExit.iExitSystem();
    }                                            

    private void jTextSzarlotkaActionPerformed(java.awt.event.ActionEvent evt) {                                               
       
    }                                              

    private void jTextTatarActionPerformed(java.awt.event.ActionEvent evt) {                                           
       
    }                                          

    private void jTextPodsumaActionPerformed(java.awt.event.ActionEvent evt) {                                             
    
    }                                            

    
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Restauracja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Restauracja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Restauracja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Restauracja1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Restauracja1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonRachunek;
    private javax.swing.JButton jButtonSuma;
    private javax.swing.JButton jButtonWyczysc;
    private javax.swing.JButton jButtonWyjdz;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelJedzenie;
    private javax.swing.JPanel jPanelNapoje;
    private javax.swing.JPanel jPanelOkno;
    private javax.swing.JPanel jPanelPodatek;
    private javax.swing.JPanel jPanelSumowanie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCola;
    private javax.swing.JTextField jTextHerbata;
    private javax.swing.JTextField jTextJedzenie;
    private javax.swing.JTextField jTextKawa;
    private javax.swing.JTextField jTextLemoniada;
    private javax.swing.JTextField jTextNapoje;
    private javax.swing.JTextField jTextPodatek23;
    private javax.swing.JTextField jTextPodatek8;
    private javax.swing.JTextField jTextPodsuma;
    private javax.swing.JTextArea jTextRachunek;
    private javax.swing.JTextField jTextRuskie;
    private javax.swing.JTextField jTextSchabowy;
    private javax.swing.JTextField jTextSok;
    private javax.swing.JTextField jTextSuma;
    private javax.swing.JTextField jTextSumaRazem;
    private javax.swing.JTextField jTextSzarlotka;
    private javax.swing.JTextField jTextTatar;
    private javax.swing.JTextField jTextWoda;
    private javax.swing.JTextField jTextZeberka;
    private javax.swing.JTextField jTextZurek;
    private javax.swing.JLabel jlblPodatek1;
    private javax.swing.JLabel jlblPodatek10;
    private javax.swing.JLabel jlblPodatek11;
    private javax.swing.JLabel jlblPodatek12;
    private javax.swing.JLabel jlblPodatek2;
    private javax.swing.JLabel jlblPodatek23;
    private javax.swing.JLabel jlblPodatek3;
    private javax.swing.JLabel jlblPodatek4;
    private javax.swing.JLabel jlblPodatek5;
    private javax.swing.JLabel jlblPodatek6;
    private javax.swing.JLabel jlblPodatek7;
    private javax.swing.JLabel jlblPodatek8;
    private javax.swing.JLabel jlblPodatek9;
    private javax.swing.JLabel jlblPodsuma;
    private javax.swing.JLabel jlblPodsuma1;
    private javax.swing.JLabel jlblPodsuma2;
    private javax.swing.JLabel jlblPodsuma3;
    private javax.swing.JLabel jlblTotal;
    private javax.swing.JLabel jlblTotal1;
    private javax.swing.JLabel jlblTotal2;
    private javax.swing.JLabel jlblTotal3;
    // End of variables declaration                   
}
