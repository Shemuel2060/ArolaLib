import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;


/**
 * This class is used to create the contents of the scene for the explore
 * books button. 
 */
public class ExpBooks extends SceneGraph{

    VBox imShow = SceneGraph.imViewer(); // displaying book cover.
    VBox srch = SceneGraph.srch();
    TableView table = new TableView();
    

    @Override
    public Pane sceneGraph() {
        GridPane rootGrid = new GridPane();
        rootGrid.setHgap(20);
        rootGrid.setVgap(10);

        HBox hbtop = Menus.hbMenus();   

        

        // initialize a 2-columntable for data display
        TableRep tabRep = new TableRep();

        // table = tabRep.table2Cols("Title","Author");
        table = tabRep.table4Cols("Title","Author",
        "Publisher","Year of Publication");

        rootGrid.add(hbtop,1,1);
        rootGrid.add(srch,2,4, 2,1);
        rootGrid.add(imShow,2,6,1,3);
        rootGrid.add(table,1,4,1,6); // spans 6 rows
        return rootGrid;
    }
    
}
