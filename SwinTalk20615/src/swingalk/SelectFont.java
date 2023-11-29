package swingalk;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;



public class SelectFont extends JDialog implements ActionListener, ListSelectionListener {
    String[] name = {"굴림", "굴림체", "궁서", "나눔손글씨 붓", "휴먼고딕"};
    String[] style = {"보통", "기울임", "굵게", "굵은 기울임"};
    String[] size = {"8", "10", "12", "16", "20", "24", "28", "32"};

    JList fontName = new JList(name);
    JList fontStyle = new JList(style);
    JList fontSize = new JList(size);

    JLabel sample = new JLabel("AaBbYyZz 한글처리");

    JButton btnOK = new JButton("확인");
    JButton btnNO = new JButton("취소");

    SelectFont() {
        setModal(true);
        setBounds(1000, 0, 400, 380);

        JPanel p0;
        p0 = new JPanel(null);
        add(p0);

        fontName.setBounds(10, 10, 180, 160);
        fontStyle.setBounds(200, 10, 100, 160);
        fontSize.setBounds(310, 10, 60, 160);
        p0.add(fontName);
        p0.add(fontStyle);
        p0.add(fontSize);

        fontName.setSelectedIndex(0);
        fontStyle.setSelectedIndex(0);
        fontSize.setSelectedIndex(0);

        sample.setBounds(200, 180, 170, 100);
        Border border = BorderFactory.createLineBorder(Color.gray, 1);
        sample.setBorder(border);
        p0.add(sample);

        btnOK.setBounds(200, 300, 80, 30);
        btnNO.setBounds(290, 300, 80, 30);

        fontName.addListSelectionListener(this);
        fontStyle.addListSelectionListener(this);
        fontSize.addListSelectionListener(this);
        btnOK.addActionListener(this);
        btnNO.addActionListener(this);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnOK)
            changeFont = true;
        else if(e.getSource() == btnNO)
            changeFont = false;

        setVisible(false);
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        String name = fontName.getSelectedValue().toString();

        int style = 0;
        if(fontStyle.getSelectedIndex() == 0)
            style = Font.PLAIN;
        else if(fontStyle.getSelectedIndex() == 1)
            style = Font.ITALIC;
        else if(fontStyle.getSelectedIndex() == 2)
            style = Font.BOLD;
        else if(fontStyle.getSelectedIndex() == 3)
            style = Font.BOLD | Font.ITALIC;

        String temp = fontSize.getSelectedValue().toString();
        int size = Integer.parseInt(temp);
        Font font = new Font(name, style, size);
        sample.setFont(font);
    }

    boolean changeFont = false;
}

