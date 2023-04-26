import javax.swing.JOptionPane;

public class ShowTwoNumbers{
	public static void main(String[] args){
		String first_string_num, second_string_num;
		String strNotification = "You've just entered: ";

		first_string_num = JOptionPane.showInputDialog(null,
			"Please input the first number: ",
			"Input the first number",
			JOptionPane.INFORMATION_MESSAGE);
		strNotification += first_string_num + " and ";

		second_string_num = JOptionPane.showInputDialog(null,
			"Please input the second number: ",
			"Input the second number",
			JOptionPane.INFORMATION_MESSAGE);
		strNotification += second_string_num;

		JOptionPane.showMessageDialog(null, strNotification,
			"Show two numbers", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}