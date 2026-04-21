
package Cryptography;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.Clipboard;
import javafx.scene.input.ClipboardContent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.paint.Color;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;

public class Cryptography extends Application {
    
    
private void styleComboBox(ComboBox<String> comboBox) {
    Font font = Font.font("Arial", FontWeight.BOLD, 11);
    

    comboBox.setCellFactory(list -> new ListCell<String>() {
        @Override
        protected void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            setText(empty ? null : item);
            setFont(font);  
        }
    });

  
    comboBox.setButtonCell(new ListCell<String>() {
        @Override
        protected void updateItem(String item, boolean empty) {
            super.updateItem(item, empty);
            setText(empty ? null : item);
            setFont(font);  // تطبيق الخط
        }
    });
}

    @Override
    public void start(Stage primaryStage) {
        
        // Load images
        Image image = new Image("Cryptography/bac0.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(1000);
        imageView.setFitWidth(1000);

        Image imagee1 = new Image("Cryptography/bac.png");
        ImageView imageVieww = new ImageView(imagee1);
        imageVieww.setFitHeight(300);
        imageVieww.setFitWidth(300);
        imageVieww.setX(10);
        imageVieww.setY(200);
        
        Image imagee10 = new Image("Cryptography/line.png");
        ImageView imageVieww0 = new ImageView(imagee10);
        imageVieww0.setFitHeight(600);
        imageVieww0.setFitWidth(4);
        imageVieww0.setX(480);
        imageVieww0.setY(0);
        
        Image imagee100 = new Image("Cryptography/line.png");
        ImageView imageVieww00 = new ImageView(imagee100);
        imageVieww00.setFitHeight(600);
        imageVieww00.setFitWidth(4);
        imageVieww00.setX(490);
        imageVieww00.setY(0);
        
        ImageView imageView6 = new ImageView(new Image("Cryptography/enc.png"));
        imageView6.setFitHeight(20);
        imageView6.setFitWidth(25);
        
        ImageView imageView66 = new ImageView(new Image("Cryptography/dec.png"));
        imageView66.setFitHeight(30);
        imageView66.setFitWidth(30);
        

        // Title Text
        Text text1 = new Text(50, 120, "Text File Encryption & Decryption Tool");
        text1.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 22));
        text1.setFill(Color.WHITESMOKE);
        text1.setStroke(Color.DARKSLATEGREY);

        // Message Label
        Label messageLabel = new Label("'Easily encrypt and decrypt your text securely'");
        messageLabel.setFont(Font.font("Arial", 14));
        messageLabel.setTextFill(Color.LIGHTBLUE);
        messageLabel.setLayoutX(120);
        messageLabel.setLayoutY(140);

        // Start Button
        Button start = new Button("Start");
        start.setFont(Font.font("Arial", FontWeight.BOLD, 17));
        start.setLayoutX(220);
        start.setLayoutY(170);
        start.setBackground(new Background(new BackgroundFill(Color.WHITESMOKE, new CornerRadii(20), null)));
        

        // Main Pane
        Pane pane1 = new Pane();
        pane1.getChildren().addAll(imageView, imageVieww, text1, messageLabel, start);

        Scene scene1 = new Scene(pane1, 500, 500);
        primaryStage.setTitle("Start Screen");
        primaryStage.setScene(scene1);
        primaryStage.show();
//--------------------------------------------------------------------------------
        

      // Second Scene - Option Selection
        Image image2 = new Image("Cryptography/bac0.jpg");
        ImageView imageView2 = new ImageView(image);
        imageView2.setFitHeight(1000);
        imageView2.setFitWidth(1000);
        
        Image imagee11 = new Image("Cryptography/bac.png");
        ImageView imageVieww1 = new ImageView(imagee11);
        imageVieww1.setFitHeight(180);
        imageVieww1.setFitWidth(250);
        imageVieww1.setX(5);
        imageVieww1.setY(140);
        

        Button encryptOption = new Button("Encryption" , imageView6);
        encryptOption.setPrefSize(150, 50);
        encryptOption.setLayoutY(90);          
        encryptOption.setLayoutX(65); 
        encryptOption.setFont(Font.font("Arial", FontWeight.BOLD, 17));
        encryptOption.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 

        
        Button decryptOption = new Button("Decryption" , imageView66);
        decryptOption.setPrefSize(150, 50);
        decryptOption.setLayoutY(90);          
        decryptOption.setLayoutX(265); 
        decryptOption.setFont(Font.font("Arial", FontWeight.BOLD, 17));
        decryptOption.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 
        
        // Label asking user to choose
