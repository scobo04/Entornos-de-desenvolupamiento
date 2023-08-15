package interficie;

import model.Alumne;
import model.Escola;
import model.User;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InterficieGrafica implements UserInterface {
    private JFrame f;
    private String data[][];
    private Escola escola;

    public InterficieGrafica(Escola escola) {
        this.f = new JFrame();//creating instance of JFrame
        this.data = new String[0][3];
        this.escola = escola;
    }

    @Override
    public void pintaMenu() {
        JButton b = new JButton("Afegir usuari");//creating instance of JButton
        b.setBounds(130, 100, 100, 40);//x axis, y axis, width, height
        b.addActionListener(this.actionForm());

        JButton c = new JButton("Llistar usuaris");//creating instance of JButton
        c.setBounds(130, 200, 100, 40);//x axis, y axis, width, height
        c.addActionListener(this.actionLlistatUsuaris());

        this.f.add(b); //adding button in JFrame
        this.f.add(c); //adding button in JFrame

        this.f.setSize(400, 500);//400 width and 500 height
        this.f.setLayout(null);//using no layout managers
        this.f.setVisible(true);//making the frame visible
    }


    @Override
    public void llistarUsuaris() {
        User[] users = this.escola.llistaUsuaris();
        data = new String[users.length][3];
        int i=0;
        for(User user : users){
            data[i][0] = user.getNom();
            data[i][1] = user.getCognom1();
            data[i][2] = user.getCognom2();
            i++;
        }

        JFrame f = new JFrame();

        String column[] = {"Nom", "Cognom1", "Cognom2"};
        JTable jt = new JTable(data, column);
        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }

    @Override
    public void afegirUsuari() {
        JFrame f = new JFrame("Alta usuaris");
        JTextField t1, t2;
        t1 = new JTextField("Nom");
        t1.setBounds(50, 100, 200, 30);
        t2 = new JTextField("Cognom 1");
        t2.setBounds(50, 150, 200, 30);

        JButton b = new JButton("Afegir usuari");//creating instance of JButton
        b.setBounds(50, 200, 100, 40);//x axis, y axis, width, height
        b.addActionListener(saveUsuari(t1, t2));

        f.add(t1);
        f.add(t2);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }

    private ActionListener actionForm() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                afegirUsuari();
            }
        };
        return actionListener;
    }

    private ActionListener saveUsuari(JTextField nom, JTextField cognom1) {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumne alumne = new Alumne("",nom.getText(),cognom1.getText(),"","","");
                try {
                    escola.addUsuari(alumne);
                } catch (Exception ex) {
                    throw new RuntimeException(ex);
                }
            }
        };
        return actionListener;
    }

    private ActionListener actionLlistatUsuaris() {
        ActionListener actionListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                llistarUsuaris();
            }
        };
        return actionListener;
    }
}
