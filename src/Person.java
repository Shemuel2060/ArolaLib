
/**
 * This is a temporary class used tor testing on the creation
 * of the tables. It is the source of data to be displayed in
 * the tables. It will be converted to the class to store the
 * needed data from the database, which will then be displayed
 * in the tables as required. It should have two implementations,
 * one for the two-column table and another for the 4-column 
 * table in the Explore Books interface.
 * Its data is used in the TableRep.java class.
 */
public class Person{
    private String title;
    private String author;
    private String publisher;
    private String year;

    public Person() {};

    /**
     * This constructor for the data class contains initializes
     * the data object for a 2-column table
     * @param title
     * @param author
     */
    public Person(String title, String author){
        this.title = title;
        this.author = author;
    }
    /**
     * This constructor for the data class initializes the 
     * data object for a 4-column table.
     * @param title
     * @param author
     * @param publisher
     * @param year
     */
    public Person(String title, String author, String pub,String yr){
        this.title = title;
        this.author = author;
        this.publisher = pub;
        this.year = yr;
    }

    public void setTitle(String value){
        this.title = value;
    }
    public String getTitle(){
        return this.title;     
    }

    public void setAuthor(String value){
        this.author = value;
    }
    public String getAuthor(){
        return this.author;     
    }
    public void setPublisher(String value){
        this.publisher = value;
    }
    public String getPublisher(){
        return this.publisher;     
    }
    public void setYear(String value){
        this.year = value;
    }
    public String getYear(){
        return this.year;     
    }
  
}