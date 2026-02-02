import pandas as pd


data = {
    "Usernames": ["admin", "Charles", "Deku"],
    "Passwords": ["password", "Charli3", "AllMight"]
}


df = pd.DataFrame(data)


df.to_csv("users.csv", index=False)

print("CSV file written successfully!")
