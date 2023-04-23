
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


/**
 * This class is used to give a general purpose class
 * for creating the expected tables to display the 
 * data which will be got from the database. 
 * The constructor is overloaded to be able to creat two
 * or 4 table columns. For instance, on the Books Explore
 * interface, four columns are needed.
 */
public class TableRep{


    /**
     * This method is used to create the view
     * for a 2-column table for the data. T
     * @param colOne
     * @param colTwo
     */
    public TableView table2Cols(String colOne,String colTwo){
        TableView view; // view for 2-column table
        view = new TableView();

          //Create table colums
          TableColumn<Person,String> col1= new TableColumn<>(colOne);
          TableColumn<Person,String> col2 = new TableColumn<>(colTwo);
          
          /**
           * The property used relates to the properties names in the 
           * database/ data class.
           */
          col1.setCellValueFactory(new PropertyValueFactory<>("title"));// fCol== first column
          col2.setCellValueFactory(new PropertyValueFactory<>("author"));//sCol==second column

           // add table cols to table view
           view.getColumns().add(col1);
           view.getColumns().add(col2);
       
      
           // add data to table view
           view.getItems().add(new Person("Great Controvery", "Ellen G. White"));
           view.getItems().add(new Person("The Trials of Life", "John Attenborough"));

        return view;

    }
    
    /**
     * This method creates a table view for data display but with four
     * columns: title, author, publisher and year of publication.
     * @param colOne
     * @param colTwo
     * @param colThree
     * @param colFour
     * @return TableView view
     */
    public TableView table4Cols(String colOne,String colTwo,String colThree, String colFour){
        TableView view = new TableView();

          //Create table columss
          TableColumn<Person,String> col1= new TableColumn<>(colOne);
          TableColumn<Person,String> col2 = new TableColumn<>(colTwo);
          TableColumn<Person,String> col3= new TableColumn<>(colThree);
          TableColumn<Person,String> col4 = new TableColumn<>(colFour);
          
          /**
           * The property used relates to the properties names in the 
           * database/ data class.
           */
          col1.setCellValueFactory(new PropertyValueFactory<>("title"));// fCol== first column
          col2.setCellValueFactory(new PropertyValueFactory<>("author"));//sCol==second column
          col3.setCellValueFactory(new PropertyValueFactory<>("publisher"));// fCol== first column
          col4.setCellValueFactory(new PropertyValueFactory<>("year"));//sCol==second column

           // add table cols to table view
           view.getColumns().add(col1);
           view.getColumns().add(col2);
           view.getColumns().add(col3);
           view.getColumns().add(col4);
       
      
           // add data to table view
           view.getItems().add(new Person("The Great Controvery", "Ellen G. White",
           "Review & Herald","1888"));
           view.getItems().add(new Person("The Trials of Life", "John Attenborough",
           "Atetho","1956"));
           view.getItems().add(new Person("The Ministry of Healing", "Ellen G. White",
           "Review & Herald","1915"));
           view.getItems().add(new Person("The Law in Christ's Words", "Samuel Katongole",
           "Arola Inc.","2023"));

        return view;

    }
  

    
}

