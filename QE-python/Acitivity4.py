while True:
    p1 = input("Player 1: ")
    p2 = input("Player 2: ")

    if p1 == p2:
        print("Tie")
    elif p1 == "rock" and p2 == "scissors":
        print("Player 1 wins")
    elif p1 == "scissors" and p2 == "paper":
        print("Player 1 wins")
    elif p1 == "paper" and p2 == "rock":
        print("Player 1 wins")
    else:
        print("Player 2 wins")

    again = input("Play another round? (yes/no): ").lower()

    if again == "no":
        print("Thanks for playing!")
        break
