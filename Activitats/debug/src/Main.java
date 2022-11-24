public class Main {
    public static void main(String[] args) {
        int [] notes = {2,3,4,6,2,4,200,40,5};
        for (int i=0; i< notes.length; i++) {
            //System.out.println(notes[i]);
            if (i%2==0) {
                i++;
            }
            for (int j=i; j < notes.length; j++) {
                System.out.println("i:" + i + " j:" + j + " Nota:" + notes[notes[i]]*notes[j]);
            }
        }
    }
}