Label chooseLabel = new Label("Please select an option:");
chooseLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
chooseLabel.setTextFill(Color.WHITESMOKE);
chooseLabel.setLayoutX(60);
chooseLabel.setLayoutY(40);

        
        
        
        Pane pane2 = new Pane();
        pane2.getChildren().addAll(imageView2,imageVieww1, chooseLabel,decryptOption, encryptOption );


        Scene scene2 = new Scene(pane2, 500, 300);  
    //--------------------------------------------------------------------------    


        

        
        // Encryption interface
       
       
        Image imagee = new Image("Cryptography/bac.png");
        ImageView imageVieww2 = new ImageView(imagee);
        imageVieww2.setFitHeight(180);
        imageVieww2.setFitWidth(300);
        imageVieww2.setX(10);
        imageVieww2.setY(520);
        

        Image image3 = new Image("Cryptography/bac0.jpg");
        ImageView imageView3 = new ImageView(image3);
        imageView3.setFitHeight(1000);
        imageView3.setFitWidth(1000);
        
         Image keyImage11 = new Image("Cryptography/doc.png"); 
        ImageView keyImageView11 = new ImageView(keyImage11);
        keyImageView11.setFitHeight(25);
        keyImageView11.setFitWidth(20);


        Text encryptLabel = new Text("Encryption");
        encryptLabel.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20));
        encryptLabel.setFill(Color.WHITESMOKE);
        encryptLabel.setStroke(Color.DARKSLATEGREY);



        Button chooseFileEncrypt = new Button("Choose File" , keyImageView11);
        chooseFileEncrypt.setContentDisplay(ContentDisplay.RIGHT);
        chooseFileEncrypt.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        chooseFileEncrypt.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 





        Label selectedFileEncrypt = new Label("No file selected");
        selectedFileEncrypt.setTextFill(Color.RED);
        selectedFileEncrypt.setVisible(false);




        TextArea fileContentArea = new TextArea();
        fileContentArea.setWrapText(true);
        fileContentArea.setPromptText("Contents will appear here...");
        fileContentArea.setPrefHeight(120);
        fileContentArea.setPrefHeight(100);
        fileContentArea.setEditable(false);
        fileContentArea.setFont(Font.font("Verdana", FontWeight.NORMAL, 12));


        // ComboBox for choose the algorithm
        Label algorithmLabel = new Label("Choose Algorithm:");
        algorithmLabel.setTextFill(Color.GAINSBORO);
        ComboBox<String> algorithmBox = new ComboBox<>();
        algorithmBox.getItems().addAll("Morse", "Caeser", "DES");
        algorithmBox.setValue("Caeser");
        algorithmBox.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null)));
        styleComboBox(algorithmBox);

        
        

        HBox algorithmSelectionBox = new HBox(10, algorithmLabel, algorithmBox);
        algorithmSelectionBox.setAlignment(Pos.CENTER);


        TextField keyField = new TextField();
        keyField.setPromptText("Enter encryption key here");
        keyField.setPrefHeight(25); 
        keyField.setPrefWidth(250);  


        Image keyImage = new Image("Cryptography/key0.png"); 
        ImageView keyImageView = new ImageView(keyImage);
        keyImageView.setFitHeight(30);
        keyImageView.setFitWidth(25);


        HBox keyFieldBox = new HBox(10, keyField , keyImageView);
        keyFieldBox.setAlignment(Pos.CENTER);
        keyFieldBox.setVisible(false);  

       
        
        Button encryptButton = new Button("Encrypt", imageView6);
        encryptButton.setFont(Font.font("Arial", FontWeight.BOLD, 13));
        encryptButton.setContentDisplay(ContentDisplay.RIGHT);
        encryptButton.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 


        
        TextArea encryptedTextArea = new TextArea();
        encryptedTextArea.setPromptText("Encrypted text will appear here...");
        encryptedTextArea.setWrapText(true);
        encryptedTextArea.setEditable(false);
        encryptedTextArea.setPrefHeight(100);
        encryptedTextArea.setPrefWidth(550);
        encryptedTextArea.setFont(Font.font("Verdana", FontWeight.NORMAL, 12));


        ImageView imageView0 = new ImageView(new Image("Cryptography/Arrow.png"));
        imageView0.setFitHeight(25);
        imageView0.setFitWidth(35);

        ImageView imageView5 = new ImageView(new Image("Cryptography/Copy.png"));
        imageView5.setFitHeight(25);
        imageView5.setFitWidth(35);

        Button copyButton = new Button("", imageView5);
        copyButton.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 

        Button backButton = new Button("", imageView0);
        backButton.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 

        HBox buttonsBox = new HBox(10, copyButton, backButton);
        buttonsBox.setAlignment(Pos.CENTER);



        algorithmBox.setOnAction(e -> {
            String selected = algorithmBox.getValue();
            keyFieldBox.setVisible(selected.equals("DES") || selected.equals("Caeser"));
        });

        chooseFileEncrypt.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    StringBuilder content = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    fileContentArea.setText(content.toString());
                    selectedFileEncrypt.setVisible(false);
                } catch (IOException ex) {
                    fileContentArea.setText("Error reading file");
                }
            }
        });

        
        
        
