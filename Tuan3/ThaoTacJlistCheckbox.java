 package baitapso7;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JList;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;

public class ThaoTacJlistCheckbox extends JFrame {

	private JPanel contentPane;
	private JTextField txtNhap;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThaoTacJlistCheckbox frame = new ThaoTacJlistCheckbox();
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
	public ThaoTacJlistCheckbox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 694, 463);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 676, 416);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 0, 675, 77);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblTieuDe = new JLabel("Thao t\u00E1c tr\u00EAn Jlist - Checkbox");
		lblTieuDe.setForeground(new Color(0, 153, 204));
		lblTieuDe.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblTieuDe.setBounds(143, 13, 421, 51);
		panel_1.add(lblTieuDe);
		
		JPanel panel_2 = new JPanel();
		panel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_2.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 51), new Color(255, 0, 51), new Color(255, 0, 51), new Color(255, 0, 51)), "Ch\u1ECDn t\u00E1c v\u1EE5", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_2.setBounds(0, 75, 252, 280);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnToDenSoChan = new JButton("T\u00F4 \u0111en s\u1ED1 ch\u1EB5n");
		btnToDenSoChan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnToDenSoChan.setBounds(12, 39, 217, 25);
		panel_2.add(btnToDenSoChan);
		
		JButton btnToDenSoLe = new JButton("T\u00F4 \u0111en s\u1ED1 l\u1EBB");
		btnToDenSoLe.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnToDenSoLe.setBounds(12, 79, 217, 25);
		panel_2.add(btnToDenSoLe);
		
		JButton btnToDenSoNguyenTo = new JButton("T\u00F4 \u0111en s\u1ED1 nguy\u00EAn t\u1ED1");
		btnToDenSoNguyenTo.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnToDenSoNguyenTo.setBounds(12, 117, 217, 25);
		panel_2.add(btnToDenSoNguyenTo);
		
		JButton btnBoToDen = new JButton("B\u1ECF t\u00F4 \u0111en");
		btnBoToDen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBoToDen.setBounds(12, 155, 217, 25);
		panel_2.add(btnBoToDen);
		
		JButton btnXoaToDen = new JButton("X\u00F3a c\u00E1c gi\u00E1 tr\u1ECB \u0111ang t\u00F4 \u0111en");
		btnXoaToDen.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXoaToDen.setBounds(12, 193, 217, 25);
		panel_2.add(btnXoaToDen);
		
		JButton btnTongGiaTriList = new JButton("T\u1ED5ng gi\u00E1 tr\u1ECB trong List");
		btnTongGiaTriList.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTongGiaTriList.setBounds(12, 230, 217, 25);
		panel_2.add(btnTongGiaTriList);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 51), new Color(255, 0, 51), new Color(255, 0, 51), new Color(255, 0, 51)), "Nh\u1EADp th\u00F4ng tin: ", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(253, 75, 422, 280);
		panel.add(panel_3);
		panel_3.setLayout(null);
		
		txtNhap = new JTextField();
		txtNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		txtNhap.setBounds(105, 38, 147, 22);
		panel_3.add(txtNhap);
		txtNhap.setColumns(10);
		
		JButton btnNhap = new JButton("Nh\u1EADp");
		btnNhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNhap.setBounds(12, 37, 87, 25);
		panel_3.add(btnNhap);
		
		JCheckBox ckbNhapSoAm = new JCheckBox("Cho nh\u1EADp s\u1ED1 \u00E2m");
		ckbNhapSoAm.setFont(new Font("Tahoma", Font.PLAIN, 15));
		ckbNhapSoAm.setBounds(260, 36, 149, 25);
		panel_3.add(ckbNhapSoAm);
		
		JList list = new JList();
		list.addAncestorListener(new AncestorListener() {
			public void ancestorAdded(AncestorEvent event) {
			}
			public void ancestorMoved(AncestorEvent event) {
			}
			public void ancestorRemoved(AncestorEvent event) {
			}
		});
		list.setBounds(12, 73, 398, 194);
		panel_3.add(list);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 0, 51), new Color(255, 0, 51), new Color(255, 0, 51), new Color(255, 0, 51)));
		panel_4.setBackground(new Color(255, 204, 204));
		panel_4.setBounds(0, 356, 675, 60);
		panel.add(panel_4);
		panel_4.setLayout(null);
		
		JButton btnDongChuongTrinh = new JButton("\u0110\u00F3ng ch\u01B0\u01A1ng tr\u00ECnh");
		btnDongChuongTrinh.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnDongChuongTrinh.setBounds(233, 13, 178, 34);
		panel_4.add(btnDongChuongTrinh);
		
		btnNhap.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String getSo = txtNhap.getText();
				list.setToolTipText(getSo);
			}
		});
	}
}