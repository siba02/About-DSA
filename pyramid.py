print("\nCentered Pyramid")
rows = 5  # Number of rows for the pyramid

for i in range(rows):
    # Calculate the number of stars in the current row
    stars = '*' *(2 * i + 1)
    # Print the stars centered within the width of the pyramid
    print(f'{stars:^{2 * rows - 1}}')