encryptButton.setOnAction(e -> {
    String fileText = fileContentArea.getText().trim();
    String algorithm = algorithmBox.getValue();
    String key = keyField.getText().trim();
    boolean error = false;

    if (fileText.isEmpty()) {
        selectedFileEncrypt.setText("No file selected");
        selectedFileEncrypt.setVisible(true);
        error = true;
    }

    if ((algorithm.equals("DES") || algorithm.equals("Caeser")) && key.isEmpty()) {
        encryptedTextArea.setText("Key is required for " + algorithm + " encryption.");
        error = true;
    }

    if (error) return;

    String encryptedText = "";

    try {
        switch (algorithm) {
            case "Caeser":
                int caesarKey = Integer.parseInt(key);
                encryptedText = Ceaser.encrypt(fileText, caesarKey);
                encryptedText = encryptedText.replaceAll(" ", "");
                break;

           
            case "Morse":
                Morse morse = new Morse(fileText);
                        encryptedText = morse.getMorseCode(fileText);
              break;
            case "DES":
                if (key.length() != 8) {
                    encryptedTextArea.setText("DES key must be exactly 8 characters.");
                    return;
                }
                encryptedText = DES.encrypt(fileText, key);
                break;
            default:
                encryptedTextArea.setText("Unsupported algorithm selected.");
                return;
        }
        encryptedTextArea.setText(encryptedText);
    } catch (NumberFormatException ex) {
        encryptedTextArea.setText("The key must be a valid integer for Caesar cipher.");
    } catch (Exception ex) {
        encryptedTextArea.setText("Encryption error: " + ex.getMessage());
    }
});
















        copyButton.setOnAction(e -> {
            String text = encryptedTextArea.getText();
            if (!text.isEmpty()) {
                ClipboardContent content = new ClipboardContent();
                content.putString(text);
                Clipboard.getSystemClipboard().setContent(content);
            }
        });
        
        //--------------------------------------------------------------------------    
        
        Label noteLabelDecrypt1 = new Label("Note: Only .txt files are supported");
