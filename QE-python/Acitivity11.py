
fruits = {
    "apple": 50,
    "banana": 20,
    "orange": 30,
    "mango": 70,
    "grapes": 60
}

fruit_name = input("Enter the name of the fruit you want to check: ").lower()


if fruit_name in fruits:
    print(f"{fruit_name.capitalize()} is available and costs {fruits[fruit_name]} per kg.")
else:
    print(f"Sorry, {fruit_name.capitalize()} is not available.")
