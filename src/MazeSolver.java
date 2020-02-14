/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lamon
 */
public class MazeSolver {

    public static void printMaze(char[][] map){
        // for each row
        for(int i = 0; i < map.length; i++){
            // for each column
            for(int j = 0; j < map[i].length; j++){
                // print the grid location
                System.out.print("" + map[i][j] + " ");
            }
            // move to next line
            System.out.println();
        }
    }
    
    public static boolean solveMaze(char[][] maze, int startRow, int startCol){
        // base cases
        // moved off the maze
        if(startRow < 0 || startCol < 0 || startRow >= maze.length || startCol >= maze[0].length){
            return false;
        }

        // already been here
        else if(maze[startRow][startCol] == '.'){
            return false;
        }
            
        // if wall found
        else if(maze[startRow][startCol] == 'w'){
            return false;
        }
        // goal found
        else if(maze[startRow][startCol] == 'g'){
            System.out.println("Solution found:");
            printMaze(maze);
            return true;
        }
        //mark location as visited
        maze[startRow][startCol] = '.';
        // try moving in all directions
        boolean up = solveMaze(maze, startRow-1, startCol);
        boolean right = solveMaze(maze, startRow, startCol+1);
        boolean down = solveMaze(maze, startRow+1, startCol);
        boolean left = solveMaze(maze, startRow, startCol-1);
        
        //is there a solution?
        if(up || right || down || left){
            return true;
        }else{
            // no solution
            // unmark this location
            maze[startRow][startCol] = '_';
            // no solution
            return false;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 6x6 grid
        char[][] maze = new char[6][6];
        // creating the maze
        // row 1
        maze[0][0] = '_';
        maze[0][1] = 'w';
        maze[0][2] = '_';
        maze[0][3] = '_';
        maze[0][4] = '_';
        maze[0][5] = 'w';
        // row 2
        maze[1][0] = '_';
        maze[1][1] = 'w';
        maze[1][2] = '_';
        maze[1][3] = 'w';
        maze[1][4] = 'w';
        maze[1][5] = 'w';
        
        // row 3
        maze[2][0] = '_';
        maze[2][1] = 'w';
        maze[2][2] = '_';
        maze[2][3] = '_';
        maze[2][4] = '_';
        maze[2][5] = '_';
        
        // row 4
        maze[3][0] = '_';
        maze[3][1] = '_';
        maze[3][2] = '_';
        maze[3][3] = '_';
        maze[3][4] = 'w';
        maze[3][5] = '_';
        
        // row 5
        maze[4][0] = '_';
        maze[4][1] = '_';
        maze[4][2] = '_';
        maze[4][3] = 'w';
        maze[4][4] = '_';
        maze[4][5] = '_';
        
        // row 6
        maze[5][0] = '_';
        maze[5][1] = 'w';
        maze[5][2] = '_';
        maze[5][3] = 'w';
        maze[5][4] = 'g';
        maze[5][5] = 'w';
        
        printMaze(maze);
        solveMaze(maze,0,4);
    }
    
}