noteLabelDecrypt1.setTextFill(Color.GAINSBORO);
noteLabelDecrypt1.setFont(Font.font("Arial", FontWeight.NORMAL, 12));

        
       
        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.setAlignment(Pos.CENTER);
        layout.getChildren().addAll(
                encryptLabel,
                chooseFileEncrypt,
                noteLabelDecrypt1,
                selectedFileEncrypt,
                fileContentArea,
                algorithmSelectionBox,
                keyFieldBox, 
                encryptButton,
                encryptedTextArea,
                buttonsBox
        );

        Pane pane3 = new Pane();
        pane3.getChildren().addAll(imageView3,imageVieww2, layout);

        Scene scene3 = new Scene(pane3, 600, 700);
        
        
        

        
            //----------------------------------------
        
        
        // Decryption interface
       
       
        Image imagee0 = new Image("Cryptography/bac.png");
        ImageView imageVieww20 = new ImageView(imagee0);
        imageVieww20.setFitHeight(200);
        imageVieww20.setFitWidth(300);
        imageVieww20.setX(10);
        imageVieww20.setY(540);
        

        Image image30 = new Image("Cryptography/bac0.jpg");
        ImageView imageView30 = new ImageView(image30);
        imageView30.setFitHeight(1000);
        imageView30.setFitWidth(1000);

        
        
        Text decryptLabe = new Text("Decryption");
        decryptLabe.setFont(Font.font("Arial", FontWeight.BOLD, FontPosture.ITALIC, 20));
        decryptLabe.setFill(Color.WHITESMOKE);
        decryptLabe.setStroke(Color.DARKSLATEGREY);


        
        Button chooseFileEncrypt0 = new Button("Choose File");
        chooseFileEncrypt0.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        chooseFileEncrypt0.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 



        Label selectedFileEncrypt0 = new Label("No file selected");
        selectedFileEncrypt0.setTextFill(Color.RED);
        selectedFileEncrypt0.setVisible(false);
        
        

        TextArea fileContentArea0 = new TextArea();
        fileContentArea0.setPromptText("Contents will appear here...");
        fileContentArea0.setPrefHeight(120);
        fileContentArea0.setEditable(true);
        fileContentArea0.setWrapText(true);

        



        Label algorithmLabel0 = new Label("Choose Algorithm:");
        algorithmLabel0.setTextFill(Color.ALICEBLUE);
        ComboBox<String> algorithmBox0 = new ComboBox<>();
        algorithmBox0.getItems().addAll("Morse", "Caesar", "DES");
        algorithmBox0.setValue("Morse");
        algorithmBox0.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 
        styleComboBox(algorithmBox0);
        

        
        

        HBox algorithmSelectionBox0 = new HBox(10, algorithmLabel0, algorithmBox0);
        algorithmSelectionBox0.setAlignment(Pos.CENTER);


        TextField keyField0 = new TextField();
        keyField0.setPromptText("Enter decryption key here");
        keyField0.setPrefHeight(25); 
        keyField0.setPrefWidth(250);  


        Image keyImage0 = new Image("Cryptography/key0.png"); 
        ImageView keyImageView0 = new ImageView(keyImage0);
        keyImageView0.setFitHeight(30);
        keyImageView0.setFitWidth(25);

        HBox keyFieldBox0 = new HBox(10, keyField0 , keyImageView0);
        keyFieldBox0.setAlignment(Pos.CENTER);
        keyFieldBox0.setVisible(false);  


        
        
        Button decryptButton = new Button("decrypt", imageView66);
        decryptButton.setFont(Font.font("Arial", FontWeight.BOLD, 12));
        decryptButton.setContentDisplay(ContentDisplay.RIGHT);
        decryptButton.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 



        TextArea encryptedTextArea0 = new TextArea();
        encryptedTextArea0.setPromptText("Decrypted text will appear here...");
        encryptedTextArea0.setWrapText(true);
        encryptedTextArea0.setEditable(false);
        encryptedTextArea0.setPrefHeight(100);
        encryptedTextArea0.setPrefWidth(550);



        ImageView imageView4 = new ImageView(new Image("Cryptography/Arrow.png"));
        imageView4.setFitHeight(25);
        imageView4.setFitWidth(35);

        ImageView imageView50 = new ImageView(new Image("Cryptography/Copy.png"));
        imageView50.setFitHeight(25);
        imageView50.setFitWidth(35);

        Button copyButton0 = new Button("", imageView50);
        copyButton0.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 

        Button backButton0 = new Button("", imageView4);
        backButton0.setBackground(new Background(new BackgroundFill(Color.ALICEBLUE, new CornerRadii(20), null))); 

        HBox buttonsBox0 = new HBox(10, copyButton0, backButton0);
        buttonsBox0.setAlignment(Pos.CENTER);



        algorithmBox0.setOnAction(e -> {
            String selected = algorithmBox0.getValue();
            keyFieldBox0.setVisible(selected.equals("DES") || selected.equals("Caesar"));
        });


        chooseFileEncrypt0.setOnAction(e -> {
            FileChooser fileChooser = new FileChooser();
            File file = fileChooser.showOpenDialog(primaryStage);
            if (file != null) {
                try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                    StringBuilder content = new StringBuilder();
                    String line;
                    while ((line = reader.readLine()) != null) {
                        content.append(line).append("\n");
                    }
                    fileContentArea0.setText(content.toString());
                    selectedFileEncrypt0.setVisible(false);
                } catch (IOException ex) {
                    fileContentArea0.setText("Error reading file");
                }
            }
        });

      
        
        
        
