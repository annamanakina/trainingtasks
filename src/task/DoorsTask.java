package task;

public class DoorsTask {
    int[] doors = new int[100];

    public void print(){
        for ( int i : doors) {
            System.out.println(i);
        }
    }

    public boolean isOpened(int index){
        return (doors[index]==0);
    }

    public int close(int index){
        return  doors[index] = 0;
    }

    public int open(int index){
        return  doors[index] = 1;
    }

    public void toggle(int k){
        for (int i=k; i < doors.length;  i=(++i) + k){
            System.out.println("i: " + i);
           System.out.println("k: "+k +", i: " + i);
            if (isOpened(i)){
                close(i);
            } else {
                open(i);
            }
        }
    }

    public void pass(int amount) {

        for (int j = 0; j < amount; j++) {
            System.out.println("-------------");
            System.out.println("j: "+j);
            toggle(j);
        }

    }
}
