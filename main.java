
package cs150.project.pkg1;


public class CS150Project1 {


    public static void main(String[] args) {
        
    System.out.println("\nTesting the Angle class:\n");
        Angle angle0 = new Angle();
        System.out.println("Calling Angle(): " + angle0);
        
        Angle angleAcute = new Angle(45.123);
        System.out.println("Calling Angle(45.123): " + angleAcute);
        
        Angle angleObtuse = new Angle(101, 20, 34);
        System.out.println("Calling Angle(101 20 34): " + angleObtuse);
        
        System.out.println("\nUsing angle: " + angleAcute);
        System.out.println("Calling getDegrees(): " + angleAcute.getDegrees());
        System.out.println("Calling getMinutes(): " + angleAcute.getMinutes());
        System.out.println("Calling getSeconds(): " + String.format("%.1f", angleAcute.getSeconds()));
        
        System.out.println("\nUsing angle: " + angleObtuse);
        System.out.println("Calling getAngle(): " + String.format("%.4f", angleObtuse.getAngle()));
        
        System.out.println("\nChanging angle: " + angleAcute);
        angleAcute.setDegrees(30);
        System.out.println("Calling setDegrees(30): " + angleAcute);
        angleAcute.setMinutes(30);
        System.out.println("Calling setMinutes(30): " + angleAcute);
        angleAcute.setSeconds(30.0);
        System.out.println("Calling setSeconds(30): " + angleAcute);
        
        System.out.println("\nChanging angle: " + angleObtuse);
        angleObtuse.setAngle(167.345);
        System.out.println("Calling setAngle(167.345): " + angleObtuse);
        
        System.out.println("\nChanging angle: " + angleObtuse);
        angleObtuse.setAngle(140, 45, 45.5);
        System.out.println("Calling setAngle(140, 45, 45.5): " + angleObtuse);
        
        Angle addAngle = angleAcute.addAngle(angleObtuse);
        System.out.println("\nComputing " + angleAcute + " + " + angleObtuse);
        System.out.println(" = " + addAngle);
        
        Angle subtractAngle = angleAcute.subtractAngle(angleObtuse);
        System.out.println("\nComputing " + angleAcute + " - " + angleObtuse);
        System.out.println(" = " + subtractAngle);
    }
}

    
  