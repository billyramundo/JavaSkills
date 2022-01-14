import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AlphaPath {
    public String hasPath(String[] maze) {
        String[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        String lets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        List<String> letList = Arrays.asList(letters);

        for(int i =0; i < maze.length; i++){
            String[] idx = maze[i].split("");
            for(int j =0; j < idx.length;j++){
                int lInd = lets.indexOf(idx[j]);
                if(!letList.contains(idx[j]) || idx[j].equals("Z")) continue;
                if(maze.length == 1){
                    if(j == 0){
                        if(!idx[j+1].equals(letters[lInd + 1])) return "NO";
                    }
                    else if(j == idx.length - 1){
                        if(!idx[j-1].equals(letters[lInd + 1])) return "NO";
                    }
                    else {
                        if(!idx[j + 1].equals(letters[lInd + 1]) && !idx[j - 1].equals(letters[lInd + 1])) return "NO";
                    }
                }
                else if(i == maze.length-1){
                    if(j == idx.length - 1) {
                        String[] pIdx = maze[i - 1].split("");
                        if (!idx[j - 1].equals(letters[lInd + 1]) && !pIdx[j].equals(letters[lInd + 1])) return "NO";
                    }
                }
                else if(j == 0 && i ==0){
                    String[] nIdx = maze[i + 1].split("");
                    if(idx[j+1].equals(letters[lInd + 1]) && !nIdx[j].equals(letters[lInd + 1])) return "NO";
                }
                else if(j ==0){
                    String[] nIdx = maze[i + 1].split("");
                    String[] pIdx = maze[i - 1].split("");
                    if(!idx[j+1].equals(letters[lInd + 1]) && !nIdx[j].equals(letters[lInd + 1]) && !pIdx[j].equals(letters[lInd +1])) return "NO";
                }
                else if(j == idx.length -1){
                    String[] nIdx = maze[i + 1].split("");
                    String[] pIdx = maze[i - 1].split("");
                    if(!idx[j-1].equals(letters[lInd + 1]) && !nIdx[j].equals(letters[lInd + 1]) && !pIdx[j].equals(letters[lInd +1])) return "NO";
                }
                else {
                    String[] nIdx = maze[i + 1].split("");
                    String[] pIdx = maze[i - 1].split("");
                    if (!idx[j + 1].equals(letters[lInd + 1]) && !idx[j - 1].equals(letters[lInd + 1]) && !nIdx[j].equals(letters[lInd + 1]) && !pIdx[j].equals(letters[lInd + 1])) {
                        return "NO";
                    }
                }
            }
        }
        return "YES";
    }
}
