package menjacnicaGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblProdajniKurs;
	private JLabel lblKupovniKurs;
	private JTextField textFieldKupovniKurs;
	private JTextField textFieldProdajniKurs;
	private JLabel lblValuta;
	private JComboBox comboBox;
	private JLabel lblIznos;
	private JTextField textFieldIznos;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovina;
	private JRadioButton rdbtnProdaja;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private JSlider slider;

	private MenjacnicaGUI mn;
	private int brojIznosa;
	private String odgovor;
	
	/**
	 * Create the frame.
	 */
	public IzvrsiZamenuGUI(MenjacnicaGUI mn) {
		setResizable(false);
		setTitle("Izvr\u0161i zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 537, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
	 	
		
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextFieldKupovniKurs());
		contentPane.add(getTextFieldProdajniKurs());
		contentPane.add(getLblValuta());
		contentPane.add(getComboBox());
		contentPane.add(getLblIznos());
		contentPane.add(getTextFieldIznos());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovina());
		contentPane.add(getRdbtnProdaja());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
		contentPane.add(getSlider());
		
		brojIznosa = slider.getValue();
 		textFieldIznos.setText(brojIznosa+"");
		
		this.mn = mn;
	}

	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni Kurs");
			lblProdajniKurs.setBounds(289, 31, 88, 16);
		}
		return lblProdajniKurs;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni Kurs");
			lblKupovniKurs.setBounds(35, 31, 80, 16);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextFieldKupovniKurs() {
		if (textFieldKupovniKurs == null) {
			textFieldKupovniKurs = new JTextField();
			textFieldKupovniKurs.setEditable(false);
			textFieldKupovniKurs.setBounds(35, 60, 116, 22);
			textFieldKupovniKurs.setColumns(10);
		}
		return textFieldKupovniKurs;
	}
	private JTextField getTextFieldProdajniKurs() {
		if (textFieldProdajniKurs == null) {
			textFieldProdajniKurs = new JTextField();
			textFieldProdajniKurs.setEditable(false);
			textFieldProdajniKurs.setBounds(289, 60, 116, 22);
			textFieldProdajniKurs.setColumns(10);
		}
		return textFieldProdajniKurs;
	}
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(185, 31, 56, 16);
		}
		return lblValuta;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "USD", "CHF"}));
			comboBox.setEditable(true);
			comboBox.setBounds(185, 60, 66, 22);
		}
		return comboBox;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(35, 106, 56, 16);
		}
		return lblIznos;
	}
	private JTextField getTextFieldIznos() {
		if (textFieldIznos == null) {
			textFieldIznos = new JTextField();
			textFieldIznos.setBounds(35, 135, 116, 22);
			textFieldIznos.setColumns(10);
			
		}
		return textFieldIznos;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(237, 106, 110, 16);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovina() {
		if (rdbtnKupovina == null) {
			rdbtnKupovina = new JRadioButton("Kupovina");
			rdbtnKupovina.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnKupovina.isSelected()) {
						odgovor = "kupovina";
					}
				}
			});
			buttonGroup.add(rdbtnKupovina);
			rdbtnKupovina.setBounds(237, 134, 127, 25);
		}
		return rdbtnKupovina;
	}
	private JRadioButton getRdbtnProdaja() {
		if (rdbtnProdaja == null) {
			rdbtnProdaja = new JRadioButton("Prodaja");
			rdbtnProdaja.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(rdbtnProdaja.isSelected()) {
						odgovor = "prodaja";
					}

				}
			});
			
			buttonGroup.add(rdbtnProdaja);
			rdbtnProdaja.setBounds(237, 164, 127, 25);
		}
		return rdbtnProdaja;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						String tekstKurs = "IZMENA KURSA: valuta:"+comboBox.getSelectedItem().toString() +"iznos: "+textFieldIznos.getText()+"kupovina ili prodaja: "+odgovor;
						mn.dopisivanje(tekstKurs);
				} catch (Exception e1) {
						JOptionPane.showMessageDialog(null, e1.getMessage(), "Greska", JOptionPane.ERROR_MESSAGE);
					}
				}
			});
			btnIzvrsiZamenu.setBounds(35, 287, 116, 25);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(289, 287, 116, 25);
		}
		return btnOdustani;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					brojIznosa = slider.getValue();
			 		textFieldIznos.setText(brojIznosa+"");
				}
			});
			slider.setSnapToTicks(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setPaintTicks(true);
			slider.setPaintLabels(true);
			slider.setBounds(35, 212, 407, 62);
			
			
		}
		return slider;
	}
}
