package school.mjc.stage0.loops.task5;

public class Triangle {
    public void printTriangle(int cathetusLength) {
        for (int i = cathetusLength - 1; i >= 0; i--){
            for (int j = i; j < cathetusLength; j++){
                System.out.print("8");
            }
            System.out.println("");
        }
    }
}
