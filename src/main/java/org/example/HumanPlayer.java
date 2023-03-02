package org.example;

import java.util.Scanner;

class HumanPlayer
{
    String name;
    char mark;
    HumanPlayer(String name,char mark){
        this.name=name;
        this.mark=mark;
    }

    void makeMove()
    {
        Scanner sc=new Scanner(System.in);
        int row;
        int col;
        do
        {
            TicTacToe.l.println("Enter row and col:");
            row=sc.nextInt();
            col=sc.nextInt();
        }while(!validMove(row,col));
        TicTacToe.placeMark(row,col,mark);
    }
    boolean validMove(int row,int col)
    {
        TicTacToe.l.println("Wrong Input ");
        AssMethods.count--;
        return row>=0 && row<=2 && col>=0 && col<=2 && TicTacToe.board[row][col]==' ';

    }
}
