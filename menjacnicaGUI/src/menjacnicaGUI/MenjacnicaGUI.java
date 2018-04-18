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
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JEditorPane;
import javax.swing.border.TitledBorder;
import javax.swing.JTextPane;
import javax.swing.JFormattedTextField;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
	private JMenu mnNewMenu;
	private JMenu mnNewMenu_1;
	private JMenuItem mntmNewMenuItem;
	private JMenuItem mntmNewMenuItem_1;
	private JMenuItem mntmExit;
	private JMenuItem mntmAbout;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JTable table;
	private JScrollPane scrollPane_1;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JPopupMenu popupMenu_1;
	private JMenuItem mntmDodajKurs;
	private JMenuItem mntmObriiKurs;
	private JMenuItem mntmIzvriIzmenu;

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
		setMinimumSize(new Dimension(20, 20));
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Computer.gif")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
		contentPane.add(getBtnNewButton());
		contentPane.add(getBtnNewButton_1());
		contentPane.add(getBtnNewButton_2());
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.add(getMnNewMenu());
			menuBar.add(getMnNewMenu_1());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("File");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_1());
			mnNewMenu.add(getMntmExit());
		}
		return mnNewMenu;
	}
	private JMenu getMnNewMenu_1() {
		if (mnNewMenu_1 == null) {
			mnNewMenu_1 = new JMenu("Help");
			mnNewMenu_1.add(getMntmAbout());
		}
		return mnNewMenu_1;
	}
	private JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Open");
			mntmNewMenuItem.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/Directory.gif")));
			mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		}
		return mntmNewMenuItem;
	}
	private JMenuItem getMntmNewMenuItem_1() {
		if (mntmNewMenuItem_1 == null) {
			mntmNewMenuItem_1 = new JMenuItem("Save");
			mntmNewMenuItem_1.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/com/sun/java/swing/plaf/windows/icons/FloppyDrive.gif")));
			mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		}
		return mntmNewMenuItem_1;
	}
	private JMenuItem getMntmExit() {
		if (mntmExit == null) {
			mntmExit = new JMenuItem("Exit");
			mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		}
		return mntmExit;
	}
	private JMenuItem getMntmAbout() {
		if (mntmAbout == null) {
			mntmAbout = new JMenuItem("About");
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
			textArea.setBackground(Color.WHITE);
		}
		return textArea;
	}
	private JTable getTable() {
		if (table == null) {
			table = new JTable();
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
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Dodaj kurs");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			btnNewButton.setBounds(438, 18, 119, 25);
		}
		return btnNewButton;
	}
	private JButton getBtnNewButton_1() {
		if (btnNewButton_1 == null) {
			btnNewButton_1 = new JButton("Obri\u0161i kurs");
			btnNewButton_1.setBounds(438, 56, 119, 25);
		}
		return btnNewButton_1;
	}
	private JButton getBtnNewButton_2() {
		if (btnNewButton_2 == null) {
			btnNewButton_2 = new JButton("Izvr\u0161i zamenu");
			btnNewButton_2.setBounds(438, 94, 119, 25);
		}
		return btnNewButton_2;
	}
	private JPopupMenu getPopupMenu_1() {
		if (popupMenu_1 == null) {
			popupMenu_1 = new JPopupMenu();
			popupMenu_1.add(getMntmDodajKurs());
			popupMenu_1.add(getMntmObriiKurs());
			popupMenu_1.add(getMntmIzvriIzmenu());
		}
		return popupMenu_1;
	}
	private JMenuItem getMntmDodajKurs() {
		if (mntmDodajKurs == null) {
			mntmDodajKurs = new JMenuItem("Dodaj kurs");
		}
		return mntmDodajKurs;
	}
	private JMenuItem getMntmObriiKurs() {
		if (mntmObriiKurs == null) {
			mntmObriiKurs = new JMenuItem("Obri\u0161i kurs");
		}
		return mntmObriiKurs;
	}
	private JMenuItem getMntmIzvriIzmenu() {
		if (mntmIzvriIzmenu == null) {
			mntmIzvriIzmenu = new JMenuItem("Izvr\u0161i izmenu");
		}
		return mntmIzvriIzmenu;
	}
}
