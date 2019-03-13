

package cs150.project.pkg1;

public class Angle {
    private static final int MINUTES_PER_DEGREE = 60;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final int SECONDS_PER_DEGREE = 3600;
    private static final char DEGREE_SYMBOL = '\u00BA';
    
    private int degrees;
    private int minutes;
    private double seconds;
    
   
    public Angle() {
        this(0.0);
    } 
    public Angle(double fractionalDegrees) {
        set(fractionalDegrees);
    } 
    public Angle(int degrees, int minutes, double seconds) {
        set(degrees, minutes, seconds);
    } 
     public int getDegrees() {
        return degrees;
    } 
            
    public int getMinutes() {
        return minutes;
    } 
    
    public double getSeconds() {
        return seconds;
    } 
    
    public double getAngle() {
        return ((double) getDegrees() +
                (double) getMinutes() / MINUTES_PER_DEGREE +
                getSeconds() / SECONDS_PER_DEGREE);
    }
    
    
    
    private void set(int degrees, int minutes, double seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    } 
    
    private void set(double fractionalDegrees) {
        degrees = (int) fractionalDegrees;
        fractionalDegrees = Math.abs(fractionalDegrees);
        fractionalDegrees -= Math.abs(degrees);
        
        fractionalDegrees *= MINUTES_PER_DEGREE;
        minutes = (int) fractionalDegrees;
        fractionalDegrees -= minutes;
        
        fractionalDegrees *= SECONDS_PER_MINUTE;
        seconds = fractionalDegrees ;
    } 
    public void setDegrees(int degrees) {
        setAngle(degrees, getMinutes(), getSeconds());
    } 
    
    public void setMinutes(int minutes) {
        setAngle(getDegrees(), minutes, getSeconds());
    } 
    
    public void setSeconds(double seconds) {
        setAngle(getDegrees(), getMinutes(), seconds);
    } 
    
     public void setAngle(double fractionalDegrees) {
        set(fractionalDegrees);
    } 
    
    public void setAngle(int degrees, int minutes, double seconds) {
        set(degrees, minutes, seconds);
    } 
    
    public Angle addAngle(Angle angle) {
        double addDegrees = this.getAngle() + angle.getAngle();
           
        return new Angle(addDegrees);
    } 
    
    public Angle subtractAngle(Angle angle) {
        double subDegrees = this.getAngle() - angle.getAngle();
        
        return new Angle(subDegrees);
    } 
   
    @Override
    public String toString() {
        return getDegrees() + String.valueOf(DEGREE_SYMBOL) +
               " " + getMinutes() + "'" +
               " " + String.format("%.1f", getSeconds()) + "\"";
    } 
}
