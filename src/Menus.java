import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

/**
 * This class creates the top menu bar which is common for all the different
 * interfaces for each button.
 */
public class Menus {
    /**
     * This method creates the top buttons on each interface which when clicked 
     * change the scene to another interface.
     * @param bkDetails
     * @param expBooks
     * @param bkIssueReturn
     * @param isDetails
     * @param bkMenu
     * @return HBox of the top buttons
     */
    public static HBox hbMenus(){
        Button expBooks = new Button();
        expBooks.setPrefWidth(100);
        expBooks.setText("Explore Book");
        expBooks.setTextFill(Color.BLUE);

        Button bkDetails = new Button();
        bkDetails.setPrefWidth(100);
        bkDetails.setText("Book Details");
        bkDetails.setTextFill(Color.BLUE);  

        Button bkIssueReturn = new Button();
        bkIssueReturn.setPrefWidth(100);
        bkIssueReturn.setText("Issue/Return");
        bkIssueReturn.setTextFill(Color.BLUE);        // button props

       Button isDetails = new Button();
        isDetails.setPrefWidth(100);
        isDetails.setText("Issue Details");
       isDetails.setTextFill(Color.BLUE);

       Button bkMenu = new Button();
        bkMenu.setPrefWidth(100);
        bkMenu.setText("Menu");
        bkMenu.setTextFill(Color.BLUE);
        HBox hbtop = new HBox(5);
        hbtop.getChildren().addAll(bkDetails, expBooks, bkIssueReturn, isDetails,bkMenu);
        hbtop.getStylesheets().add("/styles/hbtop.css");
        
        return hbtop;
    }
    
}
