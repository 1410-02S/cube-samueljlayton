
public class Rubiks {

    //Godd start but is missinga lot of core features

 static String[][] cube = {
     {
     "r","r","r",
     "r","r","r",
     "r","r","r"},  

     {
     "b","b","b",
     "b","b","b",
     "b","b","b"},  

     {
     "o","o","o",
     "o","o","o",
     "o","o","o"}, 

     {
     "g","g","g",
     "g","g","g",
     "g","g","g"},   

     {
     "y","y","y",
     "y","y","y",
     "y","y","y"},   

     {
     "w","w","w",
     "w","w","w",
     "w","w","w"},   

    };

class edgeFace{
     public int currentFace;
    int[] edge1 = new int[4];
    int[] edge2 = new int[4];
    int[] edge3 = new int[4];
    int[] edge4 = new int[4];

    public edgeFace(int face){
        currentFace = face;

        switch(face){
            case 0: 
            edge1[0] = 1;
            edge1[1] = 2;
            edge1[2] = 5;
            edge1[3] = 8;

            edge2[0] = 4;
            edge2[1] = 2;
            edge2[2] = 5;
            edge2[3] = 8;

            edge3[0] = 3;
            edge3[1] = 0;
            edge3[2] = 3;
            edge3[3] = 6;

            edge4[0] = 5;
            edge4[1] = 2;
            edge4[2] = 5;
            edge4[3] = 8;
            break;
            case 1: 
            break;
            case 2: 
            break;
            case 3: 
            break;
            case 4: 
            break;
            case 5: 
            break;
        }
    }

 }

    public void turnFace(int index, String direction){
        edgeFace eFace = new edgeFace(index);

        String[][] copy = new String[6][9];

        for(int i = 0; i < 0; i++){
            for(int j = 0; j < 0; j++){
                copy[i][j] = cube[i][j];
            }
        }
        switch(direction){
            case "c":
            cube[eFace.currentFace][0] = copy[eFace.currentFace][2];
            cube[eFace.currentFace][1] = copy[eFace.currentFace][5];
            cube[eFace.currentFace][2] = copy[eFace.currentFace][8];
            cube[eFace.currentFace][3] = copy[eFace.currentFace][1];
            cube[eFace.currentFace][5] = copy[eFace.currentFace][7];
            cube[eFace.currentFace][6] = copy[eFace.currentFace][0];
            cube[eFace.currentFace][7] = copy[eFace.currentFace][3];
            cube[eFace.currentFace][8] = copy[eFace.currentFace][6];

            cube[eFace.edge1[0]][eFace.edge1[1]] = copy[eFace.edge4[0]][eFace.edge4[1]];
            cube[eFace.edge1[0]][eFace.edge1[2]] = copy[eFace.edge4[0]][eFace.edge4[2]];
            cube[eFace.edge1[0]][eFace.edge1[3]] = copy[eFace.edge4[0]][eFace.edge4[3]];

            cube[eFace.edge2[0]][eFace.edge2[1]] = copy[eFace.edge1[0]][eFace.edge1[1]];
            cube[eFace.edge2[0]][eFace.edge2[2]] = copy[eFace.edge1[0]][eFace.edge1[2]];
            cube[eFace.edge2[0]][eFace.edge2[3]] = copy[eFace.edge1[0]][eFace.edge1[3]];

            cube[eFace.edge3[0]][eFace.edge3[1]] = copy[eFace.edge2[0]][eFace.edge2[1]];
            cube[eFace.edge3[0]][eFace.edge3[2]] = copy[eFace.edge2[0]][eFace.edge2[2]];
            cube[eFace.edge3[0]][eFace.edge3[3]] = copy[eFace.edge2[0]][eFace.edge2[3]];

            cube[eFace.edge4[0]][eFace.edge4[1]] = copy[eFace.edge3[0]][eFace.edge3[1]];
            cube[eFace.edge4[0]][eFace.edge4[2]] = copy[eFace.edge3[0]][eFace.edge3[2]];
            cube[eFace.edge4[0]][eFace.edge4[3]] = copy[eFace.edge3[0]][eFace.edge3[3]];


            break;
            case "cc":
            break;
        }

    }

    public void showCube(){
        
        int ind = 0;   
        for(int x = 0; x < 6; x++)  {
            for(int y = 0; y < 3; y++) {
                    for(int z = 0; z < 3; z++) {
                        System.out.print(cube[x][ind++]);
                        
                }
                System.out.println();
            }
            ind = 0;
            System.out.println();
                
        }
        }
    public static void main(String[] args) throws Exception {
        Rubiks RubiksCube = new Rubiks();
        
       
        RubiksCube.turnFace(0, "c");
        RubiksCube.showCube();


}


}
