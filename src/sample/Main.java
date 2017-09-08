package sample;

// Homework 1: JavaGUI - Books
// Student Name: Bradley Chippi
// Course: CS421, Fall 2017
// Instructor: Dr. Cho
// Date finished: 9-5-2017
// Program description:


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * Main starts the GUI up and brings you to the main screen. At the main screen, you can
 * add sales or see all the previous sales.
 *
 * @author Bradley Chippi
 * @version 1.0 March 29, 2017
 */

public class Main extends Application {

    /**
     * starts up the main GUI, reads the db to read the items
     * and then you have the option to add sales or see all previous sales.
     *
     * @param   stage      Stage
     */

    @Override
    public void start(Stage stage) {
        Book[] books = setData();
        System.out.println(books[0].getKeywords());
        Group root = new Group();
        Scene scene = new Scene(root, 250, 250);
        stage.setScene(scene);
        stage.setTitle("Search your Bookstore");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        scene.setRoot(grid);

        final TextField author = new TextField();
        author.setPromptText("Author");
        author.setPrefColumnCount(10);
        author.getText();
        GridPane.setConstraints(author, 0, 0);
        grid.getChildren().add(author);

        final TextField title = new TextField();
        title.setPromptText("Title");
        GridPane.setConstraints(title, 0, 1);
        grid.getChildren().add(title);

        final TextField isbn = new TextField();
        isbn.setPrefColumnCount(15);
        isbn.setPromptText("ISBN");
        GridPane.setConstraints(isbn, 0, 2);
        grid.getChildren().add(isbn);

        final TextField keywords = new TextField();
        keywords.setPrefColumnCount(15);
        keywords.setPromptText("Keywords");
        GridPane.setConstraints(keywords, 0, 3);
        grid.getChildren().add(keywords);

        final TextField course = new TextField();
        course.setPrefColumnCount(15);
        course.setPromptText("Course");
        GridPane.setConstraints(course, 0, 4);
        grid.getChildren().add(course);

        Button submit = new Button("Find");
        GridPane.setConstraints(submit, 0, 5);
        grid.getChildren().add(submit);


        final Label label = new Label();
        GridPane.setConstraints(label, 0, 6);
        GridPane.setColumnSpan(label, 2);
        grid.getChildren().add(label);

        submit.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                    label.setText("You have not left a comment.");

            }
        });


        stage.show();
    }

    public static Book[] setData(){
        Book[] books = new Book[8];
        books[0] = new Book();
        return books;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