decryptButton.setOnAction(e -> {
    String fileText = fileContentArea0.getText().trim();
    String algorithm = algorithmBox0.getValue();
    String key = keyField0.getText().trim();
    boolean error = false;

    if (fileText.isEmpty()) {
        selectedFileEncrypt0.setText("No file selected");
        selectedFileEncrypt0.setVisible(true);
        error = true;
    }

    if ((algorithm.equals("DES") || algorithm.equals("Caesar")) && key.isEmpty()) {
        encryptedTextArea0.setText("Key is required for " + algorithm + " encryption.");
        error = true;
    }

    if (error) return;

    String encryptedText = "";

    try {
        switch (algorithm) {
            case "Caesar":
                int caesarKey = Integer.parseInt(key);
                encryptedText = Ceaser.decrypt(fileText, caesarKey);
                break;
            case "Morse":
                Morse morse = new Morse(fileText);
                        encryptedText = morse.getDecodedText();
              break;
            case "DES":
                if (key.length() != 8) {
                    encryptedTextArea0.setText("DES key must be exactly 8 characters.");
                    return;
                }
                encryptedText = DES.decrypt(fileText, key);
                break;
            default:
                encryptedTextArea0.setText("Unsupported algorithm selected.");
                return;
        }
        encryptedTextArea0.setText(encryptedText);
    } catch (NumberFormatException ex) {
        encryptedTextArea0.setText("The key must be a valid integer for Caesar cipher.");
    } catch (Exception ex) {
        encryptedTextArea0.setText("Encryption error: " + ex.getMessage());
    }
});















        copyButton0.setOnAction(e -> {
            String text = encryptedTextArea0.getText();
            if (!text.isEmpty()) {
                ClipboardContent content = new ClipboardContent();
                content.putString(text);
                Clipboard.getSystemClipboard().setContent(content);
            }
        });
        
        //--------------------------------------------------------------------------    
        
        Label noteLabelDecrypt = new Label("Note: Only .txt files are supported");
noteLabelDecrypt.setTextFill(Color.BEIGE);
noteLabelDecrypt.setFont(Font.font("Arial", FontWeight.NORMAL, 12));



    
        VBox layout1 = new VBox(15);
        layout1.setPadding(new Insets(20));
        layout1.setAlignment(Pos.CENTER);
        layout1.getChildren().addAll(
                decryptLabe,
                chooseFileEncrypt0,
                noteLabelDecrypt,
                selectedFileEncrypt0,
                
                fileContentArea0,
                algorithmSelectionBox0,
                keyFieldBox0, 
                decryptButton,
                encryptedTextArea0,
                buttonsBox0
        );

        Pane pane4 = new Pane();
        pane4.getChildren().addAll(imageView30,imageVieww20, layout1);

        Scene scene4 = new Scene(pane4, 600, 730);
        
        
    

        
        
        
        
        
        
        
    
        start.setOnAction(e->{     
        primaryStage.setScene(scene2); 
        primaryStage.setTitle("Encryption or Decrypption"); 
       ;});
    
    encryptOption.setOnAction(e->{     
        primaryStage.setScene(scene3); 
        primaryStage.setTitle("Encryption"); 
       ;});
    
    decryptOption.setOnAction(e->{     
        primaryStage.setScene(scene4); 
        primaryStage.setTitle("Decryption"); 
       ;});
    
    backButton.setOnAction(e->{     
        primaryStage.setScene(scene2); 
        primaryStage.setTitle("Encryption or Decrypption"); 
       ;});
    
    backButton0.setOnAction(e->{     
        primaryStage.setScene(scene2); 
        primaryStage.setTitle("Encryption or Decrypption"); 
       ;});
    }
    


    public static void main(String[] args) {
        launch(args);
    }
}
