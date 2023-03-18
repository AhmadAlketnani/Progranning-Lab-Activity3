import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.awt.event.ActionEvent;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class LabActivity3Controller  implements Initializable{
    @FXML
    private Slider slider;

    @FXML
    private MenuItem item2;

    @FXML
    private MenuItem item1;

    @FXML
    private Label checkBoxLabel;

    @FXML
    private SeparatorMenuItem separatorFile;

    @FXML
    private RadioMenuItem radioItem1Edit;

    @FXML
    private RadioButton radioButton1;

    @FXML
    private RadioButton radioButton2;

    @FXML
    private Label comboBoxLabel;

    @FXML
    private CheckBox checkBox4;

    @FXML
    private MenuItem save;

    @FXML
    private CheckBox checkBox3;

    @FXML
    private HBox checkBoxHbox;

    @FXML
    private CheckBox checkBox6;

    @FXML
    private CheckBox checkBox5;

    @FXML
    private ListView<String> checkBoxListView;

    @FXML
    private SeparatorMenuItem separatorEdit;

    @FXML
    private CheckBox checkBox7;

    @FXML
    private MenuBar menuBar;

    @FXML
    private VBox checkBoxes;

    @FXML
    private CheckBox checkBox2;

    @FXML
    private HBox hBox2;

    @FXML
    private HBox hBox1;

    @FXML
    private CheckBox checkBox1;

    @FXML
    private RadioMenuItem radioItem2Edit;

    @FXML
    private ChoiceBox<String> comboBox;

    @FXML
    private VBox ageSlider;

    @FXML
    private Menu subMenu;

    @FXML
    private Label genderLabel;

    @FXML
    private HBox comboBoxhBox;

    @FXML
    private ListView<String> listView1;

    @FXML
    private ListView<String> listView2;

    @FXML
    private CheckMenuItem item1Edit;

    @FXML
    private RadioMenuItem radioItem3Edit;

    @FXML
    private Menu editMenu;

    @FXML
    private ToggleGroup toggleGroup1;

    @FXML
    private ToggleGroup toggleGroup;

    @FXML
    private CheckMenuItem item2Edit;

    @FXML
    private HBox genderHbox;

    @FXML
    private Label age;

    @FXML
    private MenuItem open;

    @FXML
    private TextArea textArea;

    public LabActivity3Controller() {
    }

    public CheckBox getCheckBox1() {
        return checkBox1;
    }

    @FXML
    void checkBox1Event(ActionEvent event) {
        CheckBox checkBox = ((CheckBox) event.getSource());
        if (checkBox.isSelected()) {
            checkBoxListView.getItems().add(checkBox.getText());
        } else {
            checkBoxListView.getItems().remove(checkBox.getText());
        }

    }


    public void checkBox1Event(javafx.event.ActionEvent actionEvent) {
        events(actionEvent);
    }

    void events(javafx.event.ActionEvent actionEvent) {
        CheckBox checkBox = ((CheckBox) actionEvent.getSource());
        if (checkBox.isSelected()) {
            checkBoxListView.getItems().add(checkBox.getText());
        } else {
            checkBoxListView.getItems().remove(checkBox.getText());
        }
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String[] departments = {"Computer Science", "Software Development", "IT", "Mobile Computing", "Multimedia"};
        ObservableList<String> observableList = FXCollections.observableArrayList(departments);
        comboBox.getItems().addAll(observableList);
        listView1.getItems().addAll(observableList);
        listView2.getItems().addAll(observableList);
        listView1.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        listView2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

    }

    public void ageEvent(MouseEvent mouseEvent) {
        slider.valueProperty().addListener((observable, oldValue, newValue) -> {
            textArea.setText("oldValue: " + oldValue + "\nnewValue: " + newValue);
        });
    }

    public void fileEvent(javafx.event.ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        File file=fileChooser.showOpenDialog(new Stage());
        String filePath = file.getPath();
        String fileName = file.getName();
        textArea.setText("filePath: " + filePath + "\nFileName: " + fileName);
    }
}
