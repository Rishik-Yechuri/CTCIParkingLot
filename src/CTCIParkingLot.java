public class CTCIParkingLot {
    public static void main(String[] args) {
        try
        {
            CTCIParkingLot obj = new CTCIParkingLot();
            obj.run (args);
        }
        catch (Exception e)
        {
            e.printStackTrace ();
        }
    }
    public void run(String[] args){
        ParkingLot newParkingLot = new ParkingLot(5,8);
        newParkingLot.parkCar(2,1);
        newParkingLot.parkCar(2,5);
        newParkingLot.parkCar(4,7);
        System.out.println(newParkingLot.checkIfSpotTaken(0,4));
        System.out.println(newParkingLot.checkIfSpotTaken(2,5));
        newParkingLot.unparkCar(4,7);
        System.out.println(newParkingLot.checkIfSpotTaken(4,7));
    }
}
class ParkingLot{
    int[][] parkingLot;
    public ParkingLot(int numOfRows,int numOfCols){
        parkingLot = new int[numOfRows][numOfCols];
    }
    public void parkCar(int row,int col){
        parkingLot[row][col] = 1;
    }
    public void unparkCar(int row,int col){
        parkingLot[row][col] = 0;
    }
    public boolean checkIfSpotTaken(int row,int col){
        return parkingLot[row][col] == 1;
    }
}