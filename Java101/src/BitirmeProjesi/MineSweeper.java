package BitirmeProjesi;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
        static Scanner scanner = new Scanner(System.in);
        static Random rand = new Random();
        int row;
        int col;
        int mineCount;
        char[][] board;
        char[][] visibleBoard;



    MineSweeper(int row, int col) {
        while ((row < 2) || (col < 2)) {
            System.out.println("Tablo boyutu en az 2x2 olmadılır tekrar deneyin !");
            break;
        }

        this.row = row;
        this.col = col;

        mineCount = (row * col) / 4;
        board = new char[row][col];
        visibleBoard = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = '-';
                visibleBoard[i][j] = '-';
            }
        }

        int minesPlaced = 0;
        while (minesPlaced < mineCount) {
            int r = rand.nextInt(row);
            int c = rand.nextInt(col);

            if (board[r][c] != '*') {
                board[r][c] = '*';
                minesPlaced++;
            }
        }

        int cellsToOpen = (row * col) - mineCount;
        boolean gameOver = false;

        while (!gameOver) {
            printBoard(visibleBoard);

            System.out.print("Satır girin: ");
            int r = scanner.nextInt();
            System.out.print("Sütun girin: ");
            int c = scanner.nextInt();

            if (r < 0 || r >= row || c < 0 || c >= col) {
                System.out.println("Geçersiz konum! Tekrar deneyin.");
                continue;
            }

            if (visibleBoard[r][c] != '-') {
                System.out.println("Bu konum zaten açıldı. Başka bir yer seçin.");
                continue;
            }

            if (board[r][c] == '*') {
                System.out.println("Mayına bastınız! Oyun bitti.");
                printBoard(board);
                gameOver = true;
            } else {
                int mineCountAround = countMines(board, r, c);
                visibleBoard[r][c] = (char) (mineCountAround + '0');
                cellsToOpen--;

                if (cellsToOpen == 0) {
                    System.out.println("Tebrikler, tüm güvenli hücreleri açtınız! Oyunu kazandınız.");
                    printBoard(board);
                    gameOver = true;
                }
            }
        }

    }

    public static int countMines(char[][] board, int r, int c) {
        int count = 0;
        int[] dx = { -1, -1, -1, 0, 0, 1, 1, 1 };
        int[] dy = { -1, 0, 1, -1, 1, -1, 0, 1 };

        for (int i = 0; i < 8; i++) {
            int newRow = r + dx[i];
            int newCol = c + dy[i];

            if (newRow >= 0 && newRow < board.length &&
                    newCol >= 0 && newCol < board[0].length &&
                    board[newRow][newCol] == '*') {
                count++;
            }
        }

        return count;
    }

    public static void printBoard(char[][] board) {
        System.out.println("Tahta:");
        for (char[] row : board) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

}
