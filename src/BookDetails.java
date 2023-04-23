
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;


public class BookDetails extends SceneGraph{     

    public VBox vb_IdTitAut(){
         //book id field
        Label bkID = new Label("Book ID");
        TextField bkIDenter = new TextField();
        Button btn_ok = new Button("OK"); // for the book id field
        HBox hbBkId = new HBox(10);
        hbBkId.getChildren().addAll(bkID, bkIDenter, btn_ok);

        // title field
        Label title = new Label("Title");
        TextField titleText = new TextField();
        HBox hbTitle = new HBox(10);
        hbTitle.getChildren().addAll(title, titleText);

        // author field
        Label aut = new Label("Author");
        TextField author = new TextField();
        HBox hbAuthor = new HBox(10);
        hbAuthor.getChildren().addAll(aut, author);

        VBox IdTitAut = new VBox(10,hbBkId,hbTitle,hbAuthor);
        IdTitAut.setStyle(
            "-fx-padding: 10;"+"-fx-border-style: solid inside;"+
            "-fx-border-width: 2;"+"-fx-border-insets: 5;"+"-fx-border-radius: 5;"+
            "-fx-border-color: blue;");
        
            return IdTitAut;

    }
    public VBox midVbox(){
            // description field
        Label describe= new Label("Description");
        TextArea description = new TextArea();
        // double wid =description.getWidth();
        // System.out.println(wid); // debugging
        description.setPrefHeight(200);
        description.setPrefWidth(400);
        HBox hbdesc = new HBox(10);
        hbdesc.getChildren().addAll(describe,description);

        // category
        Label cat= new Label("Category");
        TextField category = new TextField();
        HBox hbCat = new HBox(10);
        hbCat.getChildren().addAll(cat, category);

        // Publisher
        Label pub= new Label("Publisher");
        TextField publisher = new TextField();
        HBox hbPub = new HBox(10);
        hbPub.getChildren().addAll(pub, publisher);

        // year of publication
        Label pubYear= new Label("Year");
        TextField yr = new TextField();
        HBox hbYr = new HBox(10);
        hbYr.getChildren().addAll(pubYear, yr);

        // pages of book
        Label pg= new Label("Pages");
        TextField numPages = new TextField();
        HBox hbPages= new HBox(10);
        hbPages.getChildren().addAll(pg, numPages);

        // Language
        Label lang= new Label("Language");
        TextField language = new TextField();
        HBox hbLang = new HBox(10);
        hbLang.getChildren().addAll(lang, language);

        // Book type
        Label bkType= new Label("Book Type");
        TextField bk_type = new TextField();
        HBox hbBKtype = new HBox(10);
        hbBKtype.getChildren().addAll(bkType, bk_type);

        // date added
        Label addedDate= new Label("Date Added");
        TextField DateAdded = new TextField();
        HBox hbDate= new HBox(10);
        hbDate.getChildren().addAll(addedDate, DateAdded);       

        VBox midVbx = new VBox(10);        
        midVbx.setStyle(
            "-fx-padding: 10;"+"-fx-border-style: solid inside;"+
            "-fx-border-width: 2;"+"-fx-border-insets: 5;"+"-fx-border-radius: 5;"+
            "-fx-border-color: blue;");
        midVbx.getChildren().addAll(hbdesc,hbCat,hbPub, hbYr,hbPages,hbLang,hbBKtype,hbDate);
        // midVbx.getStylesheets().add("/styles/midVbx.css"); // fails to work - why?
        return midVbx;
    }       
    @Override
    public Pane sceneGraph() {
        GridPane rootGrid = new GridPane();
        rootGrid.setHgap(20);
        rootGrid.setVgap(10);


        HBox hbtop = Menus.hbMenus();   
        VBox titIdAut = this.vb_IdTitAut();     
        VBox mid = this.midVbox();
        VBox search = SceneGraph.srch();
        VBox imShow = SceneGraph.imViewer();

         // book details scene graph
        rootGrid.add(hbtop, 1, 1);
        rootGrid.add(titIdAut, 1, 2, 1,3);
        rootGrid.add(mid,1,6);
        rootGrid.add(search,2,4, 2,1);
        rootGrid.add(imShow,2,6,1,3);

        return rootGrid;    
        
    }
}