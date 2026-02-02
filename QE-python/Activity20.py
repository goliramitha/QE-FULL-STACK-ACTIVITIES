# Activity 20: Reading Excel Files with pandas

import pandas as pd
from pathlib import Path

# ---- CONFIG: update these as needed ----
excel_path = Path("data/people.xlsx")   # e.g., "people.xlsx" or full path
sheet_name = 0                          # 0 for first sheet, or a sheet name string
email_col = "emails"
first_name_col = "FirstName"
# ----------------------------------------

# Read the Excel file
# pandas will auto-select an engine; specifying engine is optional.
# For .xlsx, 'openpyxl' is commonly used; for .xls, 'xlrd' is typical if available.
df = pd.read_excel(excel_path, sheet_name=sheet_name)

print("=== Preview of Data ===")
print(df.head(), "\n")

# 1) Number of rows and columns
rows, cols = df.shape
print(f"Number of rows: {rows}")
print(f"Number of columns: {cols}\n")

# 2) Print the data in the 'emails' column only
if email_col in df.columns:
    print("=== Emails column ===")
    # Drop NaN for a cleaner print (optional)
    print(df[email_col].dropna().to_string(index=False))
else:
    print(f"[!] Column '{email_col}' not found. Available columns are: {list(df.columns)}")

print()  # spacing

# 3) Sort the data based on 'FirstName' in ascending order and print the data
if first_name_col in df.columns:
