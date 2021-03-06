package menjacnicaGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.awt.ScrollPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Dimension;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenu mnHelp;
	private JMenuItem mntmOpen;
	private JMenuItem mntmSave;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JScrollPane scrollPane;
	private static JTextArea textArea;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JButton btnDodajKurs;
	private JButton btnObrisiKurs;
	private JButton btnIzvrsiZamenu;
	private JPopupMenu popupMenu_1;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObriiKurs;
	private JMenuItem mntmIzvriIzmenu;
	
	private MenjacnicaGUI mn;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenjacnicaGUI() {
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlaz();
			}
		});
		
		setMinimumSize(new Dimension(20, 20));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/Icons/fbc3f2cbbd97bd6b303a09369c33bc57.png")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 587, 436);
		setJMenuBar(getMenuBar_1());
		contentPane = new JPanel();
		contentPane.setMinimumSize(new Dimension(20, 20));
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getScrollPane());
		contentPane.add(getScrollPane_1());
		contentPane.add(getBtnDodajKurs());
		contentPane.add(getBtnObrisiKurs());
		contentPane.add(getBtnIzvrsiZamenu());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnFile());
			menuBar.add(getMnHelp());
		}
		return menuBar;
	}
	private JMenu getMnFile() {
		if (mnFile == null) {
			mnFile = new JMenu("File");
			mnFile.add(getMntmOpen());
			mnFile.add(getMntmSave());
			mnFile.add(getMntmExit());
		}
		return mnFile;
	}
	private JMenu getMnHelp() {
		if (mnHelp == null) {
			mnHelp = new JMenu("Help");
			mnHelp.add(getMntmAbout());
		}
		return mnHelp;
	}
	private JMenuItem getMntmOpen() {
		if (mntmOpen == null) {
			mntmOpen = new JMenuItem("Open");
			mntmOpen.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					int opcija = fc.showOpenDialog(null);
					if(opcija == JFileChooser.APPROVE_OPTION) {
						File f = fc.getSelectedFile();
						textArea.append("\nU�itan fajl: "+f.getName()+" ,gde "+f.getAbsolutePath());
					}
				}
			});
						
			mntmOpen.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
			mntmOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmOpen;
	}
	private JMenuItem getMntmSave() {
		if (mntmSave == null) {
			mntmSave = new JMenuItem("Save");
			mntmSave.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JFileChooser fc = new JFileChooser();
					int opcija = fc.showSaveDialog(null);
					
					if(opcija == JFileChooser.APPROVE_OPTION) {
						File f = fc.getSelectedFile();
						textArea.append("\nSa�uvan fajl: "+f.getName()+" ,gde "+f.getAbsolutePath());
					}
						
					
				}
			});
			mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmSave;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izlaz();
				}
			});
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
			mntmAbout.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "Aplikacija menjacnica, autor Kristina Dekic", "O programu", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAbout;
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
	private JScrollPane getScrollPane() {
		if (scrollPane == null) {
			scrollPane = new JScrollPane();
			scrollPane.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			scrollPane.setBackground(Color.LIGHT_GRAY);
			scrollPane.setBounds(5, 282, 559, 76);
			scrollPane.setViewportView(getTextArea());
		}
		return scrollPane;
	}
	private JTextArea getTextArea() {
		if (textArea == null) {
			textArea = new JTextArea();
			textArea.setWrapStyleWord(true);
			textArea.setBackground(Color.WHITE);
		}
		return textArea;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
			table.setColumnSelectionAllowed(true);
			table.setCellSelectionEnabled(true);
			table.setModel(new DefaultTableModel(
				new Object[][] {
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
					{null, null, null, null, null, null},
				},
				new String[] {
					"\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
				}
			));
			table.getColumnModel().getColumn(1).setPreferredWidth(142);
			addPopup(table, getPopupMenu_1());
			table.setComponentPopupMenu(popupMenu_1);
			
		}
		return table;
	}
	private JScrollPane getScrollPane_1() {
		if (scrollPane_1 == null) {
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setBounds(10, 13, 402, 252);
			scrollPane_1.setViewportView(getTable());
		}
		return scrollPane_1;
	}
	private JButton getBtnDodajKurs() {
		if (btnDodajKurs == null) {
			btnDodajKurs = new JButton("Dodaj kurs");
			btnDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dodaj();
				}
				
			});
			btnDodajKurs.setBounds(438, 18, 119, 25);
		}
		return btnDodajKurs;
	}
	private JButton getBtnObrisiKurs() {
		if (btnObrisiKurs == null) {
			btnObrisiKurs = new JButton("Obri\u0161i kurs");
			btnObrisiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					obrisi();
				}
			});
			btnObrisiKurs.setBounds(438, 56, 119, 25);
		}
		return btnObrisiKurs;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvr\u0161i zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					izmeni();
				}

			});
			btnIzvrsiZamenu.setBounds(438, 94, 119, 25);
		}
		return btnIzvrsiZamenu;
	}
	private void izlaz() {
			int opcija = JOptionPane.showConfirmDialog(null, "Da li zelite da izadjete?", "Izlazak", JOptionPane.YES_NO_CANCEL_OPTION);
			
			if (opcija == JOptionPane.YES_OPTION)
				System.exit(0);
	}
	static void dopisivanje(String tekst) {
		textArea.append("\n"+tekst);
		
	}
	private void dodaj() {
		DodajKursGUI dk = new DodajKursGUI(mn);
		dk.setVisible(true);
	}
	private void obrisi() {
		ObrisiKursGUI ok = new ObrisiKursGUI(mn);
		ok.setVisible(true);
	}
	private void izmeni() {
		IzvrsiZamenuGUI iz = new IzvrsiZamenuGUI(mn);
		iz.setVisible(true);
	}
	private JPopupMenu getPopupMenu_1() {
		if (popupMenu_1 == null) {
			popupMenu_1 = new JPopupMenu();
			popupMenu_1.setVisible(true);
			popupMenu_1.add(getMntmDodajKurs());
			popupMenu_1.add(getMntmObriiKurs());
			popupMenu_1.add(getMntmIzvriIzmenu());
		}
		return popupMenu_1;
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
			
			mntmDodajKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dodaj();
				}
			});
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObriiKurs() {
		if (mntmObriiKurs == null) {
			mntmObriiKurs = new JMenuItem("Obri\u0161i kurs");
			mntmObriiKurs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					obrisi();
				}

			});
		}
		return mntmObriiKurs;
	}
	private JMenuItem getMntmIzvriIzmenu() {
		if (mntmIzvriIzmenu == null) {
			mntmIzvriIzmenu = new JMenuItem("Izvr\u0161i izmenu");
			mntmIzvriIzmenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					izmeni();
				}
			});
		}
		return mntmIzvriIzmenu;
	}
}
