import java.io.File;

public class DeleteAFile {
    public static void main(String[] args) {
        File myFile  = new File("myFile.txt");
        if (myFile.delete()) {
            // Printing a message to the console indicating that the file with the name returned by
            // `myFile.getName()` has been successfully deleted.
            System.out.println("I have deleted " + myFile.getName());
        }
        else{
            System.out.println("Some error occured");
        }
    }    
}



// import java.util.Date;

// public class DeleteAFile {
//     private int hour;
//     private int minute;
//     private int second;
    
//     public DeleteAFile() {
//         this(System.currentTimeMillis());
//     }
    
//     public DeleteAFile(long elapsedTime) {
        
//         long totalSeconds = elapsedTime / 1000;
//         second = (int)(totalSeconds % 60);
//         long totalMinutes = totalSeconds / 60;
//         minute = (int)(totalMinutes % 60);
//         long totalHours = totalMinutes / 60;
//         hour = (int)(totalHours % 24);
//     }
    
//     public DeleteAFile(int hour, int minute, int second) {
//         this.hour = hour;
//         this.minute = minute;
//         this.second = second;
//     }
    
//     public int getHour() {
//         return hour;
//     }
    
//     public int getMinute() {
//         return minute;
//     }
    
//     public int getSecond() {
//         return second;
//     }
    
//     public void setTime(long elapsedTime) {
        
//         long totalSeconds = elapsedTime / 1000;
//         second = (int)(totalSeconds % 60);
//         long totalMinutes = totalSeconds / 60;
//         minute = (int)(totalMinutes % 60);
//         long totalHours = totalMinutes / 60;
//         hour = (int)(totalHours % 24);
//     }
    
//     public static void main(String[] args) {
//         // Create Time objects
//         DeleteAFile time1 = new DeleteAFile();
//         DeleteAFile time2 = new DeleteAFile(555550000);
//         DeleteAFile time3 = new DeleteAFile(5, 23, 55);
        
//         // Display hour, minute, and second
//         System.out.println("The result for the single argument: " + time2.getHour() + ":" + time2.getMinute() + ":" + time2.getSecond());
//         System.out.println("The result for the no argument: " + time1.getHour() + ":" + time1.getMinute() + ":" + time1.getSecond());
//         System.out.println("The result for the three argument: " + time3.getHour() + ":" + time3.getMinute() + ":" + time3.getSecond());
//     }
// }