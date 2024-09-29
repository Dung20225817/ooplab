import javax.swing.JOptionPane;
public class ChoosingOption {
    public static void main(String[] args) {
        //int option=JOptionPane.showConfirmDialog(null,"Do you want to change to the first class ticket");
        Object[] options = { "Yes", "No" };
        int choice = JOptionPane.showOptionDialog(null, 
            "Do you want to change to the first class ticket",  // Message
            "select option",       // Title
            JOptionPane.YES_NO_OPTION,   // Option type
            JOptionPane.QUESTION_MESSAGE,// Message type
            null,                   // Icon
            options,                     // Custom options
            options[0]);
        JOptionPane.showMessageDialog(null,"you have chosen: "+(choice ==0?"Yes":"No"));
        System.exit(0);
    }
}

/* -nếu user chọn "Cancel" trong Dialog màn hình sẽ hiển thị "No*/
