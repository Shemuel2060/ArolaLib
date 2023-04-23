
import java.io.FileInputStream;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;



public class ArolaLib extends Application{
    
    public static void main(String[] args) {
        launch(args);
    }
    // instances of all pages
    BookDetails bkDetailsPage = new BookDetails();
    ExpBooks expBks = new ExpBooks();

    

    // Scene bkDetailsScene, expBooksScene, issueReturnScene, issueDetailsScene, MenuScene; 


    @Override
    public void start(Stage arg0) throws Exception {

        Stage stage = SceneGraph.createWindow();
        // create scene for book details
        Pane rootPane = bkDetailsPage.sceneGraph(); // to be included in an event handler for the button

        // Pane rootPane = expBks.sceneGraph(); // to be included in an event handler for the button

         // scene
         Scene scene = new Scene(rootPane, 900,700);
        //  Scene scene = new Scene(rootGrid, 900,700);
         scene.getStylesheets().add(ArolaLib.class.getResource("/styles/arolaLib.css").toExternalForm());
     
 
         stage.setScene(scene);
         stage.show();
         
        
    }
   
}