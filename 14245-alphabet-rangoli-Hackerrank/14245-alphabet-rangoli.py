def print_rangoli(size):
    # your code goes here
    import string
    alpha = string.ascii_lowercase
    width = 4 * size - 3
    lines = []
    for i in range(size - 1, -1, -1):
        letters = alpha[i:size]
        row = "-".join(letters[::-1] + letters[1:])
        lines.append(row.center(width, "-"))
    result = lines[:-1] + lines[::-1]
    print("\n".join(result))


# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna