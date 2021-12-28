package sample;
import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
        //création de la fenêtre
        JFrame frame = new JFrame("mon dialogue");
        frame.setPreferredSize(new Dimension(800,700));

        //création des containers
        JPanel center = new JPanel();
        center.setPreferredSize(new Dimension(730,500));
        JPanel east = new JPanel();
        east.setPreferredSize(new Dimension(140,500));
        JPanel south = new JPanel();
        south.setPreferredSize(new Dimension(800,70));

        JPanel cNorth = new JPanel();
        cNorth.setPreferredSize(new Dimension(600,150));

        JPanel cCenter = new JPanel();
        cCenter.setPreferredSize(new Dimension(700,370));

        JPanel cSouth = new JPanel();
        cSouth.setPreferredSize(new Dimension(700,50));


        cNorth.setLayout(new GridLayout(5,1));
        cSouth.setLayout(new FlowLayout());
        east.setLayout(new GridLayout(9,1));
        south.setLayout(new FlowLayout());

        JLabel nom = new JLabel("Nom");
        JTextField tNom = new JTextField();
        JLabel prenom = new JLabel("Prénom");
        JTextField tPrenom = new JTextField();
        JLabel adress = new JLabel("Adress");
        JTextField tAdress = new JTextField();
        tAdress.setPreferredSize(new Dimension());
        tAdress.setPreferredSize(new Dimension(600,300));

        JLabel s = new JLabel("Sexe");
        JRadioButton homme = new JRadioButton("Homme");
        JRadioButton femme = new JRadioButton("Femme");
        ButtonGroup group = new ButtonGroup();
        group.add(homme);
        group.add(femme);

        JCheckBox tennis = new JCheckBox("Tennis");
        JCheckBox squash = new JCheckBox("Squash");
        JCheckBox natation = new JCheckBox("Natation");
        JCheckBox athietisme = new JCheckBox("Athiétisme");
        JCheckBox randonnée = new JCheckBox("Randonnée");
        JCheckBox foot = new JCheckBox("Foot");
        JCheckBox basket = new JCheckBox("Basket");
        JCheckBox volley = new JCheckBox("Volley");
        JCheckBox petanque = new JCheckBox("Petanque");

        JButton ok = new JButton("OK");
        JButton annuler = new JButton("Annuler");
        ButtonGroup group2 = new ButtonGroup();
        group2.add(ok);
        group2.add(annuler);

        frame.add(center, BorderLayout.CENTER);
        center.add(cNorth);
        cNorth.add(nom);
        cNorth.add(tNom);
        cNorth.add(prenom);
        cNorth.add(tPrenom);
        cNorth.add(adress);

        center.add(cCenter);
        cCenter.add(tAdress);


        center.add(cSouth);
        cSouth.add(s);
        cSouth.add(homme);
        cSouth.add(femme);

        frame.add(east, BorderLayout.EAST);
        east.add(tennis);
        east.add(squash);
        east.add(natation);
        east.add(athietisme);
        east.add(randonnée);
        east.add(foot);
        east.add(basket);
        east.add(volley);
        east.add(petanque);

        frame.add(south, BorderLayout.SOUTH);
        south.add(ok);
        south.add(annuler);

        frame.pack();
        frame.setVisible(true);

    }
}