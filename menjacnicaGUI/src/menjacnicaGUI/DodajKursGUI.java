package menjacnicaGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DodajKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lbläifra;
	private JTextField textFieldSifra;
	private JLabel lblProdajniKurs;
	private JTextField textFieldProdajniKurs;
	private JLabel lblSrednjiKurs;
	private JTextField textFieldSrednjiKurs;
	private JLabel lblNaziv;
	private JTextField textFieldNaziv;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovniKurs;
	private JLabel lblSkraceniNaziv;
	private JTextField textFieldSkraceniNaziv;
	private JButton btnDodaj;
	private JButton btnOdustani;
	
	private MenjacnicaGUI mn;
	

	/**
	 * Create the frame.
	 */
	public DodajKursGUI(MenjacnicaGUI mn) {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(DodajKursGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		setTitle("Dodaj kurs");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLbläifra());
		contentPane.add(getTextFieldSifra());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextFieldSrednjiKurs());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextFieldNaziv());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextFieldSkraceniNaziv());
		contentPane.add(getBtnDodaj());
		contentPane.add(getBtnOdustani());
		
		this.mn = mn;
	}
	private JLabel getLbläifra() {
		if (lbläifra == null) {
			lbläifra = new JLabel("\u0160ifra");
			lbläifra.setBounds(27, 13, 59, 16);
		}
		return lbläifra;
	}
	private JTextField getTextFieldSifra() {
		if (textFieldSifra == null) {
			textFieldSifra = new JTextField();
			textFieldSifra.setBounds(27, 42, 116, 22);
			textFieldSifra.setColumns(10);
		}
		return textFieldSifra;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni Kurs");
			lblProdajniKurs.setBounds(27, 80, 105, 16);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setBounds(27, 109, 116, 22);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji Kurs");
			lblSrednjiKurs.setBounds(27, 153, 82, 16);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTextFieldSrednjiKurs() {
		if (textFieldSrednjiKurs == null) {
			textFieldSrednjiKurs = new JTextField();
			textFieldSrednjiKurs.setBounds(27, 182, 116, 22);
			textFieldSrednjiKurs.setColumns(10);
		}
		return textFieldSrednjiKurs;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(217, 13, 56, 16);
		}
		return lblNaziv;
	}
	private JTextField getTextFieldNaziv() {
		if (textFieldNaziv == null) {
			textFieldNaziv = new JTextField();
			textFieldNaziv.setBounds(217, 42, 116, 22);
			textFieldNaziv.setColumns(10);
		}
		return textFieldNaziv;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni Kurs");
			lblKupovniKurs.setBounds(217, 80, 97, 16);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setBounds(217, 109, 116, 22);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni Naziv");
			lblSkraceniNaziv.setBounds(217, 153, 97, 16);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextFieldSkraceniNaziv() {
		if (textFieldSkraceniNaziv == null) {
			textFieldSkraceniNaziv = new JTextField();
			textFieldSkraceniNaziv.setBounds(217, 182, 116, 22);
			textFieldSkraceniNaziv.setColumns(10);
		}
		return textFieldSkraceniNaziv;
	}
	private JButton getBtnDodaj() {
		if (btnDodaj == null) {
			btnDodaj = new JButton("Dodaj");
			btnDodaj.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String tekstKurs = "KURS: öifra: "+textFieldSifra.getText()+", naziv: "+textFieldNaziv.getText()+", prodajni :"+textFieldProdajniKurs.getText()+", kupovni: "+textFieldKupovniKurs.getText()+", srednji: "+textFieldSrednjiKurs.getText()+", skraceni naziv: "+textFieldSkraceniNaziv.getText();
						mn.dopisivanje(tekstKurs);
				} catch (Exception e1) {
						JOptionPane.showMessageDialog(null,
						e1.getMessage(), "Greska",
						JOptionPane.ERROR_MESSAGE);
				}
				}
			});
			btnDodaj.setBounds(27, 227, 116, 25);
		}
		return btnDodaj;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnOdustani.setBounds(217, 227, 116, 25);
		}
		return btnOdustani;
	}
}
