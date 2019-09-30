package calculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame {

	private long a = 0;
	private String phepToan = "";
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(5, 5, 580, 429);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblHienThi = new JLabel("0");
		lblHienThi.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.RED, Color.RED, Color.RED, Color.RED));
		lblHienThi.setHorizontalAlignment(SwingConstants.TRAILING);
		lblHienThi.setFont(new Font("Tahoma", Font.PLAIN, 44));
		lblHienThi.setBounds(0, 0, 580, 72);
		panel.add(lblHienThi);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 76, 580, 353);
		panel.add(panel_1);
		panel_1.setLayout(new GridLayout(4, 5, 0, 0));

		JButton btnSo1 = new JButton("1");
		btnSo1.setFont(new Font("Tahoma", Font.PLAIN, 23));
		btnSo1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo1.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		panel_1.add(btnSo1);

		JButton btnSo2 = new JButton("2");
		btnSo2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo2.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo2.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo2);

		JButton btnSo3 = new JButton("3");
		btnSo3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo3.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo3.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo3);

		JButton btnChia = new JButton("/");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "/";
					lblHienThi.setText("0");
				}
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnChia);

		JButton btnSqrt = new JButton("SQRT");
		btnSqrt.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSqrt);

		JButton btnSo4 = new JButton("4");
		btnSo4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo4.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo4.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo4);

		JButton btnSo5 = new JButton("5");
		btnSo5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo5.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo5.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo5);

		JButton btnSo6 = new JButton("6");
		btnSo6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo6.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo6.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo6);

		JButton btnNhan = new JButton("*");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "*";
					lblHienThi.setText("0");
				}
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnNhan);

		JButton btnPhanTram = new JButton("%");
		btnPhanTram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "%";
					lblHienThi.setText("0");
				}
			}
		});
		btnPhanTram.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnPhanTram);

		JButton btnSo7 = new JButton("7");
		btnSo7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo7.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo7.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo7);

		JButton btnSo8 = new JButton("8");
		btnSo8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo8.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo8.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo8);

		JButton btnSo9 = new JButton("9");
		btnSo9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo9.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo9.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo9);

		JButton btnTru = new JButton("-");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "-";
					lblHienThi.setText("0");
				}
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnTru);

		JButton btnPhanSo = new JButton("1/X");
		btnPhanSo.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnPhanSo);

		JButton btnSo0 = new JButton("0");
		btnSo0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gt = lblHienThi.getText();
				if (gt.equals("0"))
					gt = "";

				long so = Long.parseLong(gt + btnSo0.getText());

				lblHienThi.setText(String.valueOf(so));
			}
		});
		btnSo0.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnSo0);

		JButton btnCongTru = new JButton("+/-");
		btnCongTru.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnCongTru);

		JButton btnXoa = new JButton("C");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				lblHienThi.setText("0");
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnXoa);

		JButton btnCong = new JButton("+");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				a = Long.parseLong(lblHienThi.getText());
				if (a != 0) {
					phepToan = "+";
					lblHienThi.setText("0");
				}
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnCong);

		JButton btnBang = new JButton("=");
		btnBang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (phepToan.length() > 0) {
					long b = Long.parseLong(lblHienThi.getText());
					if (phepToan.equals("+")) {
						long kq = a + b;
						lblHienThi.setText(String.valueOf(kq));
					} else if (phepToan.equals("-")) {
						long kq = a - b;
						lblHienThi.setText(String.valueOf(kq));
					} else if (phepToan.equals("*")) {
						long kq = a * b;
						lblHienThi.setText(String.valueOf(kq));
					} else if (phepToan.equals("/")) {
						float kq = (float) a / b;
						lblHienThi.setText(String.valueOf(kq));
					} else if (phepToan.equals("%")) {
						float kq = a % b;
						lblHienThi.setText(String.valueOf(kq));
					}
					phepToan = "";
					a = 0;
				}
			}
		});
		btnBang.setFont(new Font("Tahoma", Font.PLAIN, 23));
		panel_1.add(btnBang);
	}
}