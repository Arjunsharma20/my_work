# Tic Tac Toe game in Python

# Function to print the Tic Tac Toe board
def print_board(board):
    for i in range(3):
        print(" | ".join(board[i]))
        if i < 2:
            print("---------")

# Function to check for a winner
def check_winner(board, player):
    # Check rows, columns, and diagonals
    for i in range(3):
        if all([board[i][j] == player for j in range(3)]) or all([board[j][i] == player for j in range(3)]):
            return True
    
    if all([board[i][i] == player for i in range(3)]) or all([board[i][2-i] == player for i in range(3)]):
        return True
    
    return False

# Function to check if the board is full
def is_full(board):
    return all([board[i][j] != " " for i in range(3) for j in range(3)])

# Main function to play the game
def play_game():
    board = [[" " for _ in range(3)] for _ in range(3)]
    current_player = "X"

    while True:
        print_board(board)
        
        # Get player input
        try:
            row, col = map(int, input(f"Player {current_player}, enter row and column (0-2) separated by space: ").split())
        except ValueError:
            print("Invalid input. Please enter two integers.")
            continue
        
        if row < 0 or row > 2 or col < 0 or col > 2:
            print("Invalid position. Please enter values between 0 and 2.")
            continue
        
        if board[row][col] != " ":
            print("Cell already occupied. Try again.")
            continue
        
        # Place the player's move
        board[row][col] = current_player

        # Check for a winner
        if check_winner(board, current_player):
            print_board(board)
            print(f"Player {current_player} wins!")
            break

        # Check for a tie
        if is_full(board):
            print_board(board)
            print("It's a tie!")
            break

        # Switch players
        current_player = "O" if current_player == "X" else "X"

# Run the game
if __name__ == "__main__":
    play_game()
