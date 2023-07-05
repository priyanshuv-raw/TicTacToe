//This program has the computer to play on the other side.

import java.util.Random;
import java.util.Scanner;

class mainComp{
    public static void main(String[] args){
        char board[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
        printBoard(board);
        boolean gameOver = false;
        System.out.println("Enter your Moves (1-9)");
        boolean chance = true;

        while(!gameOver){
            if(chance == true){    
                System.out.print("Your Move:");
                Scanner Sc = new Scanner(System.in);
                int move = Sc.nextInt() - 1;
                if(board[move]==' '){
                    board[move] = 'X';
                }else{
                    System.out.println("Invalid Move!!\nTry Again -->\n");
                    continue;
                }
                chance = false;
            }
            else{
                Random rand = new Random();
                int move = rand.nextInt(9);
                
               // System.out.println("Comp Move: "+(move+1));
                if(board[move]==' '){
                    board[move] = 'O';
                    System.out.println("Comp Move: "+(move+1));
                }else{
                    // System.out.println("Invalid Move!!\nTry Again -->\n");
                    continue;
                }
                if(!isFull(board)){
                    chance = true;
                }
            }
            printBoard(board);
            gameOver = check(board);
            if(gameOver!=true)
            {isFull(board);}
        }
    }

    public static void printBoard(char[] board){
            System.out.println("+---+---+---+");
            System.out.println("| "+board[0]+" | "+board[1]+" | "+board[2]+" |");
            System.out.println("+---+---+---+");
            System.out.println("| "+board[3]+" | "+board[4]+" | "+board[5]+" |"); 
            System.out.println("+---+---+---+"); 
            System.out.println("| "+board[6]+" | "+board[7]+" | "+board[8]+" |"); 
            System.out.println("+---+---+---+");
        }
    
    public static boolean check(char[] board){
        if(board[0]==board[1] && board[2] == board[0]){
            if(board[0]=='X'){
                System.out.println("Player 1 Won\nGame Over");
                return true;
            }
            else if(board[0]=='O'){
                System.out.println("Player 2 Won\nGame Over");
                return true;
            }
            
        }
        else if(board[3]==board[4] && board[3] == board[5]){
            if(board[3]=='X'){
                System.out.println("Player 1 Won\nGame Over");
                return true;
            }
            else if(board[3]=='O'){
                System.out.println("Player 2 Won\nGame Over");
                return true;
            }
        }
        else if(board[7]==board[6] && board[7] == board[8]){
            if(board[6]=='X'){
                System.out.println("Player 1 Won\nGame Over");
                return true;
            }
            else if(board[6]=='O'){
                System.out.println("Player 2 Won\nGame Over");
                return true;
            }
        }
        else if(board[0]==board[3] && board[0] == board[6]){
            if(board[0]=='X'){
                System.out.println("Player 1 Won\nGame Over");
                return true;
            }
            else if(board[0]=='O'){
                System.out.println("Player 2 Won\nGame Over");
                return true;
            }
        }
        else if(board[1]==board[4] && board[1] == board[7]){
            if(board[1]=='X'){
                System.out.println("Player 1 Won\nGame Over");
                return true;
            }
            else if(board[1]=='O'){
                System.out.println("Player 2 Won\nGame Over");
                return true;
            }
        }
        if(board[2]==board[5] && board[2] == board[8]){
            if(board[2]=='X'){
                System.out.println("Player 1 Won\nGame Over");
                return true;
            }
            else if(board[2]=='O'){
                System.out.println("Player 2 Won\nGame Over");
                return true;
            }
        }
        if(board[0]==board[4] && board[0] == board[8]){
            if(board[0]=='X'){
                System.out.println("Player 1 Won\nGame Over");
                return true;
            }
            else if(board[0]=='O'){
                System.out.println("Player 2 Won\nGame Over");
                return true;
            }
        }
        else if(board[4]==board[2] && board[4] == board[6]){
            if(board[4]=='X'){
                System.out.println("Player 1 Won\nGame Over");
                return true;
            }
            else if(board[4]=='O'){
                System.out.println("Player 2 Won\nGame Over");
                return true;
            }
        }
        return false;
    }

    public static boolean isFull(char[] board){
        int flag = 0;
        for(int i =0;i<9;i++)
        {
            if(board[i]==' '){
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Match Tied!!");
            return true;
        }
        return false;
    }
    

}