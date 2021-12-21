package ProjectPBO2021;
import java.util.Scanner;

import java.util.Scanner;
import GUI.RecordGui;
import Controller.AllObjectController;
public class ProjectPBO2021 {
    public static Scanner input = new Scanner(System.in);
    public static void main(String[]args){
        dataDefault();
        RecordGui start = new RecordGui();
    }
    static void dataDefault(){
        AllObjectController.recordcontroller.InsertRecord("Jatim", 19, 15, 39);
        AllObjectController.recordcontroller.InsertRecord("Jateng", 21, 15,81);
        AllObjectController.recordcontroller.InsertRecord("Jabar", 23, 16, 77);
        AllObjectController.recordcontroller.InsertRecord("Sulteng",31,17,40);
        AllObjectController.recordcontroller.InsertRecord("Sumut", 22, 17, 76);
    }
}