import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * This abstract class contains the methods for creating
 * the window. The method srch() returns the search section, the
 * method imView() returns the image view of the book
 * cover page, while the method createWindow() sets 
 * up the stage. All these three are concrete methods.
 * The only abstract method is the sceneGraph() method which
 * is to be overridden/implemented by subclasses.
 */
public abstract class SceneGraph { // use in ArolaLib.java

    public static VBox srch(){
        // search book
    VBox search = new VBox(10);
    TextField srch = new TextField();
    srch.setPrefWidth(250);
    Button search_btn = new Button("Search Book");
    search.getChildren().addAll(srch, search_btn);

    return search;
}

    static Text srchText;
    /**
     * This methods creates the space where book covers are displayed.
     * A text is sometimes printed which shows especially when the book is 
     * not in the database.
     * @return
     */
    public static VBox imViewer(){
            // second colum componenets
        // image viewer
        VBox imDisp = new VBox(10);
        try{
        FileInputStream input = new FileInputStream("src/images/gc1888_.jpg");
        Image image = new Image(input);
        ImageView imView = new ImageView(image);

        srchText = new Text();
        srchText.setText("Book cover shown"); // temporary

        imDisp.getChildren().addAll(imView,srchText);        
    }  
    catch(FileNotFoundException e)  {
        srchText.setText("Book cover not found");
    }
    return imDisp;
    
}
    
/**
 * This method sets up the stage, the window title, min width and
 * height, andl also initial location once opened. 
 * @return Stage object
 */    
public static Stage createWindow(){
        Stage stage = new Stage();
        stage.setTitle("Arola Library");

         // stage settings
         stage.setX(100);
         stage.setY(10);
         stage.setMinHeight(500);
         stage.setMinWidth(600);

         return stage;
    }
    /**
     * To be implemented in subclasses.  Defines the main layout to be used on
     * the stage/scene as implemented in each interface. Any pane type can be used. 
     */
    public abstract Pane sceneGraph();    
}
