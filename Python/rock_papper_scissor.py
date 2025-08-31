import random
# Print multiline instruction
print('Winning rules of the game ROCK PAPER SCISSORS are:\n'
      + "Rock vs Paper -> Paper wins \n"
      + "Rock vs Scissors -> Rock wins \n"
      + "Paper vs Scissors -> Scissors wins \n")

# youdict= {1:"R",-1:"P",0:"S"}

for i in range(100):
    print("Enter your choice \n 1 - Rock \n -1 - Paper \n 0 - Scissors \n")
    computer = random.randint(-1,1)
    you = int(input("Enter your choice"))
    if(computer ==-1 and you == -1):
        print("Tie ! Try again")
    
    elif(computer == -1 and you == 1):
        print("Computer Wins")
        # break

    elif(computer == -1 and you == 0):
        print("You Wins")
        # break

    elif(computer == 1 and you == 0):
        print("Computer Wins")
        # break

    elif(computer == 1 and you == -1):
        print("You Wins")
        # break

    elif(computer == 1 and you == 1):
        print("Tie ! Try again")        

    elif(computer == 0 and you == -1):
        print("Computer Wins")
        # break

    elif(computer == 0 and you == 1):
        print("You Wins")
        # break

    elif(computer == 0 and you == 0):
        print("Tie ! Try again")   

    print("\n")
    print("Choices:\n")
    print(f"Computer choice is: {computer} \n")
    print(f"Your choice is: {you} \n")

    print("Do you want to play again? (Y/N)")
    ans = input().lower()
    if ans == 'n':
        break 
        
print("Thank you for playing this game")







    
