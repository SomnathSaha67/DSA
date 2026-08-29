

def wrap(string, max_width):
    lst=[]
    for i in range(0, len(string), max_width):
        lst.append(string[i:i+max_width])
    return "\n".join(lst)


# Synced seamlessly with LeetHub Pro
# Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
# Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna