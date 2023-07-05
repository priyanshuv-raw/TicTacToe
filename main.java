import java.util.Scanner;

class main{
    public static void main(String[] args){
        char board[]={' ',' ',' ',' ',' ',' ',' ',' ',' '};
        printBoard(board);
        boolean gameOver = false;
        System.out.println("Enter your Moves (1-9)");
        int flag = 0;
        char pawn = ' ';
        while(!gameOver){
            flag = flag%2;
            if(flag==0){
                pawn = 'X';
            }else{
                pawn = 'O';
            }
            System.out.print("Player "+(flag+1)+":");
            Scanner Sc = new Scanner(System.in);
            int move = Sc.nextInt() - 1;
            if(board[move]==' '){
                board[move] = pawn;
            }else{
                System.out.println("Invalid Move!!\nTry Again -->\n");
                continue;
            }
            
            printBoard(board);
            gameOver = check(board);
            isFull(board);
            flag++;
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
        else if(board[7]==board[6] && board[6] == board[8]){
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

    public static void isFull(char[] board){
        int flag = 0;
        for(int i =0;i<9;i++)
        {
            if(board[i]==' '){
                flag = 1;
            }
        }
        if(flag == 0){
            System.out.println("Match Tied!!");
        }
    }

}