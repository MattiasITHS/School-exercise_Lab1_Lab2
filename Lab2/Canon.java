package Lab2;

class Canon {
    public static void fire(int i, int j, Board board){
        /*i och j är en position på board
        board objekt fire(i,j,b);
        if hit == KABOM && x istället för o && returnera boolean true
        if miss == SPLOOSH! && position ersätts med '.' && returnera boolean false
        */
        if(i == 'o'){
            System.out.println("KABOM!");
        } else if (false){
            System.out.println("Sploooosh!");
        }
    }
}
