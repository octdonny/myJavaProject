//Daniel Mengistie
// March 22, 2018
//Programming Principles II

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.util.Random;
import java.util.Collections;
import java.util.ArrayList;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;
import javafx.animation.FadeTransition;
import javafx.animation.Timeline;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

public class myJavaProject extends Application
{
   Scene home, author, game;
   @Override
   public void start(Stage primaryStage)
   {
      //Create a pane and set its properties
      GridPane pane = new GridPane();
      pane.setAlignment(Pos.CENTER);
      pane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
      pane.setHgap(5.5);
      pane.setVgap(5.5);
      
      //Create a scene and place it in the stage
      game = new Scene(pane, 400, 475);   
      
      //Views Menu
      Menu viewsMenu = new Menu("Views");
      
      //Menu Items
      MenuItem homeMenu = new MenuItem("Main / Home");
      MenuItem authorMenu = new MenuItem("Author");
      MenuItem gameMenu = new MenuItem("Game");
      
      //Menu Items Action
      homeMenu.setOnAction(e -> primaryStage.setScene(home));
      authorMenu.setOnAction(e -> primaryStage.setScene(author));
      gameMenu.setOnAction(e -> primaryStage.setScene(game));
      
      //Adding Menu Items
      viewsMenu.getItems().add(homeMenu);
      viewsMenu.getItems().add(authorMenu);
      viewsMenu.getItems().add(gameMenu);     
      
      //Main Menu Bar
      MenuBar menuBar = new MenuBar();
      menuBar.getMenus().addAll(viewsMenu);
      
      //MenuBar added
      pane.add(menuBar, 0, 0);
      
      //Yellow Image
      ImageView imageView = new ImageView("https://upload.wikimedia.org/wikipedia/commons/4/44/WO_Yellow.jpg");
      imageView.setFitHeight(100);
      imageView.setFitWidth(100);
      ImageView imageView2 = new ImageView("https://upload.wikimedia.org/wikipedia/commons/4/44/WO_Yellow.jpg");
      imageView2.setFitHeight(100);
      imageView2.setFitWidth(100);
      
      //Blue Image
      ImageView imageView3 = new ImageView("https://lh3.googleusercontent.com/ccPAXz7Y9lQJqF9MaGc_koCjkvKvjD3XH4s8u9e5QZKUjh5BmX6cM7GKGnq-3aVwRw=w300");
      imageView3.setFitHeight(100);
      imageView3.setFitWidth(100);
      ImageView imageView4 = new ImageView("https://lh3.googleusercontent.com/ccPAXz7Y9lQJqF9MaGc_koCjkvKvjD3XH4s8u9e5QZKUjh5BmX6cM7GKGnq-3aVwRw=w300");
      imageView4.setFitHeight(100);
      imageView4.setFitWidth(100);
      
      //Gray Image
      ImageView imageView5 = new ImageView("http://www.caesarceramicsusa.com/images/prodotti/solid-color-grey.jpg");
      imageView5.setFitHeight(100);
      imageView5.setFitWidth(100);
      ImageView imageView6 = new ImageView("http://www.caesarceramicsusa.com/images/prodotti/solid-color-grey.jpg");
      imageView6.setFitHeight(100);
      imageView6.setFitWidth(100);
      
      //Orange Image
      ImageView imageView7 = new ImageView("http://shop.fieldsfabrics.com/assets/images/scmchg012s_solid.jpg");
      imageView7.setFitHeight(100);
      imageView7.setFitWidth(100);
      ImageView imageView8 = new ImageView("http://shop.fieldsfabrics.com/assets/images/scmchg012s_solid.jpg");
      imageView8.setFitHeight(100);
      imageView8.setFitWidth(100);
      
      //Red Image
      ImageView imageView9 = new ImageView("https://www.flagsimporter.com/pub/media/wysiwyg/content-media/red.jpg");
      imageView9.setFitHeight(100);
      imageView9.setFitWidth(100);
      ImageView imageView10 = new ImageView("https://www.flagsimporter.com/pub/media/wysiwyg/content-media/red.jpg");
      imageView10.setFitHeight(100);
      imageView10.setFitWidth(100);
      
      //Green Image
      ImageView imageView11 = new ImageView("https://greencastlecabinetry.com/wp-content/uploads/2015/07/RB7024-001.jpg");
      imageView11.setFitHeight(100);
      imageView11.setFitWidth(100);
      ImageView imageView12 = new ImageView("https://greencastlecabinetry.com/wp-content/uploads/2015/07/RB7024-001.jpg");
      imageView12.setFitHeight(100);
      imageView12.setFitWidth(100);
      
      //Button
      Button btRestart = new Button("restart");
      
      //Place nodes in the pane
      pane.add(imageView, 0, 1);
      pane.add(imageView2, 0, 2);
      
      pane.add(imageView3, 0, 3);
      pane.add(imageView4, 0, 4);
      
      pane.add(imageView5, 1, 1);
      pane.add(imageView6, 1, 2);
      
      pane.add(imageView7, 1, 3);
      pane.add(imageView8, 1, 4);
      
      pane.add(imageView9, 2, 1);
      pane.add(imageView10, 2, 2);
      
      pane.add(imageView11, 2, 3);
      pane.add(imageView12, 2, 4);
      
      pane.add(btRestart, 3, 1);
      GridPane.setHalignment(btRestart, HPos.CENTER);
        
      btRestart.setOnAction(new EventHandler<ActionEvent>()
      {
         @Override
         public void handle(ActionEvent e)
         {
            //Random ArrayList / Shuffling  
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            arrayList.add(1);
            arrayList.add(2);
            arrayList.add(3);
            arrayList.add(4);
            arrayList.add(5);
            arrayList.add(6);
            Collections.shuffle(arrayList);
            
            ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
            arrayList2.add(1);
            arrayList2.add(2);
            arrayList2.add(3);
            arrayList2.add(4);
            arrayList2.add(5);
            arrayList2.add(6);
            Collections.shuffle(arrayList2);
            
            //Resetting Images to shuffled images     
            imageView.setImage(new Image("colors/" + arrayList.get(0) + ".jpg"));
            imageView2.setImage(new Image("colors/" + arrayList.get(1) + ".jpg"));
            imageView3.setImage(new Image("colors/" + arrayList.get(2) + ".jpg"));
            imageView4.setImage(new Image("colors/" + arrayList.get(3) + ".jpg"));
            imageView5.setImage(new Image("colors/" + arrayList.get(4) + ".jpg"));
            imageView6.setImage(new Image("colors/" + arrayList.get(5) + ".jpg"));
            imageView7.setImage(new Image("colors/" + arrayList2.get(0) + ".jpg"));
            imageView8.setImage(new Image("colors/" + arrayList2.get(1) + ".jpg"));
            imageView9.setImage(new Image("colors/" + arrayList2.get(2) + ".jpg"));
            imageView10.setImage(new Image("colors/" + arrayList2.get(3) + ".jpg"));
            imageView11.setImage(new Image("colors/" + arrayList2.get(4) + ".jpg"));
            imageView12.setImage(new Image("colors/" + arrayList2.get(5) + ".jpg"));
            
            // Create rectangles and add to pane
            Rectangle r1 = new Rectangle(17, 42.5, 100, 100);
            r1.setManaged(false);
            r1.setStroke(Color.BLACK);
            r1.setFill(Color.BLACK);
            pane.getChildren().add(r1);
            
            Rectangle r2 = new Rectangle(17, 149, 100, 100);
            r2.setManaged(false);
            r2.setStroke(Color.BLACK);
            r2.setFill(Color.BLACK);
            pane.getChildren().add(r2);
      
            Rectangle r3 = new Rectangle(17, 255.5, 100, 100);
            r3.setManaged(false);
            r3.setStroke(Color.BLACK);
            r3.setFill(Color.BLACK);
            pane.getChildren().add(r3);
            
            Rectangle r4 = new Rectangle(17, 362, 100, 100);
            r4.setManaged(false);
            r4.setStroke(Color.BLACK);
            r4.setFill(Color.BLACK);
            pane.getChildren().add(r4);
               
            Rectangle r5 = new Rectangle(123.5, 42.5, 100, 100);
            r5.setManaged(false);
            r5.setStroke(Color.BLACK);
            r5.setFill(Color.BLACK);
            pane.getChildren().add(r5);
      
            Rectangle r6 = new Rectangle(123.5, 149, 100, 100);
            r6.setManaged(false);
            r6.setStroke(Color.BLACK);
            r6.setFill(Color.BLACK);
            pane.getChildren().add(r6);
            
            Rectangle r7 = new Rectangle(123.5, 255.5, 100, 100);
            r7.setManaged(false);
            r7.setStroke(Color.BLACK);
            r7.setFill(Color.BLACK);
            pane.getChildren().add(r7);
            
            Rectangle r8 = new Rectangle(123.5, 362, 100, 100);
            r8.setManaged(false);
            r8.setStroke(Color.BLACK);
            r8.setFill(Color.BLACK);
            pane.getChildren().add(r8);
            
            Rectangle r9 = new Rectangle(230, 42.5, 100, 100);
            r9.setManaged(false);
            r9.setStroke(Color.BLACK);
            r9.setFill(Color.BLACK);
            pane.getChildren().add(r9);
            
            Rectangle r10 = new Rectangle(230, 149, 100, 100);
            r10.setManaged(false);
            r10.setStroke(Color.BLACK);
            r10.setFill(Color.BLACK);
            pane.getChildren().add(r10);
            
            Rectangle r11 = new Rectangle(230, 255.5, 100, 100);
            r11.setManaged(false);
            r11.setStroke(Color.BLACK);
            r11.setFill(Color.BLACK);
            pane.getChildren().add(r11);
            
            Rectangle r12 = new Rectangle(230, 362, 100, 100);
            r12.setManaged(false);
            r12.setStroke(Color.BLACK);
            r12.setFill(Color.BLACK);
            pane.getChildren().add(r12);  
            
            // Apply a fade transition to ellipse
            FadeTransition ft1 = new FadeTransition(Duration.millis(5000), r1);
            ft1.setFromValue(0.1);
            ft1.setToValue(1.0);
            ft1.play();
            
            FadeTransition ft2 = new FadeTransition(Duration.millis(5000), r2);
            ft2.setFromValue(0.1);
            ft2.setToValue(1.0);
            ft2.play();
            
            FadeTransition ft3 = new FadeTransition(Duration.millis(5000), r3);
            ft3.setFromValue(0.1);
            ft3.setToValue(1.0);
            ft3.play(); 
            
            FadeTransition ft4 = new FadeTransition(Duration.millis(5000), r4);
            ft4.setFromValue(0.1);
            ft4.setToValue(1.0);
            ft4.play(); 
            
            FadeTransition ft5 = new FadeTransition(Duration.millis(5000), r5);
            ft5.setFromValue(0.1);
            ft5.setToValue(1.0);
            ft5.play(); 
            
            FadeTransition ft6 = new FadeTransition(Duration.millis(5000), r6);
            ft6.setFromValue(0.1);
            ft6.setToValue(1.0);
            ft6.play(); 
            
            FadeTransition ft7 = new FadeTransition(Duration.millis(5000), r7);
            ft7.setFromValue(0.1);
            ft7.setToValue(1.0);
            ft7.play(); 
            
            FadeTransition ft8 = new FadeTransition(Duration.millis(5000), r8);
            ft8.setFromValue(0.1);
            ft8.setToValue(1.0);
            ft8.play(); 
            
            FadeTransition ft9 = new FadeTransition(Duration.millis(5000), r9);
            ft9.setFromValue(0.1);
            ft9.setToValue(1.0);
            ft9.play(); 
            
            FadeTransition ft10 = new FadeTransition(Duration.millis(5000), r10);
            ft10.setFromValue(0.1);
            ft10.setToValue(1.0);
            ft10.play(); 
            
            FadeTransition ft11 = new FadeTransition(Duration.millis(5000), r11);
            ft11.setFromValue(0.1);
            ft11.setToValue(1.0);
            ft11.play(); 
            
            FadeTransition ft12 = new FadeTransition(Duration.millis(5000), r12);
            ft12.setFromValue(0.1);
            ft12.setToValue(1.0);
            ft12.play();
            
            //rectangle being clicked events
            r1.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r1.setFill(Color.TRANSPARENT);
                }
            });
            
            r2.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r2.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r3.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r3.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r4.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r4.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r5.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r5.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r6.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r6.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r7.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r7.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r8.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r8.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r9.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r9.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r10.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r10.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r11.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r11.setFill(Color.TRANSPARENT);
                }
            }); 
            
            r12.setOnMouseClicked(new EventHandler<MouseEvent>()
            {
                public void handle(MouseEvent e)
                {
                  r12.setFill(Color.TRANSPARENT);
                }
            }); 
         }
      });      
      //-------------------------------------------------------------------------
      //Home View
      
      //Text animation
      Text text2 = new Text(20, 100, "Hello! This is my Memory Game");
      text2.setFont(Font.font("Comic Sans", FontWeight.BOLD, 23));
      text2.setFill(Color.WHITE);
      text2.setOnMouseDragged(e -> 
      {
         text2.setX(e.getX());
         text2.setY(e.getY());
      });
      
      Text text3 = new Text(15, 400, "You have 5 seconds to remember the placement.");
      text3.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
      text3.setFill(Color.WHITE);    
      
      //Home View Pane
      BorderPane pane3 = new BorderPane();
      pane3.setCenter(text2);
      pane3.setBottom(text3);
      pane3.setStyle("-fx-border-color: orange; -fx-background-color: purple;");
      home = new Scene(pane3, 400, 475);
      text3.setManaged(false);
      text2.setManaged(false); 
      
      //Views Menu
      Menu viewsMenu3 = new Menu("Views");
      
      //Menu Items
      MenuItem homeMenu3 = new MenuItem("Main / Home");
      MenuItem authorMenu3 = new MenuItem("Author");
      MenuItem gameMenu3 = new MenuItem("Game");
      
      //Menu Items Action
      homeMenu3.setOnAction(e -> primaryStage.setScene(home));
      authorMenu3.setOnAction(e -> primaryStage.setScene(author));
      gameMenu3.setOnAction(e -> primaryStage.setScene(game));
      
      //Adding Menu Items
      viewsMenu3.getItems().add(homeMenu3);
      viewsMenu3.getItems().add(authorMenu3);
      viewsMenu3.getItems().add(gameMenu3);   
      
      //Main Menu Bar
      MenuBar menuBar3 = new MenuBar();
      menuBar3.getMenus().addAll(viewsMenu3);
      
      //Set Menu
      pane3.setTop(menuBar3);  
      //-------------------------------------------------------------------------
      //Author View
      
      //Author View Text
      Text text4 = new Text(115, 75, "Author: Daniel Mengistie");
      text4.setFont(Font.font("Times New Roman", FontWeight.BOLD, 25));
      text4.setFill(Color.WHITE);
      text4.setUnderline(true);
      
      Text text5 = new Text(15, 375, "- I am currently a sophmore at Kennesaw State University.");
      text5.setFont(Font.font("Times New Roman", 19));
      text5.setFill(Color.WHITE);
      
      Text text6 = new Text(15, 425, "- I play the piano and occasionally enjoy playing basketball.");
      text6.setFont(Font.font("Times New Roman", 19));
      text6.setFill(Color.WHITE);
      
      //Pane
      BorderPane pane4 = new BorderPane();
      GridPane gridPane = new GridPane();
      author = new Scene(pane4, 490, 475);
      pane4.setLeft(gridPane);
      
      pane4.setCenter(text4);
      pane4.setBottom(text5);
      pane4.setRight(text6);
      pane4.setStyle("-fx-border-color: orange; -fx-background-color: purple;");
      text4.setManaged(false);
      text5.setManaged(false);
      text6.setManaged(false);
      
      //Image
      ImageView imageViewFace = new ImageView("images/face.jpg");
      imageViewFace.setFitHeight(230);
      imageViewFace.setFitWidth(144);
      
      gridPane.add(imageViewFace, 0, 0);
      imageViewFace.setManaged(false);
      imageViewFace.setLayoutX(45);
      imageViewFace.setLayoutY(85);
      
      //Video
      Media media = new Media("file:///C:/Users/octdo/Documents/myJavaProject/intro2.mp4");      
      MediaPlayer mediaPlayer = new MediaPlayer(media);
      MediaView mediaView = new MediaView(mediaPlayer);
      mediaView.setFitHeight(300);
      mediaView.setFitWidth(350);
      
      Button btPlay = new Button("play");
      btPlay.setOnAction(e ->
      {
         mediaPlayer.seek(Duration.ZERO);
         mediaPlayer.play();
      });
      
      gridPane.add(mediaView, 1, 0);
      mediaView.setManaged(false);
      mediaView.setLayoutX(200);
      mediaView.setLayoutY(85);
      gridPane.add(btPlay, 2, 0);
      
      //Views Menu
      Menu viewsMenu4 = new Menu("Views");
      
      //Menu Items
      MenuItem homeMenu4 = new MenuItem("Main / Home");
      MenuItem authorMenu4 = new MenuItem("Author");
      MenuItem gameMenu4 = new MenuItem("Game");
      
      //Menu Items Action
      homeMenu4.setOnAction(e -> primaryStage.setScene(home));
      authorMenu4.setOnAction(e -> primaryStage.setScene(author));
      gameMenu4.setOnAction(e -> primaryStage.setScene(game));
      
      //Adding Menu Items
      viewsMenu4.getItems().add(homeMenu4);
      viewsMenu4.getItems().add(authorMenu4);
      viewsMenu4.getItems().add(gameMenu4);   
      
      //Main Menu Bar
      MenuBar menuBar4 = new MenuBar();
      menuBar4.getMenus().addAll(viewsMenu4);
      
      //Set Menu
      pane4.setTop(menuBar4);   
      //-------------------------------------------------------------------------
      
      //Set the stage title
      primaryStage.setTitle("myGame");
      //Place the scene in the stage
      primaryStage.setScene(home);
      //Display the stage
      primaryStage.show();    
   }

   //Main method
   public static void main(String[] args)
   {
      //Launch application
      Application.launch(args);
   }
}